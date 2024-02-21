import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException; //This class is to handle errors opening files
import java.util.ArrayList;

public class StationSimulation{
    public static Vehicle createVehicle (String data){
            String[] values = data.split(",");
            int length = Integer.parseInt(values[0]);
            int width = Integer.parseInt(values[1]);
            int breadth = Integer.parseInt(values[2]);
            Vehicle vehicle = new Vehicle (length,width,breadth);
            return vehicle;
    }
    public static void main (String[]args){
        FuelStation station = new FuelStation();
        /*System.out.println(station.toString());
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the type of fuel:");
        String type = input.nextLine();
        
        System.out.println("Enter the amount of fuel you want to dispense:");
        double amt = input.nextDouble();
        
        if (station.dispense(type,amt)){//this calls the 2 other functions, kill 3 birds 1 stone
            System.out.println("Congrats, you just dispensed " + amt + "L of " + type);
        }
        else{
             System.out.println("We don't have enough " + type + " in stock D:");
             System.exit(1);
        }*/
        System.out.println(station.toString());
        //hadda declare the array list outside so it could be accessed later on
        //i could have just print it on the fly buh, i wanted to experiment with it
        ArrayList<Vehicle> arr = new ArrayList <Vehicle>();
        
        try{
            File myObj = new File("vehicles.txt");
            //The myObj below basically takes everything
            //from the file,and reads it, just like how it reads everything
            //from system.in, same here
            Scanner reader = new Scanner(myObj);
            while (reader.hasNextLine()){
                String data = reader.nextLine();
                //System.out.println("Vehicle data: " + data);
                Vehicle vehicle = createVehicle(data);
                arr.add(vehicle);
                //System.out.println (vehicle.toString());
            }
        }catch (FileNotFoundException e) {//straight from geeks for geeks xD
            System.out.println("Error opening file!");
            e.printStackTrace();
        }
        //FuelStation station = new FuelStation();
        //remember this defined above, we will use it below
        for (Vehicle car: arr){
            System.out.println(car.toString());
            
            System.out.println("Filled up: " +
            (station.dispense(car.getVehicleFuelType(), car.getVehicleCapacity()) ? "True" : "False"));
            
            System.out.println(station.toString() + "\n");
        }
    }
}
