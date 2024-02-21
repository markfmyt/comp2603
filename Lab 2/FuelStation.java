public class FuelStation{
    private String fuelType;
    private double fuelVolume;
    private double fuelRate;
    private double fuelSales;
    
    public FuelStation(){
        this.fuelType = "gasoline";
        this.fuelVolume = 75000.0;
        this.fuelRate = 2.0;
        this.fuelSales = 0.0;
    }
    
    public String getFuelType(){
        return fuelType;
    }
    
    public double getFuelVolume(){
        return fuelVolume;
    }
    
    public double getFuelRate(){
        return fuelRate;
    }
    
    public double fuelSales(){
        return fuelSales;
    }
    
    public String toString(){
        String ans = "";
        ans += "FUEL:"+ fuelType + " VOL:" + fuelVolume + 
        "L PRICE PER L:$"+ fuelRate + " SALES:$" + fuelSales;
        return ans;
    }
    private boolean sellFuel(double volume) {
        if ((fuelVolume - volume) < 0 || volume <= 0){
            return false;//check if !enuf vol and if negative vol then dont sell (user error)
        }
        
        fuelVolume -= volume;
        fuelSales += volume * fuelRate;
        
        return true;
    }
    
    public boolean canDispenseFuelType(String fuelType) {
        return fuelType.equalsIgnoreCase(this.fuelType);
        //fuel type inside the ()is an instant of the object FuelStation
        //but fuelType (before the .equals) is a method/function within here
    }
    public boolean dispense(String fuelType, double volume){
        if(!canDispenseFuelType(fuelType)){
            return false;
        }
        
        return sellFuel (volume);//this could also return false if not enuf fuel
    }
}