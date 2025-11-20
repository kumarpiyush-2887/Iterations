/* Write a Java Program to check whether a number is divisible by 9. Use while loop.
Rule: An integer n is divisible by 9 if the sum of its digits is divisible by 9. 
Use this concept in your program to determine whether or not the number is 
divisible by 9. */
import java.util.*;
public class DivisibleBy9 {
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = gb.nextInt();
        int sum=0;
        for(int i=n;i!=0;i/=10){
            int dig = i%10;
            sum+=dig;
        }
        if(sum%9==0)
            System.out.println(n+" is divisible by 9.");

        else
            System.out.println(n+" is not divisible by 9.");
        
        gb.close();
    }
}
