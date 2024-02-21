import java.util.Scanner;
import java.util.Random;
public class Lab1PartThree{
    
    public static void exercise1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        float r = input.nextFloat();
        System.out.print("A circle with radius " + r +
        " has an area of ");
        System.out.printf("%.2f",(Math.PI * r * r));
        //"%.2f" is to round to 2 decimal places
        //Everything after is considered the variable
        //to be rounded
    }
    public static void exercise2(){
        System.out.print("\nEnter a value for n");
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        while ((n < 2)){
            System.out.println ("\nEnter a number greater than 1 plz");
            n = input.nextInt();
        }
        for (int i = 2; i <= n; i+=2){
            System.out.print(i + " ");
        }
    }
    public static void exercise3(){
        Random r = new Random();
        int rint1 = r.nextInt(100) + 1, rint2 = r.nextInt(100) +1;
        //100 limits the integer generation from 0 to 99
        // and to plus 1 makes it from 1 to 100, that way
        // we don't multiply a number by 0
        System.out.println ("What is the product of " + rint1 +
        " and " + rint2 +"?");
        Scanner input = new Scanner(System.in);
        int userAnswer = input.nextInt();
        if (userAnswer == (rint1 * rint2)){
            System.out.println ("Correct!");
        }
        else{
            System.out.println ("The answer is " + (rint1*rint2));
        }
        
    }
    public static void exercise4 (){
        String [] words = {"hi","howdy-doo","hey"};
        int len = words.length;
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        String val = "hymc";
        while (!val.equalsIgnoreCase("exit")){
            System.out.println(words[r.nextInt(words.length)]);
            val = input.nextLine();
        }
    }
    public static void main (String[] args){
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }
}