import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
// import java.awt.geom.RoundRectangle2D;
import java.awt.Shape;

public class Rectangle extends SimpleShape {

    private int length;
    private int breadth;
    private int edgeRoundness;

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
        edgeRoundness = 0;
        xLoc += length + 10;
        calculateArea();
    }

    // mutators
    public void calculateArea() {
        area = length * breadth;
    }

    public String toString() {
        return "Rectangle " + super.toString();
    }

    public void roundEdge(int curve) {
        edgeRoundness = curve;
    }

    public Shape draw() {
        return new RoundRectangle2D.Double(x, y, length, breadth, edgeRoundness, edgeRoundness);
    }
}
