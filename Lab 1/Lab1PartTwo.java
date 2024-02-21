import java.util.Scanner;
public class Lab1PartTwo {
    public static void main (String [] args){
        System.out.println("My name is Mark");
        System.out.println("My name is Mark Katwaroo");
        String lastname;
        lastname="Katwaroo";
        System.out.println("My name is Mark" + lastname);
        System.out.println("My name is Mark " + " Katwaroo");
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Hi, what's your name");
        String var = keyboard.nextLine();
        System.out.println("Nice to meet you " + var + "!");
        
        String bruh = "abracadabra";
        String abc = bruh.substring(0,2) + bruh.substring(4,5);
        //the substring function goes from that particular
        //index(the first parameter). then it stops at the value
        //of the second parameter - 1
        //can think of it as highlighting "abr", then minus the last element, so left with ab
        //same think with 4,5, think of it as "ca", then minus the last one, so just a
        System.out.println(abc);
    }
}