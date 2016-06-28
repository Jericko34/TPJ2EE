/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entreamis;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Benjamin
 */
public class Facture {

    private int prix;
    private String description;
    private List<Personne> personnes = new ArrayList<>();
    private Personne proprietaire;

    public Facture(int a, String b, Personne c, List<Personne> d) {
        this.prix = a;
        this.description = b;
        this.proprietaire = c;
        this.personnes=d;
    }

    /**
     * @return the prix
     */
    public int getPrix() {
        return prix;
    }

    /**
     * @param prix the prix to set
     */
    public void setPrix(int prix) {
        this.prix = prix;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the personnes
     */
    public List<Personne> getPersonnes() {
        return personnes;
    }

    /**
     * @param personnes the personnes to set
     */
    public void setPersonnes(List<Personne> personnes) {
        this.personnes = personnes;
    }

    /**
     * @return the proprietaire
     */
    public Personne getProprietaire() {
        return proprietaire;
    }

    /**
     * @param proprietaire the proprietaire to set
     */
    public void setProprietaire(Personne proprietaire) {
        this.proprietaire = proprietaire;
    }


}
