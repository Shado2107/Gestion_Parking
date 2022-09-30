package org.parking.views;

import org.parking.controllers.services.IParking;
import org.parking.models.Utilisateurs;
import org.parking.models.Voitures;

import java.rmi.RemoteException;
import java.util.Scanner;

public class Menus {
    Scanner scanner = new Scanner(System.in);

    public void stationnerActions(Utilisateurs utilisateur, IParking parking) throws RemoteException {
        System.out.println("########### INFORMATION CLIENT ###########");
        System.out.println("Identifiant de l'utlisateur");
        String id= scanner.next();

        System.out.println("Nom de l'utilisateur");
        String nom = scanner.next();

        System.out.println("Prenom de l'utilisateur");
        String prenom = scanner.next();

        utilisateur = new Utilisateurs(id, nom, prenom);
        String message = "";
        System.out.println(message);

        System.out.println("########### Enregistrement du vehicule ###########");
        System.out.println("Matricule du vehicule");
        String matricule = scanner.next();
        System.out.println("Type de la voiture");
        String type = scanner.next();

        Voitures voiture = new Voitures(matricule,type, utilisateur);
        message = parking.creerVoiture(voiture,utilisateur);
        System.out.println(message);
    }

    public void recupererActions(IParking parking) throws RemoteException{
        System.out.println("Votre code de parking");
        String code = scanner.next();
        String message = parking.recupererVoiture(code);
        System.out.println(message);
    }
}
