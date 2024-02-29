import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

/*Code modified from Java Tutorial
 *https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/2d/geometry/examples/ShapesDemo2D.java
 * 
 */

public class ShapeScreen extends JApplet {
    
    final static int maxCharHeight = 15;
    final static int minFontSize = 10;
 
    final static Color bg = Color.white;
    final static Color fg = Color.black;
    final static Color red = Color.red;
    final static Color white = Color.white;
 
    final static BasicStroke stroke = new BasicStroke(2.0f);
    final static BasicStroke wideStroke = new BasicStroke(8.0f);
 
    final static float dash1[] = {10.0f};
    final static BasicStroke dashed = new BasicStroke(1.0f, 
                                                      BasicStroke.CAP_BUTT, 
                                                      BasicStroke.JOIN_MITER, 
                                                     10.0f, dash1, 0.0f);
    Dimension totalSize;
    FontMetrics fontMetrics;
    Graphics2D g2; 
    public void init() {
        //Initialize drawing colors
        setBackground(bg);
        setForeground(fg);
    }
    
    
    public ShapeScreen(){
        JFrame f = new JFrame("Shapes Demo ");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {System.exit(0);}
        });
        f.getContentPane().add("Center", this);
        init();
        f.pack();
        f.setSize(new Dimension(600,300));
        f.setVisible(true);
        
    }
    
  
    SimpleShape[] ss;
    
    public ShapeScreen(SimpleShape[] ss){
        this.ss = ss;
        JFrame f = new JFrame("Shapes Demo ");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {System.exit(0);}
        });
        f.getContentPane().add("Center", this);
        init();
        f.pack();
        f.setSize(new Dimension(600,300));
        f.setVisible(true) ;
        
    }
    
    
    
  public static void main(String[] args){
     JFrame f = new JFrame("Shapes Demo ");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {System.exit(0);}
        });
        JApplet applet = new ShapeScreen();
        f.getContentPane().add("Center", applet);
        applet.init();
        f.pack();
        f.setSize(new Dimension(600,300));
        f.setVisible(true);
        
  }
  
  public FontMetrics pickFont(Graphics2D g2,
                         String longString,
                         int xSpace) {
        boolean fontFits = false;
        Font font = g2.getFont();
        FontMetrics fontMetrics = g2.getFontMetrics();
        int size = font.getSize();
        String name = font.getName();
        int style = font.getStyle();
 
        while ( !fontFits ) {
            if ( (fontMetrics.getHeight() <= maxCharHeight)
                 && (fontMetrics.stringWidth(longString) <= xSpace) ) {
                fontFits = true;
            }
            else {
                if ( size <= minFontSize ) {
                    fontFits = true;
                }
                else {
                    g2.setFont(font = new Font(name,
                                               style,
                                               --size));
                    fontMetrics = g2.getFontMetrics();
                }
            }
        }
 
        return fontMetrics;
    }
    
    public void drawShape(SimpleShape s){
       java.awt.Shape o = s.draw();
       if(g2!= null){
        g2.setPaint(s.getColor());
        if(o!= null)
          g2.fill(o);
        }
     }
    
  
   public void paint(Graphics g) {
        g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Dimension d = getSize();
        int gridWidth = d.width / 6;
        int gridHeight = d.height / 2;
 
        fontMetrics = pickFont(g2, "Filled and Stroked GeneralPath",
                               gridWidth);
 
        Color fg3D = Color.lightGray;
 
        g2.setPaint(fg3D);
        g2.draw3DRect(0, 0, d.width - 1, d.height - 1, true);
        g2.draw3DRect(3, 3, d.width - 7, d.height - 7, false);
        g2.setPaint(fg);
 
        int x = 5;
        int y = 7;
        int rectWidth = gridWidth - 2*x;
        int stringY = gridHeight - 3 - fontMetrics.getDescent();
        int rectHeight = stringY - fontMetrics.getMaxAscent() - y - 2;
        
        g2.drawString("Shape Drawing", 5, 10);
       
        if(ss!= null)
        for(SimpleShape sh: ss)
           drawShape(sh);
        
    }
    
  
  
  
  
  
  
  
  
}
