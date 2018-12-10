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
public class Client {
    private int clientId;
    private String nom;
    private String prenom;
    private String adresseCourriel;
    private String telephone;
    private String numeroPermis;
    private Date expirationPermis;
    private Date dateNaissance;
    
    
    public void setClientId(int id){
        this.clientId=id;
    }
    
    public int getClientId(){
        return this.clientId;
    }
    
    public void setNom(String nom){
        this.nom=nom;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public void setPrenom(String prenom){
        this.prenom=prenom;
    }
    
    public String getPrenom(){
        return this.prenom;
    }
    
    public void setTelephone(String telephone){
        this.telephone=telephone;
    }
    
    public String getTelephone(){
        return this.telephone;
    }

    public String getAdresseCourriel() {
        return adresseCourriel;
    }

    public void setAdresseCourriel(String adresseCourriel) {
        this.adresseCourriel = adresseCourriel;
    }

    public String getNumeroPermis() {
        return numeroPermis;
    }

    public void setNumeroPermis(String numeroPermis) {
        this.numeroPermis = numeroPermis;
    }

    public void setExpirationPermis(Date expirationPermis) {
        this.expirationPermis = expirationPermis;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setExpirationPermis(String date){
        Calendar calendar=Calendar.getInstance();
        calendar.set(Integer.parseInt(date.substring(0,2)),Integer.parseInt(date.substring(3,5)), Integer.parseInt(date.substring(6,10)));
        this.expirationPermis=calendar.getTime();
    }
    
    public Date getExpirationPermis(){
        return this.expirationPermis;
    }
    
    public void setDateNaissance(String date){
        Calendar calendar=Calendar.getInstance();
        calendar.set(Integer.parseInt(date.substring(0,2)),Integer.parseInt(date.substring(3,5)), Integer.parseInt(date.substring(6,10)));
        this.dateNaissance=calendar.getTime();
    }
    
    public Date getDateNaissance(){
        return this.dateNaissance;
    }
}
