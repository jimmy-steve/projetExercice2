package org.example.modele;

import java.util.Objects;

/**
 * classe employe
 */
public class Employe {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String departement;
    private double salaire;

    /**
     * constructeur par défault
     */
    public Employe() {
    }

    /**
     * constructeur surchargé
     * @param id
     * @param nom
     * @param prenom
     * @param email
     * @param departement
     * @param salaire
     */
    public Employe(int id, String nom, String prenom, String email, String departement, double salaire) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.departement = departement;
        this.salaire = salaire;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", departement='" + departement + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}
