package models;

/**
 * Created by xontik on 14/12/2017.
 */
public class Test {
    private int idJoueur;
    private String nom;
    private String prenom;
    private int classement;
    private String nationalite;


    public Test(int idJoueur, String nom, String prenom, int classement, String nationalite) {
        this.idJoueur = idJoueur;
        this.nom = nom;
        this.prenom = prenom;
        this.classement = classement;
        this.nationalite = nationalite;
    }

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

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }
}
