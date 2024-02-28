import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class Circle extends SimpleShape {

    protected int radius;

    public Circle(int r) {
        radius = r;
        xLoc += radius + 10;
        calculateArea();
    }

    public void calculateArea() {
        area = Math.PI * (radius * radius);
    }

    public String toString() {
        return "Circle " + super.toString();
    }

    public Shape draw() {
        return new Ellipse2D.Double(x, y, radius, radius);
    }

}
