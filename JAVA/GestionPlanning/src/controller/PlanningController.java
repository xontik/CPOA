package controller;

import App.AdminGUI;
import dao.*;
import entity.*;
import model.MatchListModel;
import model.PlanningTableModel;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
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

            Vector<Object> row = new Vector<>(model.getColumnCount());
            row.add(name);

            for( int i = 1; i < colCount;i++){
                row.add(new Vector<Match>());
            }
            model.addRow(row);
        }

        model.setColumnIdentifiers(colName);


        adminGUI.getTable1().setModel(model);
        adminGUI.getTable1().setCellSelectionEnabled(true);
        adminGUI.getTable1().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        adminGUI.getTable1().setDefaultRenderer(Vector.class, (table, value, isSelected, hasFocus, row, column) -> {
            Vector<Match> matches = (Vector<Match>) value;
            int taille = matches.size();
            JLabel cell = new JLabel();
            cell.setOpaque(true);
            cell.setForeground(Color.black);
            cell.setHorizontalAlignment(SwingConstants.CENTER);
            if (isSelected) {
                cell.setBackground(Color.GRAY);
                cell.setText(String.valueOf(taille));
            } else {
                if(taille == 0){
                    cell.setBackground(Color.WHITE);
                }
                else if (taille < 6){
                    cell.setBackground(Color.GREEN);
                    cell.setText(String.valueOf(taille));
                }else{
                    cell.setBackground(Color.RED);
                    cell.setText(String.valueOf(taille));
                }
            }
            return cell;
        });


        adminGUI.getRetourMenuButton1().addActionListener(e -> {
            ((CardLayout)adminGUI.getPanel1().getLayout()).show(adminGUI.getPanel1(),"MenuCard");
        });

        adminGUI.getDeselectionnerButton1().addActionListener(e -> {
            adminGUI.getTable1().clearSelection();
            ((MatchListModel) adminGUI.getList2().getModel()).removeAllElements();

        });/*

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
        });*/
        adminGUI.getDoubleRadioButton().setSelected(true);
        adminGUI.getComboBox6().setEnabled(false);
        adminGUI.getComboBox7().setEnabled(false);
        adminGUI.getComboBox5().setEnabled(false);
        adminGUI.getComboBox4().setEnabled(false);

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

        MatchDAO matchDAO = new MatchDAO();
        ArrayList<Match> matchs = matchDAO.getAll();


        adminGUI.getList2().setModel(new MatchListModel());

        for (Match match: matchs  ) {
            model.addMatch(matchDAO.getArbitres(matchDAO.getRamasseurs(match)));

        }
        adminGUI.getTable1().getSelectionModel().addListSelectionListener(e -> {
            ((MatchListModel)adminGUI.getList2().getModel()).removeAllElements();
            if(!e.getValueIsAdjusting()) {

                    ((MatchListModel)adminGUI.getList2().getModel()).addElements((Vector<Match>) adminGUI.getTable1().getModel().getValueAt( adminGUI.getTable1().getSelectedRow(),adminGUI.getTable1().getSelectedColumn()));
            }


        });
        adminGUI.getTable1().getColumnModel().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                ((MatchListModel) adminGUI.getList2().getModel()).removeAllElements();
                if (!e.getValueIsAdjusting()) {
                        ((MatchListModel)adminGUI.getList2().getModel()).addElements((Vector<Match>) adminGUI.getTable1().getModel().getValueAt( adminGUI.getTable1().getSelectedRow(),adminGUI.getTable1().getSelectedColumn()));
                }


            }
        });

        adminGUI.getList2().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(!e.getValueIsAdjusting()) {
                    Match match = ((JList<Match>)e.getSource()).getSelectedValue();
                    System.out.println(match.toString2());
                    if(match == null){
                        adminGUI.getAjouterButton1().setText("Ajouter");
                        adminGUI.getComboBox1().setSelectedItem(null);
                        adminGUI.getComboBox2().setSelectedItem(null);
                        adminGUI.getComboBox3().setSelectedItem(null);
                        adminGUI.getTypeCompetition().clearSelection();
                        adminGUI.getNationaliteComboBox().setSelectedItem(null);

                    } else {
                        adminGUI.getAjouterButton1().setText("Modifier");
                        adminGUI.getComboBox1().setSelectedItem(match.getChaise());
                        adminGUI.getComboBox2().setSelectedItem(match.getLigne());
                        adminGUI.getComboBox3().setSelectedItem(match.getEquipe1());

                        //System.out.println(match.getChaise().getNom() + " " + match.getLigne().getNom() + " " + match.getEquipe1().getNumEquipe());
                        //todo equipe 2
                        if(match.getCompetition().getType().equals("Simple")){
                            adminGUI.getSimpelRadio().setSelected(true);
                        }else{
                            adminGUI.getDoubleRadioButton().setSelected(true);
                        }
                    }

                }
            }
        });

        // pour modifier la list :   ((MatchListModel)((JList<Match>) e.getSource()).getModel()).setElementAt(match,((JList<Match>)e.getSource()).getSelectedIndex());
        // pour modifier le table : tableModel.addMatch(match)

    }
}
