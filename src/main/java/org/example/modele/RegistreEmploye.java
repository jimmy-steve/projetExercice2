package org.example.modele;

import java.sql.*;
import java.util.ArrayList;

/**
 * classe du registre d'employé
 * fonction: gèerer la liste des employé
 */
public class RegistreEmploye {
    public ArrayList<Employe> registreEmploye;

    public RegistreEmploye() {
        this.registreEmploye = new ArrayList<>();
    }

    public RegistreEmploye(ArrayList<Employe> registreEmploye) {
        this.registreEmploye = registreEmploye;
    }

    public ArrayList<Employe> getRegistreEmploye() {
        return registreEmploye;
    }

    public void setRegistreEmploye(ArrayList<Employe> registreEmploye) {
        this.registreEmploye = registreEmploye;
    }

    public void ajouterEmploye(Employe employe) {
        this.registreEmploye.add(employe);
    }

    public void ajouterEmployeJDBC(String p_prenom,String p_nom,String p_email,String p_departement,double p_salaire)
            throws SQLException {

        Connection connection = null;
        //pour des raisons de sécurité, évite les sql injection
        PreparedStatement prepareStatement = null;
        String query = null;


        //----------------------------------------------------------------------Ouvrir une connexion
        System.out.println("Connexion à la bd...");
        connection =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/exercice2", "root",
                        "Lareaultlaval7");
        //----------------------------------------------------------------------Ouvrir une connexion



//----------------------------------------------------------------------insertion
//        query = "INSERT INTO employe (prenom, nom, email, departement, salaire) values (?, ?, ?, ?, ?)";
//        prepareStatement.setString(1, p_prenom);
//        prepareStatement.setString(2, p_nom);
//        prepareStatement.setString(3, p_email);
//        prepareStatement.setString(4, p_departement);
//        prepareStatement.setDouble(5, p_salaire);

//
//        prepareStatement = connection.prepareStatement(query);
//        prepareStatement.executeUpdate(query);

        //Insertion à la bd
        System.out.println("Insertion effectuée...");
        query = "INSERT INTO employe (prenom, nom, email, departement, salaire) values ('"+ p_prenom + "', '"+ p_nom + "'," +
                " '"+ p_email +"', '" + p_departement + "'," +p_salaire +" )";
        prepareStatement = connection.prepareStatement(query);
        prepareStatement.executeUpdate(query);

        System.out.println("Fermeture des connexion...");
        prepareStatement.close();
        connection.close();


    }





    public void listerEmploye() {
        for (Employe tmp : registreEmploye
        ) {
            System.out.println(tmp);
        }
    }
}
