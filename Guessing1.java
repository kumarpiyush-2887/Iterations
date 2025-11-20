/* Write a Java program using a do-while loop to repeatedly ask the user to enter a
number, and display whether it is even or odd.
The program should stop when the user enters 0. */
import java.util.*;
public class Guessing1 {
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter a number(0 to stop)");
            n = gb.nextInt();
            if(n==0)
                System.out.println("Program terminated");
            
            else if(n%2==0)
                System.out.println(n+" is even number");
            
            else
                System.out.println(n+" is odd number");
            
        }while(n!=0);
        gb.close();
    }
}
