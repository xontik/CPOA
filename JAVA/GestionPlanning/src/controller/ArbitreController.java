package controller;

import App.AdminGUI;
import dao.ArbitreDAO;
import dao.NationaliteDAO;
import entity.Arbitre;
import model.ArbitreListModel;
import entity.Nationalite;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by xontik on 16/01/2018.
 */
public class ArbitreController {

    private AdminGUI adminGUI;
    private Arbitre selectedArbitre;

    public ArbitreController(AdminGUI adminGui){
        this.adminGUI = adminGui;
    }
    public void init(){
        NationaliteDAO natDao = new NationaliteDAO();
        ArrayList<Nationalite> nats = natDao.getAll();
        ArbitreDAO arbitreDao = new ArbitreDAO();

        ArrayList<Arbitre> arbitres = arbitreDao.getAll();

        ArbitreListModel listModel = new ArbitreListModel();
        for (Nationalite nat:nats ) {
            adminGUI.getNationaliteComboBox().addItem(nat);
        }
        for(Arbitre arbitre: arbitres){
            listModel.addElement(arbitre);
        }
        JList arbitreList = adminGUI.getList1();
        arbitreList.setModel(listModel);
        arbitreList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        arbitreList.setCellRenderer((list, value, index, isSelected, cellHasFocus) -> {
            Arbitre arbitre = (Arbitre)value;
            String code = arbitre.getNationalite().getShortName();
            String path = "/images/"+code+".png";
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(path));
            Image image = imageIcon.getImage(); // transform it
            Image newimg = image.getScaledInstance(32, 32,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
            imageIcon = new ImageIcon(newimg);
            JLabel cell = new JLabel();
            cell.setOpaque(true);
            cell.setIcon(imageIcon);
            cell.setText(arbitre.toString());
            cell.setForeground(Color.black);
            if (isSelected) {
                cell.setBackground(Color.GRAY);
            } else {
                cell.setBackground(Color.WHITE);
            }
            return cell;
        });


        arbitreList.addListSelectionListener(e -> {
            if(!e.getValueIsAdjusting()) {
                selectedArbitre = (Arbitre) arbitreList.getSelectedValue();
                if(selectedArbitre == null){
                    adminGUI.getAjouterButton().setText("Ajouter");
                    adminGUI.getTextField1().setText("");
                    adminGUI.getTextField2().setText("");
                    adminGUI.getNationaliteComboBox().setSelectedItem(null);

                    adminGUI.getArbitreType().clearSelection();
                    selectedArbitre = null;
                } else {
                    adminGUI.getTextField1().setText(selectedArbitre.getNom());
                    adminGUI.getTextField2().setText(selectedArbitre.getPrenom());
                    adminGUI.getNationaliteComboBox().setSelectedItem(selectedArbitre.getNationalite());

                    if(selectedArbitre.getType().equals("ligne")){
                        adminGUI.getLigneRadioButton().setSelected(true);
                    }else{
                        adminGUI.getChaiseRadioButton().setSelected(true);
                    }
                    adminGUI.getAjouterButton().setText("Modifier");
                }

            }


        });

        adminGUI.getAjouterButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean adding = false;
                if(selectedArbitre == null){
                    adding = true;
                    selectedArbitre = new Arbitre();
                }
                selectedArbitre.setNom(adminGUI.getTextField1().getText());
                selectedArbitre.setPrenom(adminGUI.getTextField2().getText());
                selectedArbitre.setNationalite((Nationalite) adminGUI.getNationaliteComboBox().getSelectedItem());
                //TODO verification non vide
                if(adminGUI.getLigneRadioButton().isSelected()){
                    selectedArbitre.setType("ligne");
                }else{
                    selectedArbitre.setType("chaise");
                }

                if(selectedArbitre == null){
                    selectedArbitre = new Arbitre();
                }
                if(adding){
                    ((ArbitreListModel)adminGUI.getList1().getModel()).addElement(selectedArbitre);
                    adminGUI.getList1().setSelectedValue(selectedArbitre,true);
                }else{
                    ((ArbitreListModel)adminGUI.getList1().getModel()).setElementAt(selectedArbitre,adminGUI.getList1().getSelectedIndex());
                }

            }

        });

        adminGUI.getRetourMenuButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.print("test");
                ((CardLayout)adminGUI.getPanel1().getLayout()).show(adminGUI.getPanel1(),"MenuCard");

            }
        });

        adminGUI.getSupprimerButton().addActionListener(e -> {
            ((ArbitreListModel)arbitreList.getModel()).removeElement(selectedArbitre);

        });
        adminGUI.getValiderLesDonnéesButton().addActionListener( e -> {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {

                    ArbitreDAO arbitreDAO = new ArbitreDAO();
                    boolean updateok = arbitreDAO.update(((ArbitreListModel)arbitreList.getModel()).getAllElements());

                    if(!updateok){
                        System.out.println("Erreur BD");
                    }
                }
            });
        });
        adminGUI.getDeselectionerButton().addActionListener(e -> {arbitreList.clearSelection();});

    }


}
