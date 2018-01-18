package entity;

/**
 * Created by xontik on 16/01/2018.
 */
public class Nationalite {

        private int idNationalite;
        private String shortName;
        private String fullName;

        public Nationalite(){

        }
        public Nationalite(int idNationalite, String shortName, String fullName) {
            this.idNationalite = idNationalite;
            this.shortName = shortName;
            this.fullName = fullName;
        }

        public int getIdNationalite() {
            return idNationalite;
        }

        public void setIdNationalite(int idNationalite) {
            this.idNationalite = idNationalite;
        }

        public String getShortName() {
            return shortName;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Nationalite that = (Nationalite) o;

        return idNationalite == that.idNationalite;
    }

    @Override
    public int hashCode() {
        return idNationalite;
    }

    public void setShortName(String shortName) {
            this.shortName = shortName;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

    @Override
    public String toString() {
        return fullName + " ("+shortName+")";
    }
}
