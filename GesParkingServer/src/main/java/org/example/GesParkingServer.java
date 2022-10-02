package org.example;


import org.example.controller.ParkingController;
import org.example.controller.services.IParking;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class GesParkingServer {
    public static void main (String[] args){
       try{
           ParkingController gesParking = new ParkingController();
           IParking stub = (IParking) UnicastRemoteObject.exportObject(gesParking,0);
           LocateRegistry.createRegistry(8000);
           Naming.rebind("rmi://localhost:8000/parking", stub);
           System.out.println("Server started");


       } catch (RemoteException | MalformedURLException e){
           System.out.println(String.format("error: %s", e.getMessage()));
       }
    }
}
