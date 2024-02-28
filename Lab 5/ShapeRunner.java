import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class ShapeRunner {
	public static void main(String[] args) {
		SimpleShape[] shapes = new SimpleShape[5];
		shapes[0] = new SimpleShape();
		shapes[1] = new Rectangle(50, 100);
		shapes[2] = new Circle(40);
		shapes[3] = new Circle(30);
		shapes[4] = new Rectangle(300, 100);

		ShapeScreen screen = new ShapeScreen(shapes);
		screen.init();
		JFrame frame = new JFrame("Shape Screen");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(screen);
		frame.setSize(new Dimension(600, 300));
		frame.setVisible(true);

		// Set colors and draw shapes
		for (SimpleShape shape : shapes) {
			if (shape instanceof Rectangle) {
				shape.setColor(Color.blue);
				Rectangle rectangle = (Rectangle) shape;
				rectangle.roundEdge(35);
				screen.drawShape(rectangle);
			} else {
				screen.drawShape(shape);
			}
		}
	}
}
