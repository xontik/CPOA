package entity;

/**
 * Created by xontik on 18/01/2018.
 */
public class Terrain {
    private String nom;
    private int idTerrain;
    private int numero;
    private int capacite;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getIdTerrain() {
        return idTerrain;
    }

    public void setIdTerrain(int idTerrain) {
        this.idTerrain = idTerrain;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    @Override
    public String toString() {
        return "Terrain{" +
                "nom='" + nom + '\'' +
                ", idTerrain=" + idTerrain +
                ", numero=" + numero +
                ", capacite=" + capacite +
                '}';
    }
}
