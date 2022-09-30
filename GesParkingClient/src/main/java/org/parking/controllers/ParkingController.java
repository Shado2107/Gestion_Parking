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
        try{
            this.parking = (IParking) Naming.lookup("rmi://localhost:2000/parking");

        }catch(MalformedURLException | RemoteException | NotBoundException e){
            e.printStackTrace();
        }
    }



    public void run() throws RemoteException {
        while (true){
            view.promtForUserInput();
        }
    }

    public void recupererVehicule() throws RemoteException {
        menus.recupererActions(parking);
    }

    public void stationnerVehicule() throws RemoteException {
        menus.stationnerActions(utilisateur,parking);
    }

    public void StopApp(){
        System.exit(0);
    }
}
