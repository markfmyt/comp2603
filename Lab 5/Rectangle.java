import java.awt.geom.RoundRectangle2D;
import java.awt.Shape;

public class Rectangle extends SimpleShape{
    
    private int length;
    private int breadth;
    private int edgeRoundness;
    
    public Rectangle(int l, int b){
        length = l;
        breadth = b;
        edgeRoundness = 0;
        xLoc += length + 10;
        calculateArea();
    }
    public void calculateArea() {
        /*super.*/area = length * breadth;
        //very important, the area variable belongs to the super class
        //also notice that the area in the super class is "protected"
        //protected just means it can be modified by its children
    }
    public Shape draw(){
        return new RoundRectangle2D.Double(x,y,length ,breadth,edgeRoundness,edgeRoundness);
    }
    
    public void roundEdge(int curve){
        this.edgeRoundness = curve;
    }
    
    //4 // this is an example of method refinement
    // because it is using the parent's to string
    // as well as adding on extra information
    public String toString (){        
        return "Rectangle " + super.toString();
    } 

}
