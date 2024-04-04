import java.util.*;
public class Lab10{
    
    public static int getRandomNumber(int min, int max){//From Lab 4
        return (int) ((Math.random()*(max - min)) + min);
    }
    public static void main (String args[]){
        System.out.println("\n-------------------Part 1-------------------\n");
        TreeMap <String,Passenger> passengers;
        
        //part 1a
        Passenger p1 = new Passenger ("Joe");
        Passenger p2 = new Passenger ("Sid");
        Passenger p3 = new Passenger ("Lou");
        Passenger p4 = new Passenger ("Gil");
        Passenger p5 = new Passenger ("Moe");
        
        passengers = new TreeMap<>();
        //part 1b
        passengers.put(p1.getName(),p1);
        passengers.put(p2.getName(),p2);
        passengers.put(p3.getName(),p3);
        passengers.put(p4.getName(),p4);
        passengers.put(p5.getName(),p5);
        
        //part 1c       
        for (String key : passengers.keySet())
            System.out.println(passengers.get(key).toString());
        
        
        Passenger gil = passengers.get("Gil");
        System.out.println((gil == null) ? "Not found" : gil);
        
        /* NullPointerException will occur
        p2.setName("Syd");
        Passenger syd = passengers.get("Syd");
        Ticket sydsTicket = syd.getTicket();
        System.out.println(sydsTicket);
        */
       
        //part 1d (i) - Error because we didn't properly update the object
        //in the passengers collection, below is corrected code
        
        //part 1d (ii) - what must be done is we supposed to retrieve
        //the object from the passengers collection and then do the setname
        //after we did the setname then we can retrieve the ticket
        //using the new name Syd, you could have also get the ticket
        //before doing the update, it doesnt really matter
        Passenger syd = passengers.get("Sid");
        if (syd != null){
            syd.setName("Syd");
            Ticket sydsTicket = syd.getTicket();
            System.out.println("\nPassenger: "+syd.getName()+" "+sydsTicket);
        }
        else{
            System.out.println("Syd's ticket was not found or syd was not found");
        }
    
    
        System.out.println("\n-------------------Part 2-------------------\n");
        
        //part 2a
        /*Before modification
        for(int i = 0; i<5; i++){
            Vehicle v = new Vehicle(getRandomNumber(1,20),
                getRandomNumber(1,5),
                getRandomNumber(1,5),
                getRandomNumber(1,5));
                System.out.println(v);
        }
        */
       

        //part 2b
        //After modifcation
        String [] plateIDs = {"RLM01", "CTJ02", "DSC03", "MYA04", "BTN05"};
        ArrayList <Vehicle> vehiclesUno = new ArrayList<>();
 
        for(int i = 0; i<5; i++){
            Vehicle v = new Vehicle(
                plateIDs[i],
                getRandomNumber(1,5),
                getRandomNumber(1,5),
                getRandomNumber(1,5));
            System.out.println(v);
            vehiclesUno.add(v);
        }
        //part 2c to get it to work, you need a comparable in the vehicle class
        TreeMap <Vehicle,Passenger> vehicles = new TreeMap<>();
        vehicles.put(vehiclesUno.get(0),p1);
        //part 2d
        vehicles.put(vehiclesUno.get(3),p3);
        vehicles.put(vehiclesUno.get(1),p5);
        
        //**Viewing the order of the mappings**//
        //part 2d the order is achieved because the treemap maintains the order based
        //on our implemented comparable, additionally we cud supply a comparator
        for (Vehicle key : vehicles.keySet()){
            System.out.println("Vehicle: " + key.toString() +
                                " Passenger: " + vehicles.get(key).toString());
        }
        
        //part 2e
        Vehicle v6 = new Vehicle("CTJ02",getRandomNumber(1,5),getRandomNumber(1,5),getRandomNumber(1,5));
        vehicles.put(v6, p2);
        System.out.println("-------------------Part 2(e)-------------------\n");
        //you cud just print the whole treemap using println but this neater and readable
        for (Vehicle key : vehicles.keySet()){
            System.out.println("Vehicle: " + key.toString() +
                                " Passenger: " + vehicles.get(key).toString());
        }
        //part 2e (i) it got updated since CTJ02 vehicle already exists
        //part 2e (ii) no its not possible since treemaps doh allow duplicate values
        
        System.out.println("\n-------------------Part 3-------------------\n");
        //part 3a
        HashMap <Ticket,Passenger> ticketList = new HashMap <>();
        //part 3b
        ticketList.put(p1.getTicket(),p1);//Joe 100
        ticketList.put(p2.getTicket(),p2);//Sid 101
        ticketList.put(p3.getTicket(),p3);//Lou 102
        ticketList.put(p4.getTicket(),p4);//Gil 103
        ticketList.put(p5.getTicket(),p5);//Moe 104
        
        
        Ticket tx = new Ticket();
        tx.setTicketNumber(100);
        ticketList.put(tx, p3);//Lou with 100
        System.out.println("\nPart 3(c)(i)");
        //this below loop is gpt buh like if you just print the ticketlist jusso it go look ugly
        for (Map.Entry<Ticket, Passenger> entry : ticketList.entrySet()) {
            System.out.println(entry.getKey() + " - Passenger: " + entry.getValue().getName());
        }
        //part 3c Answer from chatgpt but it correk ;)
        /*
        When attempting to insert a new Ticket object tx with the ID 
        100 for passenger p3 (Lou), it might not work as expected. 
        This is because when you insert tx into the HashMap ticketList,
        it's compared based on the hashCode() and equals() methods of the 
        Ticket class. By default, if these methods are not overridden in 
        the Ticket class, each new Ticket object will have a different hash 
        code and will not be considered equal to any existing Ticket objects 
        in the HashMap, regardless of having the same ticket number. As a
        result, tx will be inserted as a new entry in the HashMap rather 
        than replacing an existing one for passenger p3 (Lou).
        */
        Ticket ty = new Ticket();
        ty.setTicketNumber(100);
        ticketList.remove(ty);
        System.out.println("\nPart 3(c)(ii)");
  
        for (Map.Entry<Ticket, Passenger> entry : ticketList.entrySet()) {
            System.out.println(entry.getKey() + " - Passenger: " + entry.getValue().getName());
        }
        /*
        This will not work because...verified AI Sol:
        Removing a Ticket object with ID 100 as a key from the HashMap 
        ticketList may not work as expected. This is because when you 
        attempt to remove an entry from the HashMap, it is based on the 
        key's hashCode() and equals() methods. By default, if these methods 
        are not overridden in the Ticket class, each new Ticket object 
        will have a different hash code and will not be considered equal 
        to any existing Ticket objects in the HashMap, even if they have 
        the same ticket number.

        So, in this case, the remove() method is unlikely to remove the entry 
        associated with the Ticket object ty, even if it has the same ticket 
        number as the Ticket object inserted earlier. This happens because ty is 
        a new instance of the Ticket class, and its hashCode() and equals() methods 
        are not overridden to compare ticket numbers.

        To address part (iii), you can make sure that the Ticket object ty is equal 
        to the Ticket object previously added to the map before attempting to remove it. 
        This can be achieved by overriding the equals() and hashCode() methods in 
        the Ticket class to compare ticket numbers. Once these methods are correctly
        implemented, the remove() method will be able to remove the entry associated 
        with the Ticket object ty from the HashMap ticketList.
        */
        
        Ticket tz = new Ticket();
        tz.setTicketNumber(100);
        System.out.println("Part 3(c)(iii)\n"+ ticketList.containsKey(tx));
        System.out.println("Part 3(c)(iii)\n"+ ticketList.containsKey(ty));
        System.out.println("Part 3(c)(iii)\n"+ ticketList.containsKey(tz));
        
        /*
        (i) After attempting to insert Ticket object tx (ID: 100) for passenger Lou:
        If Ticket objects are compared based on their IDs using equals() and hashCode()
        methods, tx will be considered equal to the existing Ticket object in the 
        ticketList with the same ID. So, tx will not be added as a new entry, and the 
        ticketList will get updated.
        
        (ii) Try to remove Ticket object with ID 100 as a key from the ticketList:
        If the equals() and hashCode() methods are correctly implemented, 
        ticketList.remove(ty) will successfully remove the entry associated 
        with the Ticket object ty from the ticketList, assuming ty represents the
        same Ticket object as the one previously added with ID 100.
        
        (iii) After attempting to remove Ticket object with ID 100 as a key from 
        the ticketList:
        Similar to part (ii), if equals() and hashCode() are correctly implemented, 
        ticketList.remove(ty) will successfully remove the entry associated with the
        Ticket object ty from the ticketList, assuming ty represents the same Ticket 
        object as the one previously added with ID 100.        
        
        so it went from
        
        true false false
        
        to
        
        false false false
        as expected
        */
        
    }

}
