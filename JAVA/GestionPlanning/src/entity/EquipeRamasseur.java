package entity;

import java.util.ArrayList;

/**
 * Created by xontik on 18/01/2018.
 */
public class EquipeRamasseur {
    private int idEquipe;
    private int numEquipe;
    private ArrayList<Ramasseur> ramasseurs;

    public int getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }

    public int getNumEquipe() {
        return numEquipe;
    }

    public void setNumEquipe(int numEquipe) {
        this.numEquipe = numEquipe;
    }

    public ArrayList<Ramasseur> getRamasseurs() {
        return ramasseurs;
    }

    public void setRamasseurs(ArrayList<Ramasseur> ramasseurs) {
        this.ramasseurs = ramasseurs;
    }

    public void addRamasseur(Ramasseur ramasseur){
        ramasseurs.add(ramasseur);
    }

    @Override
    public String toString() {
        String out = "N°"+numEquipe;
        for(Ramasseur ramasseur:ramasseurs){

            out+= " - "+ramasseur.getNom() + " " + ramasseur.getPrenom();
        }
        return out;
    }
}
