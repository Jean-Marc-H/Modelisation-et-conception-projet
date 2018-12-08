package database;
/**
base de donn�es permettant de g�rer les op�rations du syst�me de location de voitures et les employ�s
en meme temps.

des fonctions comme ajout de client ou locations sont s�par�s pour associer les clients aux locations

la base de donn�es garde toutes les informations sur l'inventaire et les particularit�s des locations, les clients
et les employ�s afin de donner les bonnes permissions aux bons employ�s.


**/
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import objets.Client;
import objets.Employe;
import objets.Location;
import objets.Paiement;
import objets.Supplement;
import objets.Vehicule;

/**
 *
 * @author Nicolas
 */
public class Database {

    protected static final String ConnectionString = "jdbc:sqlite:../Database/Location.db";

    public void databaseInit(){
        try{
        ResultSet locationExists=this.checkIfTableExists("LOCATION");
        if(!locationExists.next()){
            //CREATE LOCATION TABLE
            
            //INSERT LOCATION DATA (APRES TABLE)
        }
        ResultSet clientExists=this.checkIfTableExists("CLIENT");
        if(!clientExists.next()){
            //CREATE CLIENT TABLE
            
            //INSERT CLIENT DATA (APRES TABLE)
        }
        ResultSet vehiculeExists=this.checkIfTableExists("VEHICULE");
        if(!vehiculeExists.next()){
            //CREATE VEHICULE TABLE
            
            //INSERT VEHICULE DATA (APRES TABLE)
        }
        ResultSet paiementExists=this.checkIfTableExists("PAIEMENT");
        if(!paiementExists.next()){
            //CREATE PAIEMENT TABLE
            
            //INSERT PAIEMENT DATA (APRES TABLE)
        }
        ResultSet supplementExists=this.checkIfTableExists("SUPPLEMENT");
        if(!supplementExists.next()){
            //CREATE SUPPLEMENT TABLE
            
            //INSERT SUPPLEMENT DATA (APRES TABLE)
        }
        ResultSet employeExists=this.checkIfTableExists("EMPLOYE");
        if(!employeExists.next()){
            //CREATE EMPLOYE TABLE
            
            //INSERT EMPLOYE DATA (APRES TABLE)
        }}
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    protected Connection Connect() {
        Connection cnx = null;
        try {
            cnx = DriverManager.getConnection(ConnectionString);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return cnx;
    }
    
    public ResultSet checkIfTableExists(String tableName){
        try(Connection cnx = this.Connect();){
            DatabaseMetaData metaData=cnx.getMetaData();
            return metaData.getTables(null, null, tableName, null);
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    protected int GetInsertedId(PreparedStatement statement) throws SQLException {
        ResultSet generatedKeys = statement.getGeneratedKeys();
        if (generatedKeys.next())
            return generatedKeys.getInt(1);
        else
            return -1;
    }


    public int AjouterLocation(Location data) throws Exception {
        String SQL = "INSERT INTO LOCATION (DATE_RETOUR, LOCATION_A_L_AVANCE, DATE_HEURE_DEPART, ANNULEE, CLIENT_ID, EMPLOYE_ID, VEHICULE) VALUES (?, ?, ?, ?, ?, ?, ?)";

        if (data.getDateRetour() == null ||
                data.getTempDepart() == null ||
                data.getClient() == null ||
                data.getVehicule() == null)
            throw new Exception("DateRetour, TempDepart, Client and Vehicule ne peuvent pas etres nuls");

        try (Connection cnx = this.Connect();
                PreparedStatement statement = cnx.prepareStatement(SQL)) {

            statement.setDate(1, new java.sql.Date(data.getDateRetour().getTime()));
            statement.setBoolean(2, data.getLocationALAvance());
            statement.setDate(3, new java.sql.Date(data.getTempDepart().getTime()));
            statement.setBoolean(4, data.getAnnulee());
            statement.setInt(5, data.getClient().getClientId());
            statement.setInt(6, data.getEmploye().getNumeroEmploye());
            statement.setString(7, data.getVehicule().getVIN());

            statement.executeUpdate();

            return GetInsertedId(statement);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return -1;
    }

    public int AjouterClient(Client data) throws Exception {
        String SQL = "INSERT INTO CLIENT (NOM, PRENOM, ADRESSE, NUMERO_TELEPHONE, NUMERO_PERMIS, AGE) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection cnx = this.Connect();
                PreparedStatement statement = cnx.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS)) {

            statement.setString(1, data.getNom());
            statement.setString(2, data.getPrenom());
            statement.setString(3, data.getAdresse());
            statement.setString(4, data.getTelephone());
            statement.setString(5, data.getNumeroPermis());
            statement.setInt(6, data.getAge());

            statement.executeUpdate();

            return GetInsertedId(statement);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return -1;
    }

    public int AjouterVehicule(Vehicule data) throws Exception {
        String SQL = "INSERT INTO VEHICULE (VIN, MARQUE, MODELE, ANNEE, KILOMETRAGE, IMMATRICULATION, TRANSMISSION, CLASSE, TAILLE_RESERVOIRE, STATUT) VALUES (	?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection cnx = this.Connect();
                PreparedStatement statement = cnx.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS)) {

            statement.setString(1, data.getVIN());
            statement.setString(2, data.getMarque());
            statement.setString(3, data.getModele());
            statement.setInt(4, data.getAnnee());
            statement.setInt(5, data.getKilometrage());
            statement.setString(6, data.getImmatriculation());
            statement.setBoolean(7, data.isTransmissionAutomatique());
            statement.setString(8, data.getClasse());
            statement.setInt(9, data.getTailleReservoir());
            statement.setInt(11, data.getStatus());

            statement.executeUpdate();

            return GetInsertedId(statement);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return -1;
    }

    public int AjouterPaiement(Paiement data) throws Exception {
        String SQL = "INSERT INTO PAIEMENT (METHODE, MONTANT, DATE, RAISON, LOCATION_ID) VALUES (?, ?, ?, ?, ?)";

        try (Connection cnx = this.Connect();
                PreparedStatement statement = cnx.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS)) {

            statement.setInt(1, data.getMethode());
            statement.setDouble(2, data.getMontant());
            statement.setDate(3, new java.sql.Date(data.getDatePaiement().getTime()));
            statement.setString(4, data.getRaison());
            statement.setInt(5, data.getLocationId());

            statement.executeUpdate();

            return GetInsertedId(statement);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return -1;
    }

    public int AjouterSupplement(Supplement data) throws Exception {
        String SQL = "INSERT INTO SUPPLEMENT (LOCATON_ID, ASSURANCE, FORFAIT_DISTANCE, HEURES_RETARD, ESSENCE_MANQUANT, REPARATIONS) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection cnx = this.Connect();
                PreparedStatement statement = cnx.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS)) {

            statement.setInt(1, data.getLocationId());
            statement.setBoolean(2, data.isAssuranceAchete());
            statement.setInt(3, data.getForfaitDistance());
            statement.setInt(4, data.getHeuresDeRetard());
            statement.setInt(5, data.getEssenceManquant());
            statement.setDouble(6, data.getReparations());

            statement.executeUpdate();

            return GetInsertedId(statement);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return -1;
    }

    public int AjouterEmploye(Employe data) throws Exception {
        String SQL = "INSERT INTO EMPLOYE (NOM, PRENOM, PASSWORD, IS_ADMIN) VALUES (?, ?, ?, ?)";

        try (Connection cnx = this.Connect();
                PreparedStatement statement = cnx.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS)) {

            statement.setString(1, data.getNom());
            statement.setString(2, data.getPrenom());
            statement.setString(3, data.getPassword());
            statement.setBoolean(4, data.getIsAdmin());

            statement.executeUpdate();

            return GetInsertedId(statement);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return -1;
    }
}
