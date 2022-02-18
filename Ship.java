//
//  Name:           Mark Barros
//  Course:         CS1400 - Intro to Programming and Problem Solving
//  Description:    This project demonstrates the use of classes, inheritance, polymorphism, arrays, the
//                  ArrayList class, constructors, accessors, mutators, and other concepts. 
//

public class Ship{
    // field declarations -------------------------------------------------------------------------------------------------

    protected String shipName;
    protected String yearBuilt;

    // constructor -------------------------------------------------------------------------------------------------------

    public Ship(String shipName, String yearBuilt){
        setShipName(shipName);
        setYearBuilt(yearBuilt);
    }

    // method definitions ------------------------------------------------------------------------------------------------

    public String getShipName(){
        return shipName;
    }

    public String getYearBuilt(){
        return yearBuilt;
    }

    public void setShipName(String shipName){
        this.shipName = shipName;
    }

    public void setYearBuilt(String yearBuilt){
        this.yearBuilt = yearBuilt;
    }

    public String toString(){
        return shipName + yearBuilt;
    }
}