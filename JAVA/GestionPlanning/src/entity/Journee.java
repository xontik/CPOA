package entity;

import java.time.LocalDate;
import java.util.Calendar;

/**
 * Created by xontik on 18/01/2018.
 */
public class Journee {
    private int idJournee;
    private LocalDate dateJournee;

    public int getIdJournee() {
        return idJournee;
    }

    public void setIdJournee(int idJournee) {
        this.idJournee = idJournee;
    }

    public LocalDate getDateJournee() {
        return dateJournee;
    }

    public void setDateJournee(LocalDate dateJournee) {
        this.dateJournee = dateJournee;
    }

    @Override
    public String toString() {
        return "Journee{" +
                "idJournee=" + idJournee +
                ", dateJournee=" + dateJournee +
                '}';
    }
}
