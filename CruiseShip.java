//
//  Name:           Mark Barros
//  Course:         CS1400 - Intro to Programming and Problem Solving
//  Description:    This project demonstrates the use of classes, inheritance, polymorphism, arrays, the
//                  ArrayList class, constructors, accessors, mutators, and other concepts.
//

public class CruiseShip extends Ship{
    // field declaration -------------------------------------------------------------------------------------------------------

    private int maxPassengers;

    // constructor --------------------------------------------------------------------------------------------------------------

    public CruiseShip(String shipName, String yearBuilt, int maxPassengers){
        super(shipName, yearBuilt);
        setMaxPassengers(maxPassengers);
    }

    // method definitions ------------------------------------------------------------------------------------------------------

    public int getMaxPassengers(){
        return maxPassengers;
}

    public void setMaxPassengers(int maxPassengers){
        this.maxPassengers = maxPassengers;
    }

    @Override
    public String toString(){
        return String.format("%-24s Cruise:  %,7d", shipName.replace("_"," "), maxPassengers);
    }
}