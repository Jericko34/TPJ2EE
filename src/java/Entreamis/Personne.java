/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entreamis;

/**
 *
 * @author Benjamin
 */
public class Personne {

    private String nom;
    private int valeur = 0;

    public Personne(String a) {
        this.nom=a;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the valeur
     */
    public int getValeur() {
        return valeur;
    }

    /**
     * @param valeur the valeur to set
     */
    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public void addValeur(int a) {
        this.valeur = this.valeur + a;
    }

    public void subbValeur(int a){
        this.valeur = this.valeur -a;
    }
}
