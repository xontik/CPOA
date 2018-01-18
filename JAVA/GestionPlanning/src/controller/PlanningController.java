package controller;

import App.AdminGUI;
import dao.ArbitreDAO;
import dao.EquipeRamasseurDAO;
import dao.JoueurDAO;
import dao.JourneeDAO;
import entity.Arbitre;
import entity.EquipeRamasseur;
import entity.Joueur;
import entity.Journee;
import model.PlanningTableModel;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Vector;

/**
 * Created by xontik on 18/01/2018.
 */
public class PlanningController {
    private AdminGUI adminGUI;
    private Arbitre selectedArbitre;

    public PlanningController(AdminGUI adminGui){
        this.adminGUI = adminGui;
    }
    public void init() {
        PlanningTableModel model = new PlanningTableModel();


        JourneeDAO journeeDAO = new JourneeDAO();

        Vector<String> colName = new Vector<>();
        colName.add("Journée");
        for(int j = 8; j < 20; j+=2){
            colName.add(String.valueOf(j) + "h");
        }
        model.setColumnIdentifiers(colName);

        ArrayList<Journee> journees = journeeDAO.getAll();
        int colCount = model.getColumnCount();

        for (Journee journee:journees) {
            String name = journee.getDateJournee().getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.FRANCE);
            name += " " + String.valueOf(journee.getDateJournee().getDayOfMonth());
            name += "/" + String.valueOf(journee.getDateJournee().getMonthValue());

            Vector<String> row = new Vector<>(model.getColumnCount());
            row.add(name);

            for( int i = 1; i < colCount;i++){
                row.add("");
            }
            model.addRow(row);
        }

        model.setColumnIdentifiers(colName);


        adminGUI.getTable1().setModel(model);
        adminGUI.getTable1().setCellSelectionEnabled(true);
        adminGUI.getTable1().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);




        adminGUI.getRetourMenuButton1().addActionListener(e -> {
            ((CardLayout)adminGUI.getPanel1().getLayout()).show(adminGUI.getPanel1(),"MenuCard");
        });

        adminGUI.getDeselectionnerButton1().addActionListener(e -> {
            adminGUI.getTable1().clearSelection();
        });

        adminGUI.getSimpelRadio().addActionListener(e -> {
            if(adminGUI.getSimpelRadio().isSelected()){
                adminGUI.getComboBox6().setEnabled(false);
                adminGUI.getComboBox7().setEnabled(false);
            }
        });
        adminGUI.getDoubleRadioButton().addActionListener(e -> {

            if(adminGUI.getDoubleRadioButton().isSelected()){
                adminGUI.getComboBox6().setEnabled(true);
                adminGUI.getComboBox7().setEnabled(true);
            }
        });
        adminGUI.getDoubleRadioButton().setSelected(true);


        ArbitreDAO arbitreDAO = new ArbitreDAO();

        ArrayList<Arbitre> arbitres = arbitreDAO.getAll();
        for (Arbitre arbitre : arbitres ) {
            adminGUI.getComboBox1().addItem(arbitre);
            adminGUI.getComboBox2().addItem(arbitre);

        }

        JoueurDAO joueurDao = new JoueurDAO();

        ArrayList<Joueur> joueurs = joueurDao.getAll();
        for (Joueur joueur : joueurs ) {
            adminGUI.getComboBox4().addItem(joueur);
            adminGUI.getComboBox5().addItem(joueur);
            adminGUI.getComboBox6().addItem(joueur);
            adminGUI.getComboBox7().addItem(joueur);
        }

        EquipeRamasseurDAO equipeRamasseurDAO = new EquipeRamasseurDAO();
        ArrayList<EquipeRamasseur> equipes = equipeRamasseurDAO.getAll();
        for(EquipeRamasseur equipe: equipes){
            adminGUI.getComboBox3().addItem(equipe);
        }

    }
}
