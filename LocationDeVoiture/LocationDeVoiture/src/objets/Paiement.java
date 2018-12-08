/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objets;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author JeanMarc
 */
public class Paiement {
    private int locationId;
    /*
    0=Espece
    1=credit
    2=debit
     */
    private int methode;
    private double montant;
    private Date datePaiement;
    private String raison;

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getMethode() {
        return methode;
    }

    public void setMethode(int methode) {
        this.methode = methode;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDatePaiement() {
        return this.datePaiement;
    }

    public void setDatePaiement(String date){
        Calendar calendar=Calendar.getInstance();
        calendar.set(Integer.parseInt(date.substring(0,2)),Integer.parseInt(date.substring(3,5)), Integer.parseInt(date.substring(6,10)));
        this.datePaiement=calendar.getTime();
    }

    public String getRaison() {
        return raison;
    }

    public void setRaison(String raison) {
        this.raison = raison;
    }
}
