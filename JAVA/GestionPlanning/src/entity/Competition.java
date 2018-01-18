package entity;

/**
 * Created by xontik on 18/01/2018.
 */
public class Competition {
    private int idCompetition;
    private String type;

    public int getIdCompetition() {
        return idCompetition;
    }

    public void setIdCompetition(int idCompetition) {
        this.idCompetition = idCompetition;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Competition{" +
                "idCompetition=" + idCompetition +
                ", type='" + type + '\'' +
                '}';
    }
}
