package org.example.io;

import org.example.data.BaseDeDonnee;

import java.sql.*;

/**
 * Name: Classe ManipFichier
 * fonction: faire les manipulations sur la console
 */
public class ManipFichier {
    static double paraSalaire;
    static String paraDept;

    /**
     * name: afficherTableEmploye
     * fonction affiche tout les employé dans la base de donnée
     *
     * @throws SQLException
     */
    public static void afficherTableEmploye() throws SQLException {
        String query = null;
        BaseDeDonnee.seConnecter();

        System.out.println("- Voici la table de tous vos employé  \n");

        query = "SELECT * FROM employe";


        BaseDeDonnee.prepareStatement = BaseDeDonnee.connection.prepareStatement(query);
        ResultSet resultSet = BaseDeDonnee.prepareStatement.executeQuery();
//        System.out.println("id   | Prénom      | Nom      | Email    | Departement        |Salaire");
//Extraction des  donnees du result set
        while (resultSet.next()) {
            //Retrouver  par le nom de la colonne
            int id = resultSet.getInt(1);
            String prenom = resultSet.getString("prenom");
            String nom = resultSet.getString("nom");
            String email = resultSet.getString("email");
            String departement = resultSet.getString("departement");
            double salaire = resultSet.getDouble("salaire");

            System.out.printf("id:%d, nom: %s, prenom: %s, email: %s, departement: %s, salaire: %5.2f\n", id, prenom, nom, email, departement, salaire);

            //System.out.printf("%d    |%s            |%s           |%s           |%s        |%f10.2\n", id, prenom, nom, email, departement, salaire);//---format différent d'affichage
        }
        BaseDeDonnee.seDeconnecter();
    }

    /**
     * name: afficherResulatQuestion
     * fonction faire une requete pour l'exercice 2
     *
     * @param paraSalaire
     * @param paraDept
     * @throws SQLException
     */
    public static void afficherResultatQuestion(double paraSalaire, String paraDept) throws SQLException {

        Connection connection = null;
        PreparedStatement prepareStatement = null;
        String query = null;


        System.out.println("Connexion établie avec succès avec la bd MySQL ....\n");

        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/exercice2", "root",
                "Lareaultlaval7");

        //setDouble(paraSalaire);
        //setString(paraDept);
        System.out.println("- Voici la table employe avec un salaire supérieur à " + paraSalaire + " et dont le département est " + paraDept + " \n");

        query = "SELECT * FROM employe WHERE salaire > " + paraSalaire + " AND departement like '" + paraDept + "'";


        prepareStatement = connection.prepareStatement(query);
        ResultSet resultSet = prepareStatement.executeQuery();
//        System.out.println("id   | Prénom      | Nom      | Email    | Departement        |Salaire");

        while (resultSet.next()) {
            //Retrouver  par le nom de la colonne
            int id = resultSet.getInt(1);
            String prenom = resultSet.getString(2);
            String nom = resultSet.getString(3);
            String email = resultSet.getString(4);
            String departement = resultSet.getString(5);
            double salaire = resultSet.getDouble(6);
            System.out.printf("%d, %s, %s, %s, %s, %5.2f\n", id, prenom, nom, email, departement, salaire);

//            System.out.printf("id:%d, nom: %s, prenom: %s, email: %s, departement: %s, salaire: %5.2f\n", id, prenom, nom, email, departement, salaire);
//            System.out.printf("%d    |%s            |%s           |%s           |%s        |%f10.2\n", id, prenom, nom, email, departement, salaire);//---format différent d'affichage
        }


        System.out.println("\nFermeture de la connexion...");
        resultSet.close();
        prepareStatement.close();
        connection.close();


    }

    /**
     * name: dans le cadre de l'exercice j'ai décidé de setter les valeur
     *
     * @param departementRechercher
     */
    private static void setString(String departementRechercher) {
        departementRechercher = "HR";
        paraDept = departementRechercher;
    }

    /**
     * name: dans le cadre de l'exercice j'ai décidé de setter les valeur
     *
     * @param salaireRechercher
     */
    private static void setDouble(double salaireRechercher) {
        salaireRechercher = 25000;
        paraSalaire = salaireRechercher;
    }

}
