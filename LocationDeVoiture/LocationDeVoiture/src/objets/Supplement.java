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
public class Supplement {
    private int locationId;
    private boolean assuranceAchete;
    //0=500 kilomètres gratuit, 1=kilometrage illimite
    private int forfaitDistance;
    //Manquant en %
    private int essenceManquant;
    private int heuresDeRetard;
    private double reparations;

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public boolean isAssuranceAchete() {
        return assuranceAchete;
    }

    public void setAssuranceAchete(boolean assuranceAchete) {
        this.assuranceAchete = assuranceAchete;
    }

    public int getForfaitDistance() {
        return forfaitDistance;
    }

    public void setForfaitDistance(int forfaitDistance) {
        this.forfaitDistance = forfaitDistance;
    }

    public int getEssenceManquant() {
        return essenceManquant;
    }

    public void setEssenceManquant(int essenceManquant) {
        this.essenceManquant = essenceManquant;
    }

    public int getHeuresDeRetard() {
        return heuresDeRetard;
    }

    public void setHeuresDeRetard(int heuresDeRetard) {
        this.heuresDeRetard = heuresDeRetard;
    }

    public double getReparations() {
        return reparations;
    }

    public void setReparations(double reparations) {
        this.reparations = reparations;
    }
}
