package org.example.data;

import java.sql.*;

public class BaseDeDonnee {
    public static Connection connection = null;
    public static PreparedStatement prepareStatement = null;
    static String query = null;
    static ResultSet resultSet = null;

    public static void seConnecter() throws SQLException {
        System.out.println("Connexion à la bd...");
        connection =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/exercice2", "root",
                        "Lareaultlaval7");
    }
    public static void seDeconnecter() throws SQLException {
        System.out.println("\nFermeture de la connexion...");
        prepareStatement.close();
        connection.close();
    }
}
