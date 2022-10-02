package org.parking.controllers;

import org.parking.controllers.services.IParking;
import org.parking.models.Utilisateurs;
import org.parking.models.Voitures;
import org.parking.views.Menus;
import org.parking.views.ParkingView;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParkingController  {

    private ParkingView view;
    private IParking parking;
    private static List<Utilisateurs> users =  new ArrayList<>();
    private static List<Voitures> voitures = new ArrayList<>();
    Menus menus = new Menus();
    Utilisateurs utilisateur = null;
    String message= "";


    public ParkingController(ParkingView view){
        this.view = view;
        this.view.setController(this);
    }


    public void run() throws RemoteException {
        while (true){
            view.promtForUserInput();
        }
    }

    public void recupererVoiture(IParking parking) throws RemoteException {
        menus.recuperer(parking);
    }

    public void stationnerVehicule(Utilisateurs utilisateur, IParking parking) throws RemoteException {
        menus.stationner(utilisateur,parking);
    }

    public void StopApp(){
        System.exit(0);
    }
}
