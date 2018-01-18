package App;

import dao.AuthentificationDAO;
import dao.ConnectionSQL;

import javax.swing.*;
import java.awt.event.*;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;

public class ConnectionDialog extends JDialog {

    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JLabel errorLabel;
    private AuthentificationDAO.TypePersonne success = null;
    public ConnectionDialog() {
        setLocationRelativeTo(null);
        setContentPane(contentPane);
        setModal(true);
        setSize(400,200);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        errorLabel.setVisible(false);

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }


    private void onOK()   {
        String login = textField1.getText();
        //MOVE IT TO MODEL
        Connection conn = ConnectionSQL.getConnection();
        String pwd = String.valueOf(passwordField1.getPassword());
        AuthentificationDAO auth = new AuthentificationDAO();

        success =  auth.getPrivilege(login, pwd);
        if(success != null){
            dispose();
        } else{
            errorLabel.setText("Couple identifiant / mot de passe inconnu");
            errorLabel.setVisible(true);
            passwordField1.setText("");
        }
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public AuthentificationDAO.TypePersonne getTypeConnected(){
        return this.success;
    }


}
