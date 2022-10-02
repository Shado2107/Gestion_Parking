package org.parking.views;

import org.parking.controllers.ParkingController;
import org.parking.controllers.services.IParking;
import org.parking.models.Utilisateurs;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

import static java.rmi.Naming.lookup;

public class ParkingView {

    private ParkingController controller;
    private Scanner scanner;

    public ParkingView() {
        scanner = new Scanner(System.in);
    }

    public void setController(ParkingController controller) {
        this.controller = controller;
    }




    public void promtForUserInput() throws RemoteException {

        Scanner scanner = new Scanner(System.in);
        Utilisateurs utilisateur = null;
        String message ="";
        Menus menu= new Menus();


        }
}
