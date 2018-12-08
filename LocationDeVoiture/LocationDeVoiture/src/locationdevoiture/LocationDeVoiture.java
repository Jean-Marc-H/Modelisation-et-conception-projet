/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locationdevoiture;

import database.Database;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Julien
 */
public class LocationDeVoiture {
    Database database;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocationDeVoitureFrame ldv = new LocationDeVoitureFrame();
        ldv.setVisible(true);
    }
    
    public void databaseInit() throws SQLException{
        ResultSet locationExists=database.checkIfTableExists("LOCATION");
        if(!locationExists.next()){
            //CREATE LOCATION TABLE
            
            //INSERT LOCATION DATA (APRES TABLE)
        }
        ResultSet clientExists=database.checkIfTableExists("CLIENT");
        if(!clientExists.next()){
            //CREATE CLIENT TABLE
            
            //INSERT CLIENT DATA (APRES TABLE)
        }
        ResultSet vehiculeExists=database.checkIfTableExists("VEHICULE");
        if(!vehiculeExists.next()){
            //CREATE VEHICULE TABLE
            
            //INSERT VEHICULE DATA (APRES TABLE)
        }
        ResultSet paiementExists=database.checkIfTableExists("PAIEMENT");
        if(!paiementExists.next()){
            //CREATE PAIEMENT TABLE
            
            //INSERT PAIEMENT DATA (APRES TABLE)
        }
        ResultSet supplementExists=database.checkIfTableExists("SUPPLEMENT");
        if(!supplementExists.next()){
            //CREATE SUPPLEMENT TABLE
            
            //INSERT SUPPLEMENT DATA (APRES TABLE)
        }
        ResultSet employeExists=database.checkIfTableExists("EMPLOYE");
        if(!employeExists.next()){
            //CREATE EMPLOYE TABLE
            
            //INSERT EMPLOYE DATA (APRES TABLE)
        }
    }
    
}
