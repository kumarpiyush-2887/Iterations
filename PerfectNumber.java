/* Write a Java Program to check if a number is perfect number or not.
Hints: A number N is called perfect number, if the sum of factors except N as a factor
is equals to the number N.
Example: N = 28 is a perfect number as (1 + 2 + 4 + 7 + 14 = 28.) */
import java.util.*;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = gb.nextInt();
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i==0)
                sum+=i;
        }
        if(n==sum)
            System.out.println(n+" is a perfect number.");
        
        else
            System.out.println(n+" is not a perfect number.");
        
        gb.close();
    }
}
