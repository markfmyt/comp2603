public class Ticket{
    
    private int ticketNumber;
    private static int ticketNumberCounter = 100;
    
    public Ticket(){
        ticketNumber = ticketNumberCounter;
        ticketNumberCounter = ticketNumberCounter + 1;
    }
    public void setTicketNumber(int ticketNumber){
        this.ticketNumber = ticketNumber;
    }
    public String toString(){
        return "Ticket: " + ticketNumber;
    }
    
    public boolean equals (Object obj){
        if (!(obj instanceof Ticket))
            return false;
        Ticket t = (Ticket) obj;
        return t.ticketNumber==this.ticketNumber;
    }
    
    public int hashCode(){
        String bruh = ""+this.ticketNumber;
        return bruh.hashCode();
    }
    
}
