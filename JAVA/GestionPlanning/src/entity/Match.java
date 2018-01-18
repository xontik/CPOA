package entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Vector;

/**
 * Created by xontik on 18/01/2018.
 */
public class Match {

    private int idMatch;
    private String Resultat;
    private Competition competition;
    private LocalDateTime debut;
    private Journee journee;
    private Terrain terrain;
    private Arbitre ligne;
    private Arbitre chaise;
    private EquipeRamasseur equipe1;
    private EquipeRamasseur equipe2;/*
    private Vector<Joueur> joueurs1;
    private Vector<Joueur> joueurs1;

    public Joueur getJoueurA1() {
        return joueurA1;
    }

    public void setJoueurA1(Joueur joueurA1) {
        this.joueurA1 = joueurA1;
    }

    public Joueur getJoueurA2() {
        return joueurA2;
    }

    public void setJoueurA2(Joueur joueurA2) {
        this.joueurA2 = joueurA2;
    }

    public Joueur getJoueurB1() {
        return joueurB1;
    }

    public void setJoueurB1(Joueur joueurB1) {
        this.joueurB1 = joueurB1;
    }

    public Joueur getJoueurB2() {
        return joueurB2;
    }

    public void setJoueurB2(Joueur joueurB2) {
        this.joueurB2 = joueurB2;
    }*/

    public Terrain getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

    public Arbitre getLigne() {
        return ligne;
    }

    public void setLigne(Arbitre ligne) {
        this.ligne = ligne;
    }

    public Arbitre getChaise() {
        return chaise;
    }

    public void setChaise(Arbitre chaise) {
        this.chaise = chaise;
    }

    public EquipeRamasseur getEquipe1() {
        return equipe1;
    }

    public void setEquipe1(EquipeRamasseur equipe1) {
        this.equipe1 = equipe1;
    }

    public EquipeRamasseur getEquipe2() {
        return equipe2;
    }

    public void setEquipe2(EquipeRamasseur equipe2) {
        this.equipe2 = equipe2;
    }

    public int getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(int idMatch) {
        this.idMatch = idMatch;
    }

    public String getResultat() {
        return Resultat;
    }

    public void setResultat(String resultat) {
        Resultat = resultat;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public LocalDateTime getDebut() {
        return debut;
    }

    public void setDebut(LocalDateTime debut) {
        this.debut = debut;
    }

    public Journee getJournee() {
        return journee;
    }

    public void setJournee(Journee journee) {
        this.journee = journee;
    }

    @Override
    public String toString() {
        return "N°"+idMatch+" Debut: "+debut+" Terrain: "+terrain.getNom();
    }


    public String toString2() {
        return "Match{" +
                "idMatch=" + idMatch +
                ", Resultat='" + Resultat + '\'' +
                ", competition=" + competition +
                ", debut=" + debut +
                ", journee=" + journee +
                ", terrain=" + terrain +
                ", ligne=" + ligne +
                ", chaise=" + chaise +
                ", equipe1=" + equipe1 +
                ", equipe2=" + equipe2 +
                '}';
    }
}
