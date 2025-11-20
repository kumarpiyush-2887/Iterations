/* Write a Java Program that finds greatest common divisor (GCD) of two numbers
using Euclid's algorithm, which is an iterative computation based on the following
observation:
If y divides x, the GCD of x and y is y; otherwise, the GCD of x and y is same as GCD
of x % y and y. */
import java.util.*;
public class Euclids_Algo {
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int x = gb.nextInt();
        int y = gb.nextInt();
        int a=x, b=y;
        while(b!=0){
            int temp = b;
            b = a%b;
            a=temp;
        }
        System.out.println("GCD of "+x+" and "+y+" is: "+a);
        gb.close();
    }
}
