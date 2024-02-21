public class Postgraduate extends Student{
    String supervisor;
    String thesisTitle;
    String status;
    
    public Postgraduate(String name, String supervisor, String thesisTitle){
       super(name);
       this.supervisor = supervisor;
       this.thesisTitle = thesisTitle;
       setStatus("full-time");
    }
    private void setStatus (String status){
       this.status = status;
       calculateFees();
    }
    public String toString(){
       String newToString = super.toString();
       newToString += " POSTGRAD Supervisor:" + this.supervisor + " Thesis: " + this.thesisTitle;
       return newToString;
    }
    public void calculateFees(){
       if (this.status.equalsIgnoreCase("part-time")){
           super.setFees(1325.0);
       }
       if (this.status.equalsIgnoreCase("full-time")){
           super.setFees(2650.0);
       }
       
    }
}
