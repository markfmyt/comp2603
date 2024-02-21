import java.util.*;
public class StationSimulation{//3
    //kind of weird but math.random generates a number
    //between 0 to 1 and the * is to scale the number
    //the int cast is to truncate the decimal
    public static int getRandomNumber(int min, int max){
        return (int) ((Math.random()*(max - min)) + min);
    }
    public static int getRandClassification(){
        int num = getRandomNumber(1,3);
        if (num == 2)
            num = 4; //ensures equal probability
        return num;
    }
    public static Vehicle generateVehicle(){
        //Vehicle(int length, int breadth, int width, int classification)
        int length = getRandomNumber(1,10);
        int breadth = getRandomNumber(1,10);
        int width = getRandomNumber(1,10);
        int classification = getRandClassification();//8
        return new Vehicle(length,breadth,width,classification);
    }
    public static void main(String args[]){
        
        StationSimulation station = new StationSimulation();
        ArrayList<Vehicle> automobiles = new ArrayList<Vehicle>();
        //make the 10 vehicle objects
        for (int i = 0; i < 10; i++){
            automobiles.add(generateVehicle());
        }
        
        // print their details
        //System.out.println(automobiles);
        for (int i = 0; i < 10; i++){
            System.out.println(automobiles.get(i));
        }
        
        //13
        ArrayList<VehicleDriver> drivers = new ArrayList<VehicleDriver>();
        String [] names = {"Lou" , "Sue", "Drew", "Koo", "Murphy"};
        for (int i = 0; i < 5; i++){
            drivers.add(new VehicleDriver(names[i]));
        }
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        for (int i = 0; i < 10; i++){
            vehicles.add(generateVehicle());
        }
        
        //assign all 5 drivers ONE random vehicle
        
        for (VehicleDriver driver : drivers){
            int index = StationSimulation.getRandomNumber(0,10);
            Vehicle v = vehicles.get(index);
            driver.addVehicle(v);
        }
        
        //The do while is very important cause think about this
        //a driver isnt allowed to be assigned the same car twice
        //and we are randomly assigning cars, there is a chance
        //we will assign him the same car twice, but with the do while
        //it keeps assigning until the driver has 2 unique cars
        //even more important, the do while won't work without first assigning 1 driver
    
        for (VehicleDriver driver : drivers){
            Vehicle v;
            do{
                int index = StationSimulation.getRandomNumber(0,10);
                v = vehicles.get(index);
            }while (driver.addVehicle(v) == false);
        }
        
        System.out.println("\n\n");
        for (VehicleDriver driver: drivers){
            System.out.println(driver);
        }
        //Extra Exercise (from the bottom of the lab)
        //1
        System.out.println(vehicles.get(1).equals(vehicles.get(2)));
                
    }
}