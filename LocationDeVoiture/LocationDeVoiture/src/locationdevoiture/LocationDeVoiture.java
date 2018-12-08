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
    public static Database database;
    public static void main(String[] args) {
        LocationDeVoitureFrame ldv = new LocationDeVoitureFrame();
        ldv.setVisible(true);
        database.databaseInit();
    }   
}
