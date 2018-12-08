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
public class Employe {
    private int numeroEmploye;
    private String nom;
    private String prenom;
    private String password;
    private boolean isAdmin;
    
    public void setNumeroEmploye(int numero){
        this.numeroEmploye=numero;
    }
    
    public int getNumeroEmploye(){
        return this.numeroEmploye;
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
    
    public void setPassword(String password){
        this.password=password;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void setIsAdmin(boolean isAdmin){
        this.isAdmin=isAdmin;
    }
    
    public boolean getIsAdmin(){
        return this.isAdmin;
    }
}
