import java.awt.Color;
public class ShapeRunner{
    public void task3 (){
        SimpleShape s1 = new SimpleShape();
        Rectangle s2 = new Rectangle (50,100);
        System.out.println(s1.toString());//Area 0.0
        System.out.println(s2.toString());//Area 0.0
    }
    
    public void task5 (){
        SimpleShape s1 = new SimpleShape();//inheritence
        SimpleShape s2 = new Rectangle (50,100);//polymorphism
        System.out.println(s1.toString());//Area 0.0
        System.out.println(s2.toString());//Area 0.0
    }
    
    public void task7 (){
        SimpleShape s3 = new Circle(50);//polymorphism
        System.out.println(s3.toString());
    }
    public void task8 (){
        Circle s4 = new Circle(30);//inheritence
        Rectangle s5 = new Rectangle(300,100);//inheritence
        System.out.println(s4.toString());
        System.out.println(s5.toString());
    }
    public void task9(){
        System.out.println("I think all is from the subclass");
    }
    public void restOfTasks(){
        
        SimpleShape[] shapes = new SimpleShape[5];
        SimpleShape s1 = new SimpleShape();	 	//inheritence
        SimpleShape s2 = new Rectangle (50,100);	//polymorphism
        SimpleShape s3 = new Circle(50); 			//polymorphism
        Circle s4 = new Circle(30); 			//inheritence
        Rectangle s5 = new Rectangle(300,100);		//inheritence

        shapes[0] = s1;
        shapes[1] = s2;
        shapes[2] = s3;
        shapes[3] = s4;
        shapes[4] = s5;
        //11b Yes it did work because Circle and Rectangle are subsets of SimpleShape
        for (SimpleShape ss: shapes){
            System.out.println(ss.toString());
        }
        
        //this line of code is the reason why the shapes are printed
        //as the lab said it analyzes the shape and prints it to the screen
        //given that the draw() mtehod returns a shape object
        ShapeScreen screen = new ShapeScreen(shapes);
        
        //it is also important to note that the way it determines the shape
        //is in the return statement of the draw method of each respective shape
        //if you see Ellipse2D then you know its a circle
        //if you see RoundRectangle2D then you know its a....
        
        //part 2, #6
        //Color is a library, saying Color.red returns red from the library
        //https://docs.oracle.com/javase/8/docs/api/java/awt/Color.html
        for (SimpleShape ss: shapes) {
            ss.setColor(Color.red);
        }
        
        //part 2, #7
        //You would need to change the instances of circles to black
        for (SimpleShape ss: shapes){
            if (ss instanceof Circle)
                ss.setColor(Color.black);
        }
        
        //part 2, #11 No it can only work for s5 
       //s2.roundEdge(35);
       //to get it to work for s2 you need to cast
       ((Rectangle) s2).roundEdge(35);
       s5.roundEdge(35);
       
       //part 2, #12 you need to cast a circle...duhhhhhhh
        for (SimpleShape ss: shapes){
            if (ss instanceof Rectangle) 
                ((Rectangle) ss).roundEdge(35);
        }
                
       //part 2, #13
       //could vary from person to person but im doing it based on what we have
       //so far and reversing the changes (ik i retarded)
       
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle && i == 3) {//if its the smaller circle
                shapes[i].setColor(Color.red);//no casting necessary as 
                //the SimpleShape already has setcolor and
                //upon the running of the loop it will detect the instanceof
                //and will be overridden with the setcolor from circle
            } 
            else if (shapes[i] instanceof Rectangle) {
                shapes[i].setColor(Color.BLUE);
                ((Rectangle) shapes[i]).roundEdge(35);
                if (i == 1){
                    ((Rectangle) shapes[i]).roundEdge(0);
                }
            }
        }
        
    }
    public static void main(String[] args){
         
        ShapeRunner shapeRunner = new ShapeRunner();
        //shapeRunner.task3();
        //shapeRunner.task5();
        //shapeRunner.task7();
        //shapeRunner.task8();
        //shapeRunner.task9();
        shapeRunner.restOfTasks();
    }
}
