public class VehicleDriver {
    private String name;
    private Vehicle vehicle1,vehicle2;//10
    
    public VehicleDriver(String name){
        this.name = name;
        this.vehicle1 = null;
        this.vehicle2 = null;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String toString(){
        return getName() +
        "\n 1. " + vehicle1.toString() +
        "\n 2. " + vehicle2.toString();
    }
    
    public boolean addVehicle(Vehicle v){
        if (v == null) return false;
        
        if (this.vehicle1 == null){
            this.vehicle1 = v;
        }
        else if (this.vehicle2 == null && this.vehicle1.equals(v) == false){
            this.vehicle2 = v;
        }
        else{//Both vehicle1 and vehicle2 are already set or v equals vehicle1
            return false;
        }
        return true;
    }
    //Extra Exercises (from the bottom of the lab)
    //2
    public boolean canDrive(Vehicle v){
        if (v == null) return false;
        if (v.equals(this.vehicle1) || v.equals(this.vehicle2))
            return true;
        return false;
    }
}
