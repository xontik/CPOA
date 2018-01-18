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

}
