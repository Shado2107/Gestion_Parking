package org.parking.models;

import java.io.Serializable;

public class Utilisateurs implements Serializable {

    private String id;
    private String Nom;
    private String Prenom;

    public Utilisateurs(String id, String nom, String prenom) {
        this.id = id;
        Nom = nom;
        Prenom = prenom;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

}

