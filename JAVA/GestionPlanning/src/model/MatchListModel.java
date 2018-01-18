package model;

import entity.Match;

import javax.swing.*;
import java.util.Vector;

/**
 * Created by xontik on 18/01/2018.
 */
public class MatchListModel extends DefaultListModel {

    public void addElements(Vector<Match> matches){

        for (Match match: matches ) {
            addElement(match);
        }
    }
}
