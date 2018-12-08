/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objets;

/**
 *
 * @author JeanMarc
 */
public class Vehicule {
    private String vin;
    private String marque;
    private String modele;
    private int annee;
    private int kilometrage;
    private String immatriculation;
    private boolean transmissionAutomatique;
    private String classe;
    private int tailleReservoir;
    /*
    0=disponible
    1=en location
    2=en reparation/entretien
     */
    private int status;

    public String getVIN() {
        return vin;
    }

    public void setVIN(String vin) {
        this.vin = vin;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public boolean isTransmissionAutomatique() {
        return transmissionAutomatique;
    }

    public void setTransmissionAutomatique(boolean transmissionAutomatique) {
        this.transmissionAutomatique = transmissionAutomatique;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getTailleReservoir() {
        return tailleReservoir;
    }

    public void setTailleReservoir(int tailleReservoir) {
        this.tailleReservoir = tailleReservoir;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
