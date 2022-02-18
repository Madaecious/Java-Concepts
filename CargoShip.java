//
//  Name:           Mark Barros
//  Course:         CS1400 - Intro to Programming and Problem Solving
//  Description:    This project demonstrates the use of classes, inheritance, polymorphism, arrays, the
//                  ArrayList class, constructors, accessors, mutators, and other concepts.
//

public class CargoShip extends Ship{

    // field declaration -------------------------------------------------------------------------------------------------------
    
    private int cargoCapacity;

    // constructor -------------------------------------------------------------------------------------------------------------

    public CargoShip(String shipName, String yearBuilt, int cargoCapacity){
        super(shipName, yearBuilt);
        setCargoCapacity(cargoCapacity);
    }

    // method definitions -----------------------------------------------------------------------------------------------------
    
    public int getCargoCapacity(){
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity){
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString(){
        return String.format("%-24s Cargo:  %,8d", shipName.replace("_", " "), cargoCapacity);
    }
}