package model;

import entity.Arbitre;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by xontik on 16/01/2018.
 */
public class ArbitreListModel extends DefaultListModel {

    @Override
    public void addElement(Object element) {
        super.addElement(element);
    }

    @Override
    public void setElementAt(Object element, int index) {
        super.setElementAt(element, index);
    }

    public ArrayList<Arbitre> getAllElements(){
        ArrayList<Arbitre> arbitres = new ArrayList<>();
        for (int i = 0; i < this.getSize(); i++){
            arbitres.add((Arbitre)getElementAt(i));
        }
        return arbitres;
    }
}
