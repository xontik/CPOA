package App;

import controller.ArbitreController;
import controller.PlanningController;

import javax.swing.*;
import java.awt.*;

/**
 * Created by xontik on 16/01/2018.
 */
public class AdminGUI extends JFrame{
    private JPanel panel1;
    private JPanel MenuCard;
    private JButton outilsPlanningButton;
    private JButton outilsArbitreButton;
    private JButton outilsRamasseurButton;



    private JButton outilsJoueurButton;
    private JButton ajouterButton;
    private JList list1;
    private JPanel ArbitreCard;
    private JRadioButton ligneRadioButton;
    private JRadioButton chaiseRadioButton;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox nationaliteComboBox;
    private JButton retourMenuButton;
    private JButton supprimerButton;
    private JButton validerLesDonnéesButton;
    private JButton deselectionerButton;
    private JPanel PlanningCard;
    private JTable table1;
    private JList list2;
    private JRadioButton simpelRadio;
    private JRadioButton doubleRadioButton;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JButton supprimerButton1;
    private JButton ajouterButton1;
    private JButton deselectionnerButton1;
    private JButton retourMenuButton1;
    private JComboBox comboBox4;
    private JComboBox comboBox5;
    private JComboBox comboBox6;
    private JComboBox comboBox7;
    private ButtonGroup typeCompetition;


    private ButtonGroup arbitreType;

    private ArbitreController arbitreController;
    private PlanningController planningController;


    public AdminGUI() throws HeadlessException {
        super("AdminGUI");
        this.setContentPane(panel1);
        setSize(800,640);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        outilsArbitreButton.addActionListener(e -> {
            ((CardLayout)panel1.getLayout()).show(panel1,"ArbitreCard");
            if(arbitreController == null){
                arbitreController = new ArbitreController(this);
                arbitreController.init();
            }
        });
        outilsPlanningButton.addActionListener(e -> {
            ((CardLayout)panel1.getLayout()).show(panel1,"PlanningCard");
            if(planningController == null){
                planningController = new PlanningController(this);
                planningController.init();
            }
        });


    }

    public JList getList1() {
        return list1;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public JPanel getArbitreCard() {
        return ArbitreCard;
    }

    public JRadioButton getLigneRadioButton() {
        return ligneRadioButton;
    }

    public JRadioButton getChaiseRadioButton() {
        return chaiseRadioButton;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public JComboBox getNationaliteComboBox() {
        return nationaliteComboBox;
    }

    public JButton getAjouterButton() {
        return ajouterButton;
    }

    public JButton getRetourMenuButton() {
        return retourMenuButton;
    }

    public JButton getSupprimerButton() {
        return supprimerButton;
    }

    public JButton getValiderLesDonnéesButton() {
        return validerLesDonnéesButton;
    }

    public JButton getDeselectionerButton(){
        return deselectionerButton;
    }
    public ButtonGroup getArbitreType() {
        return arbitreType;
    }

    public JTable getTable1() {
        return table1;
    }

    public JPanel getMenuCard() {
        return MenuCard;
    }

    public JButton getOutilsPlanningButton() {
        return outilsPlanningButton;
    }

    public JButton getOutilsArbitreButton() {
        return outilsArbitreButton;
    }

    public JButton getOutilsRamasseurButton() {
        return outilsRamasseurButton;
    }

    public JButton getOutilsJoueurButton() {
        return outilsJoueurButton;
    }

    public JPanel getPlanningCard() {
        return PlanningCard;
    }

    public JList getList2() {
        return list2;
    }

    public JRadioButton getSimpelRadio() {
        return simpelRadio;
    }

    public JRadioButton getDoubleRadioButton() {
        return doubleRadioButton;
    }

    public JComboBox getComboBox1() {
        return comboBox1;
    }

    public JComboBox getComboBox2() {
        return comboBox2;
    }

    public JComboBox getComboBox3() {
        return comboBox3;
    }

    public JButton getSupprimerButton1() {
        return supprimerButton1;
    }

    public JButton getAjouterButton1() {
        return ajouterButton1;
    }

    public JButton getDeselectionnerButton1() {
        return deselectionnerButton1;
    }

    public JButton getRetourMenuButton1() {
        return retourMenuButton1;
    }

    public ArbitreController getArbitreController() {
        return arbitreController;
    }

    public PlanningController getPlanningController() {
        return planningController;
    }

    public JComboBox getComboBox4() {
        return comboBox4;
    }

    public JComboBox getComboBox5() {
        return comboBox5;
    }

    public JComboBox getComboBox6() {
        return comboBox6;
    }

    public JComboBox getComboBox7() {
        return comboBox7;
    }

    public ButtonGroup getTypeCompetition() {
        return typeCompetition;
    }
}
