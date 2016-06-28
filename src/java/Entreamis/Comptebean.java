/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entreamis;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Benjamin
 */
@ManagedBean
@SessionScoped
public class Comptebean {

    private List<Personne> participants;
    private List<Personne> personnes;
    private List<Facture> factures;
    private String nompersonne;
    private String nomfacture;
    private int valeurfacture;
    private Personne proprietaire;
    private String nomproprio;
    private String[] nomparticipants;
    private String messagefinal = "R�sultat : ";
    private int prix;

    public Comptebean() {
        personnes = new ArrayList<>();
        factures = new ArrayList<>();
    }

    public void ajouterPersonne() {
        Personne p = new Personne(nompersonne);
        personnes.add(p);
    }

    public void supprimerPersonne(Personne r) {
        personnes.remove(r);
    }

    public void ajouterFacture() {
        participants = new ArrayList<>();
        for (Personne p : personnes) {
            if (p.getNom() == null ? getNomproprio() == null : p.getNom().equals(getNomproprio())) {
                proprietaire = p;
            }
        }
        for (int i = 0; i < nomparticipants.length; i++) {
            for (Personne pers : personnes) {
                if (nomparticipants[i] == null ? pers.getNom() == null : nomparticipants[i].equals(pers.getNom())) {
                    participants.add(pers);
                }
            }
        }

        Facture f = new Facture(valeurfacture, nomfacture, proprietaire, participants);
        factures.add(f);
        proprietaire = null;
    }

    public void supprimerfacture(Facture r) {
        factures.remove(r);
    }

    public void entreAmis() {
        for (Facture fac : factures) {
            fac.getProprietaire().addValeur(fac.getPrix());

            for (Personne parti : fac.getPersonnes()) {
                parti.subbValeur(fac.getPrix() / participants.size());
            }
        }

        for (Personne pers : personnes) {
            if (pers.getValeur() > 0) {
                for (Personne d : personnes) {
                    if (d.getNom() == null ? pers.getNom() != null : !d.getNom().equals(pers.getNom())) {
                        if (d.getValeur() < 0) {
                            if (pers.getValeur() + d.getValeur() > 0) {
                                prix = d.getValeur() * -1;
                                pers.setValeur(pers.getValeur() + d.getValeur());
                                d.setValeur(0);
                                messagefinal += (d.getNom() + " doit " + prix + "euros � " + pers.getNom() + ". ");
                            }
                            if (pers.getValeur() + d.getValeur() < 0) {
                                prix = pers.getValeur() * -1;
                                d.setValeur(d.getValeur() + pers.getValeur());
                                pers.setValeur(0);
                                messagefinal += (d.getNom() + " doit " + prix + "euros � " + pers.getNom() + ". ");
                            }
                            if (pers.getValeur() + d.getValeur() == 0) {
                                prix = pers.getValeur();
                                d.setValeur(0);
                                pers.setValeur(0);
                                messagefinal += (d.getNom() + " doit " + prix + "euros � " + pers.getNom() + ". ");

                            }
                        }
                    }
                }

            }
        }

    }

    /**
     * @return the participants
     */
    public List<Personne> getParticipants() {
        return participants;
    }

    /**
     * @param participants the participants to set
     */
    public void setParticipants(List<Personne> participants) {
        this.participants = participants;
    }

    /**
     * @return the factures
     */
    public List<Facture> getFactures() {
        return factures;
    }

    /**
     * @param factures the factures to set
     */
    public void setFactures(List<Facture> factures) {
        this.factures = factures;
    }

    /**
     * @return the nompersonne
     */
    public String getNompersonne() {
        return nompersonne;
    }

    /**
     * @param nompersonne the nompersonne to set
     */
    public void setNompersonne(String nompersonne) {
        this.nompersonne = nompersonne;
    }

    /**
     * @return the nomfacture
     */
    public String getNomfacture() {
        return nomfacture;
    }

    /**
     * @param nomfacture the nomfacture to set
     */
    public void setNomfacture(String nomfacture) {
        this.nomfacture = nomfacture;
    }

    /**
     * @return the valeurfacture
     */
    public int getValeurfacture() {
        return valeurfacture;
    }

    /**
     * @param valeurfacture the valeurfacture to set
     */
    public void setValeurfacture(int valeurfacture) {
        this.valeurfacture = valeurfacture;
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

    public void addParticipant(Personne a) {
        participants.add(a);
    }

    /**
     * @return the nomproprio
     */
    public String getNomproprio() {
        return nomproprio;
    }

    /**
     * @param nomproprio the nomproprio to set
     */
    public void setNomproprio(String nomproprio) {
        this.nomproprio = nomproprio;
    }

    /**
     * @return the nomparticipants
     */
    public String[] getNomparticipants() {
        return nomparticipants;
    }

    /**
     * @param nomparticipants the nomparticipants to set
     */
    public void setNomparticipants(String[] nomparticipants) {
        this.nomparticipants = nomparticipants;
    }

    /**
     * @return the messagefinal
     */
    public String getMessagefinal() {
        return messagefinal;
    }

    /**
     * @param messagefinal the messagefinal to set
     */
    public void setMessagefinal(String messagefinal) {
        this.messagefinal = messagefinal;
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

}
