import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class Circle extends SimpleShape{
  
    protected int radius;
    
    public Circle(int r) {
       radius = r;
       xLoc += radius + 10;
       calculateArea();
    }
    
    public String toString(){
        return "Circle " + super.toString();
    }
    public void calculateArea() {
        /*super.*/area = Math.PI * radius * radius;
        //very important, this area variable belongs to the super class
        //also notice that the area in the super class is "protected"
        //protected just means it can be modified by its children
    }

    public Shape draw(){
        //https://docs.oracle.com/javase/7/docs/api/java/awt/geom/Ellipse2D.Double.html#Ellipse2D.Double(double,%20double,%20double,%20double)
        return new Ellipse2D.Double(x,y,radius,radius);
        //To understand the above, refer to the documentation link above
    }
}
