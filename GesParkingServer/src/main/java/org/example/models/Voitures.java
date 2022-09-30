package org.example.models;

import java.io.Serializable;

public class Voitures implements Serializable {
   private String matricule;
   private String type_vehicule;
   private Utilisateurs utilisateur;
   private String codeParking;

    public Voitures(String matricule, String type_vehicule, Utilisateurs utilisateur) {
        this.matricule = matricule;
        this.type_vehicule = type_vehicule;
        this.utilisateur = utilisateur;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getType_vehicule() {
        return type_vehicule;
    }

    public void setType_vehicule(String type_vehicule) {
        this.type_vehicule = type_vehicule;
    }

    public Utilisateurs getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateurs utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getCodeParking() {
        return codeParking;
    }

    public void setCodeParking(String codeParking) {
        this.codeParking = codeParking;
    }
}
