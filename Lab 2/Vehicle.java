public class Vehicle{
    private int tankCapacity;
    private String fuelType;
    
    //this is a constructor, cause it initializes the variables above
    public Vehicle(int length, int width, int breadth){
        this.tankCapacity = length*width*breadth;
        if (this.tankCapacity%2 == 1) //have to put the == 1, this is why c++ > java
            this.fuelType = "diesel";
        else
            this.fuelType = "gasoline";
        
    }
    //this is a accessor because it accesses the private values and returns something
    public String toString(){
        return "VEHICLE TANK CAPACITY: " + this.tankCapacity + " FUEL TYPE: " + fuelType;
    }
    public int getVehicleCapacity(){//need ah accessor to access the private variables
        return tankCapacity;
    }
    public String getVehicleFuelType(){
        return fuelType;
    }
}
