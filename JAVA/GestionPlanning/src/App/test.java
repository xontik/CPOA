package App;

import javax.swing.*;
import java.awt.*;

/**
 * Created by xontik on 16/01/2018.
 */
public class test extends JFrame {
    public test(String title) throws HeadlessException {
        super(title);
        String path = "/images/fr.png";

        ImageIcon imageIcon = new ImageIcon(getClass().getResource(path));
        JLabel cell = new JLabel("test label");
        cell.setIcon(imageIcon);
        setContentPane(cell);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
    }

    public static void main(String args[]){
        new test("Test");
    }
}
