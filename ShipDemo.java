//
//  Name:           Mark Barros
//  Course:         CS1400 - Intro to Programming and Problem Solving
//
//  Description:    This project demonstrates the use of classes, inheritance, polymorphism, arrays, the
//                  ArrayList class, constructors, accessors, mutators, and other concepts.
//

import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class ShipDemo{
      public static void main(String[] args){

        // field declarations -----------------------------------------------------------------------------------------------

        int shipTotal = 0,
            maxPassengers = 0,
            cargoCapacity = 0,
            passengerTotal = 0,
            tonnageTotal = 0;
        String companyDataFileName = "mycompany.dat",
               companyName = null,
               shipType = null,
               shipName = null,
               yearBuilt = null;
        ArrayList<Ship> alShips = new ArrayList<Ship>();

        // command line parameter handler ------------------------------------------------------------------------------

        if(args.length > 0){
            if(args.length == 1){
                companyDataFileName = args[0];
            }
            else{
                System.out.println("List a valid data file name after the ShipDemo command.");
                System.exit(0);
            }
        }

        // open company data file, feed data into ArrayList, calculate totals -----------------------------------------

        try{
            Scanner fileScanner = new Scanner(new File(companyDataFileName));
            companyName = fileScanner.nextLine();
            while(fileScanner.hasNext()){
                shipType = fileScanner.next();
                if(shipType.equals("c")){
                    shipName = fileScanner.next();
                    yearBuilt = fileScanner.next();
                    maxPassengers = fileScanner.nextInt();
                    passengerTotal += maxPassengers;
                    alShips.add(new CruiseShip(shipName, yearBuilt, maxPassengers));
               }else{
                    shipName = fileScanner.next();
                    yearBuilt = fileScanner.next();
                    cargoCapacity = fileScanner.nextInt();
                    tonnageTotal += cargoCapacity;
                    alShips.add(new CargoShip(shipName, yearBuilt, cargoCapacity));
                }
            }
            shipTotal = alShips.size();
            fileScanner.close();
         }
         catch(FileNotFoundException e){
            System.out.println("Cannot find the file '" + companyDataFileName + ".'");
            System.exit(0);
        }

        // transfer company data from ArrayList to array -----------------------------------------------------------------

        Ship arrShips [] = new Ship[alShips.size()];
        for(int i = 0 ; i < arrShips.length ; i++) arrShips[i] = alShips.get(i);
        alShips = null;
        
        // required output------------------------------------------------------------------------------------------------

        System.out.println();
        System.out.println("Welcome to " + companyName.replace("_", " ") + " by M. Barros");
        System.out.println();
        System.out.println("Ship name                Type");
        System.out.println("--------------------     ----------------");

        for (Ship aShip : arrShips) System.out.println(aShip.toString());

        System.out.println();
        System.out.println("Total Ships = " + shipTotal);
        System.out.println(String.format("Total Passengers = %,d", passengerTotal));
        System.out.println(String.format("Total Tonnage = %,d", tonnageTotal));
    }

}