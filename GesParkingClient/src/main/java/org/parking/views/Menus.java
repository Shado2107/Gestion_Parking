package org.parking.views;

import org.parking.controllers.services.IParking;
import org.parking.models.Utilisateurs;
import org.parking.models.Voitures;

import java.rmi.RemoteException;
import java.util.Scanner;

public class Menus  {

    Scanner scanner = new Scanner(System.in);

    public void stationner(Utilisateurs utilisateur, IParking parking) throws RemoteException {
        System.out.println("*********Informations client****************");
        System.out.println("Saisir l'identifiant de l'utilisateur");
        String id = scanner.next();

        System.out.println("Saisir le nom de l'utilisateur");
        String nom = scanner.next();

        System.out.println("Saisir le prenom de l'utilisateur");
        String prenom = scanner.next();
        utilisateur = new Utilisateurs(id, nom, prenom);

        String  message = parking.creerUtilisateur(utilisateur);
        System.out.println(message);

        System.out.println("*********Informations Vehicule****************");
        System.out.println("Saisir le matricule de votre voiture");
        String matricule = scanner.next();
        System.out.println("Saisir le type de votre voiture");
        String typeVoiture = scanner.next();

        Voitures voiture = new Voitures(matricule,typeVoiture,utilisateur);
        message = parking.creerVoiture(voiture,utilisateur);
        System.out.println(message);
    }

    public void recuperer(IParking parking) throws RemoteException {
        System.out.println("Merci de renseigner votre code de parking avant de sortir");
        String code = scanner.next();
        String message = parking.recupererVoiture(code);
        System.out.println(message);
    }
}
