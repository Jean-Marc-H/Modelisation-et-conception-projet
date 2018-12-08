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
public class Client {
    private int clientId;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String numeroPermis;
    private int age;
    
    
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
    
    public void setAdresse(String adresse){
        this.adresse=adresse;
    }
    
    public String getAdresse(){
        return this.adresse;
    }
    
    public void setTelephone(String telephone){
        this.telephone=telephone;
    }
    
    public String getTelephone(){
        return this.telephone;
    }
    
    public void setNumeroPermis(String permis){
        this.numeroPermis=permis;
    }
    
    public String getNumeroPermis(){
        return this.numeroPermis;
    }
    
    public void setAge(int age){
        this.age=age;
    }
    
    public int getAge(){
        return this.age;
    }
}
