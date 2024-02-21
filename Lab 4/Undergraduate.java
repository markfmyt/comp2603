public class Undergraduate extends Student{
    private String major;
    private String minor;
    private int credits;
    
    //Constructor
    public Undergraduate(){}
    
    //Accessors
    public String getMajor(){return this.major;}
    public String getMinor(){return this.minor;}
    public int getCredits(){return this.credits;}
    //Mutators
    public void setMajor(String M){ this.major = M;}
    public void setMinor(String m){ this.minor = m;}
    public void setCredits(int credits){
        this.credits = credits;
        calculateFees();
    }
    
    public String toString(){
        String newToString = super.toString();
        newToString += " UNDERGRAD Major: " + getMajor() + " Minor:" + getMinor()
        + "Credits: " + getCredits();
        
       return newToString;
    }
    public void calculateFees(){
        super.setFees(this.credits*200);
    }
 
     
}
