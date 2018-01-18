package entity;

/**
 * Created by xontik on 16/01/2018.
 */
public class Arbitre {
    private String nom;
    private String prenom;
    private int idArbitre;
    private Nationalite nationalite;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getIdArbitre() {
        return idArbitre;
    }

    public void setIdArbitre(int idArbitre) {
        this.idArbitre = idArbitre;
    }

    public Nationalite getNationalite() {
        return nationalite;
    }

    public void setNationalite(Nationalite nationalite) {
        this.nationalite = nationalite;
    }

    @Override
    public String toString() {
        return nom + " " + prenom + " (" + nationalite.getShortName() +")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Arbitre arbitre = (Arbitre) o;

        if (idArbitre != arbitre.idArbitre) return false;
        if (!nom.equals(arbitre.nom)) return false;
        if (!prenom.equals(arbitre.prenom)) return false;
        if (!nationalite.equals(arbitre.nationalite)) return false;
        return type.equals(arbitre.type);
    }

    @Override
    public int hashCode() {
        int result = nom.hashCode();
        result = 31 * result + prenom.hashCode();
        result = 31 * result + idArbitre;
        result = 31 * result + nationalite.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }
}
