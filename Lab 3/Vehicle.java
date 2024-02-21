public class Vehicle{
    private int tankCapacity;
    private String fuelType;
    private static int plateNumberCounter = 1;//1.1
    private String plateID;//1.2
    private int vehicleClassification;
    
    //mutator
    private void setPlateID(){//1.3
        String counterToTwoSigFig = String.format("%02d",plateNumberCounter);
        this.plateID = "TAB" + counterToTwoSigFig;
        ++plateNumberCounter;
    }
    //accessor
    public String getPlateID(){//1.4
        return this.plateID;
    }
    private void setVehicleClassification(int classification){
        this.vehicleClassification = classification;
    }
    public Vehicle(int length, int breadth, int width){
        tankCapacity = length * breadth * width;
        if(tankCapacity%2 == 0)
            fuelType = "gasoline";
        else
            fuelType = "diesel";
        setPlateID();
        setVehicleClassification(3);//Default is 3 as per Table 1
    }
    
    public Vehicle (int length, int breadth, int width, int classification){//7
        this(length,breadth,width);
        setVehicleClassification(classification);
    }
    
    public String getVehicleClassification(int vehicleClassification){//5
        switch(vehicleClassification){
            case 1:
                return "Motorcycle";
            case 3:
                return "Light motor vehicle";
            case 4:
                return "Heavy motor vehicle";
            default:
                return "This classification doesn't exist D:";  
        }
    }
    public int getVehicleClassification(){//5
        return this.vehicleClassification;
    }
    
    public int getTankCapacity(){
        return tankCapacity;
    }
    
    public String getFuelType(){
        return fuelType;
    }
    public String toString(){//2
        return "VEHICLE TANK CAPACITY: "+ getTankCapacity() 
        + " FUEL TYPE: "+ getFuelType()
        + " PLATE ID: "+ getPlateID()
        + " VEHICLE CLASSIFICATION: "+ getVehicleClassification()
        + " " + getVehicleClassification(this.vehicleClassification);
    }
    public boolean equals(Object obj){//9
        if (obj instanceof Vehicle){
            Vehicle v = (Vehicle) obj; //casting is necessary
            String otherVehiclePlateID = v.getPlateID();
            boolean result = this.plateID.equals(otherVehiclePlateID);// string equality
            return result;
        }
        return false;
    }
    //Extra Exercises (from the bottom of the lab)
    //3
    //private void bonusSetPlateID(){//3}
}