package org.parking;

import org.parking.controllers.ParkingController;
import org.parking.controllers.services.IParking;
import org.parking.models.Utilisateurs;
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

        ParkingController controller = new ParkingController(new ParkingView());
        Scanner scanner = new Scanner(System.in);
        controller.run();
    }
}
