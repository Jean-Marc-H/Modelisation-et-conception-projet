/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objets;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author JeanMarc
 */
public class Location {
    private int locationId;
    private Date dateRetour;
    private Date tempDepart;
    private boolean locationALAvance;
    private boolean annulee;
    private Client client;
    private Employe employe;
    private Vehicule vehicule;
    
    public void setLocationId(int id){
        this.locationId=id;
    }
    
    public int getLocationId(){
        return this.locationId;
    }
    
    public void setDateRetour(String date){
        Calendar calendar=Calendar.getInstance();
        calendar.set(Integer.parseInt(date.substring(0,2)),Integer.parseInt(date.substring(3,5)), Integer.parseInt(date.substring(6,10)));
        this.dateRetour=calendar.getTime();
    }
    
    public Date getDateRetour(){
        return this.dateRetour;
    }
    
    public void setTempDepart(String date){
        Calendar calendar=Calendar.getInstance();
        calendar.set(Integer.parseInt(date.substring(0,2)),Integer.parseInt(date.substring(3,5)), Integer.parseInt(date.substring(6,10)));
        this.tempDepart=calendar.getTime();
    }
    
    public Date getTempDepart(){
        return this.tempDepart;
    }
    
    public void setLocationALAvance(boolean location){
        this.locationALAvance=location;
    }
    
    public boolean getLocationALAvance(){
        return this.locationALAvance;
    }
    
    public void setAnnulee(boolean annulee){
        this.annulee=annulee;
    }
    
    public boolean getAnnulee(){
        return this.annulee;
    }
    
    public void setClient(Client client){
        this.client=client;
    }
    
    public Client getClient(){
        return this.client;
    }
    
    public void setEmploye(Employe employe){
        this.employe=employe;
    }
    
    public Employe getEmploye(){
        return this.employe;
    }
    
    public void setVehicule(Vehicule vehicule){
        this.vehicule=vehicule;
    }
    
    public Vehicule getVehicule(){
        return this.vehicule;
    }
}
