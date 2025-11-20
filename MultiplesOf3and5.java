/* Write a Java program to find the sum of all natural numbers within a given range
that are multiples of 3 or 5.
For example, if we list all the natural numbers below 10 that are multiples of 3 or 5,
we get 3, 5, 6, and 9.
The sum of these multiples is 23.
Your program should accept a positive integer N as input and display the sum of all the
multiples of 3 or 5 below N. */
import java.util.*;
public class MultiplesOf3and5 {
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter the range(N):");
        int n = gb.nextInt();
        int sum = 0;
        for(int i=1;i<n;i++){
            if(i%3==0 || i%5==0)
                sum+=i;
            
        }
        System.out.println("Sum of all multiples of 3 and 5 below "+n+" is= "+sum);
        gb.close();
    }
}
