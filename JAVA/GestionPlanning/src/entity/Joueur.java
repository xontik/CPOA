package entity;

/**
 * Created by xontik on 18/01/2018.
 */
public class Joueur {
    private int idJoueur;
    private String nom;
    private String prenom;
    private int classement;
    private Nationalite nationalite;

    public int getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(int idJoueur) {
        this.idJoueur = idJoueur;
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

    public int getClassement() {
        return classement;
    }

    public void setClassement(int classement) {
        this.classement = classement;
    }

    public Nationalite getNationalite() {
        return nationalite;
    }

    public void setNationalite(Nationalite nationalite) {
        this.nationalite = nationalite;
    }

    @Override
    public String toString() {
        return nom + " " + prenom + " ("+ nationalite.getShortName()+")";
    }
}
