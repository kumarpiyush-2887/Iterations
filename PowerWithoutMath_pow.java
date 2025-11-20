/* Write a Java program that accepts two numbers from the user — a base and an
exponent.
The program should calculate the result of raising the base to the power of the exponent
(i.e., base Exponent) without using any built-in power functions such as Math.pow(). */
import java.util.*;
public class PowerWithoutMath_pow {
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter the base:");
        int base = gb.nextInt();
        System.out.println("Enter the power:");
        int power = gb.nextInt();
        int res = 1;
        for(int i=1;i<=power;i++){
            res = res*base;
        }
        System.out.println(base+" raised to the power "+power+" is= "+res);
        gb.close();
    }
}
