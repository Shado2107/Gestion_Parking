package org.example.controller;

import org.example.controller.services.IParking;
import org.example.models.Utilisateurs;
import org.example.models.Voitures;


import java.rmi.RemoteException;
import java.util.Random;
import java.util.Scanner;

public class ParkingController implements IParking {
    private static final Random RANDOM = new Random();
    Scanner scanner = new Scanner(System.in);

    @Override
    public String creerUtilisateur(Utilisateurs utilisateur) throws RemoteException{
        Database.addUtilisateurs(utilisateur);
        return "Utilisateur enrégistré avec success";
    }

    @Override
    public String creerVoiture(Voitures voiture, Utilisateurs utilisateur) throws RemoteException{
        System.out.println(Database.afficherVoitures().size());
        if (Database.AfficherUtilisateur().size() > 5 ){
            return "Désolé! nous n'avons plus de place sur notre parking pour vous stationner";
        }
        voiture.setCodeParking("AIT"+RANDOM.nextInt());
        Database.addVoiture(voiture);
        return "Voici votre de stationnement"+ voiture.getCodeParking();
    }

    @Override
    public String recupererVoiture(String codeParking) throws RemoteException{
        Database.AfficherUtilisateur();
        for(int i = 0; i< Database.afficherVoitures().size(); i++){
            if (Database.afficherVoitures().get(i).getCodeParking().equalsIgnoreCase(codeParking)){
                Database.afficherVoitures().remove(i);
                return "Merci de nous avoir fait confiance";
            }
        }
        return null;
    }

}
