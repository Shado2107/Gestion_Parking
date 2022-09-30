package org.parking.views;

import org.parking.controllers.ParkingController;
import org.parking.models.Utilisateurs;

import java.rmi.RemoteException;
import java.util.Scanner;

public class ParkingView {

    private ParkingController controller;

    private Scanner scanner;
    public ParkingView(){
        scanner = new Scanner(System.in);
    }

    public void setController(ParkingController controller) {
        this.controller = controller;
    }



    public void promtForUserInput() throws RemoteException {
        System.out.println("Faites votre choix:");
        System.out.println("1. Stationner mon véhicule");
        System.out.println("2. Recuperer mon vehicule");
        System.out.println("3. Quitter l'application");

        int choice = scanner.nextInt();

        if(choice == 1){
            controller.stationnerVehicule();
        } else if(choice == 2) {
            controller.recupererVehicule();
        }else{
            controller.StopApp();
        }
    }
}
