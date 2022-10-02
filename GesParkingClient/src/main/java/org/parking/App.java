package org.parking;

import org.parking.controllers.ParkingController;
import org.parking.controllers.services.IParking;
import org.parking.models.Utilisateurs;
import org.parking.views.Menus;
import org.parking.views.ParkingView;

import java.net.MalformedURLException;

import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws RemoteException, NotBoundException, MalformedURLException
    {

       try{
           IParking parking = (IParking) Naming.lookup("rmi://localhost:8000/parking");
           ParkingController controller = new ParkingController(new ParkingView());
           controller.run();
           Scanner scanner = new Scanner(System.in);
           Utilisateurs utilisateur = null;
           String message ="";
           Menus menu= new Menus();


           int i = 1;
           while (i == 1) {
               System.out.println("Faites votre choix:");
               System.out.println("1. Stationner vehicule");
               System.out.println("2. Recuperer  vehicule");
               System.out.println("3. Quitter");

               int choice = scanner.nextInt();

               switch (choice){
                   case 1:
                       menu.stationner(utilisateur, parking);
                       i=1;
                       break;
                   case 2:
                       menu.recuperer(parking);
                       i=1;
                       break;
                   case 3:
                       i=2;
                       break;

               }


           }

       } catch (RemoteException | NotBoundException | MalformedURLException e){
           System.out.println(String.format("error: %s", e.getMessage()));
       }



    }
}
