public class Passenger{
    
    private String name;
    private Ticket ticket;
    
    public Passenger(){
    }
    public Passenger(String name){
        this.name = name;
        ticket = new Ticket();
    }
    public Passenger(Ticket ticketObject){
        ticket = ticketObject;
    }
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setTicket(Ticket ticket){
        this.ticket = ticket;
    }
    public Ticket getTicket(){
        return ticket;
    }
    
    public String getPatronIdentifier(){
       return name + ticket.toString();
    }
    
    public int hashCode(){
        String hashCodeString = name + ticket.toString();
        return hashCodeString.hashCode();
    }
    
    public boolean equals(Object obj){
        if(obj instanceof Passenger){
            //1 - cast to Passenger and then get the name
            Passenger p = (Passenger)obj;
            String incomingName = p.getName();
            //2 - check if my name == your name
            if(this.getName().equals(incomingName))
                return true;
            //3 - Passenger have different names => not equal
            return false;
        }
        throw new ClassCastException();
    }
    
    public String toString(){
        String s =  "Passenger: " ;
        if(name != null)
            s += name;
        s += " " + ticket.toString();
        return s;
    }
    
}