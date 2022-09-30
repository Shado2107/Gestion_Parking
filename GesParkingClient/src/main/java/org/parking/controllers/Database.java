package org.parking.controllers;

import org.parking.models.Utilisateurs;
import org.parking.models.Voitures;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static List<Utilisateurs> utilisateurs = new ArrayList<>();
    private static List<Voitures> voitures = new ArrayList<>();
    private Database(){};

    public static void addVoiture( Voitures voiture){
        voitures.add(voiture);
    }

    public static List<Voitures> afficherVoitures(){
        return voitures;
    }

    public static void addUtilisateurs(Utilisateurs utilisateur){
        utilisateurs.add(utilisateur);
    }

    public static List<Utilisateurs> AfficherUtilisateur(){
        return utilisateurs;
    }
}
