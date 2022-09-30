package org.parking.controllers.services;

import org.parking.models.Utilisateurs;
import org.parking.models.Voitures;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IParking  extends Remote {
    public String creerUtilisateur(Utilisateurs utilisateur) throws RemoteException;
    public String creerVoiture(Voitures voiture, Utilisateurs utilisateur) throws RemoteException;
    public String recupererVoiture(String codeParking) throws RemoteException;
}
