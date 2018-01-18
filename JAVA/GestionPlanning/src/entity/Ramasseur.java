package entity;

/**
 * Created by xontik on 18/01/2018.
 */
public class Ramasseur {
    private int idRamasseur;
    private String nom;
    private String prenom;
    private int idEquipe;

    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }

    public int getIdEquipe() {
        return idEquipe;
    }

    public int getIdRamasseur() {
        return idRamasseur;
    }

    public void setIdRamasseur(int idRamasseur) {
        this.idRamasseur = idRamasseur;
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
}
