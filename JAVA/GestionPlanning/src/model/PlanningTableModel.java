package model;

import entity.Match;

import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import java.util.function.Consumer;

/**
 * Created by xontik on 18/01/2018.
 */
public class PlanningTableModel extends DefaultTableModel {
    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex == 0){
            return String.class;
        }else{
            return Vector.class;
        }
    }

    public void addMatch(Match match){
        Vector<Match> matches = (Vector<Match>)getValueAt(match.getJournee().getIdJournee()-1,(match.getDebut().getHour()-8)/2+1);
        boolean find = false;
        for(int i = 0; i < matches.size();i++){
            if(matches.get(i).getIdMatch() == match.getIdMatch()){
                matches.set(i,match);
                find = true;
            }
        }

        if(!find){
            matches.add(match);
        }

    }

}
