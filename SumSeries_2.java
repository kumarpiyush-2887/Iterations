/* Write a program that will read the value of n from the user and calculate sum of 
the following series:
(1/1^2) + (1/2^2) + (1/3^2) + (1/4^2) + ..... + (1/n^2). */
import java.util.*;
public class SumSeries_2 {
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = gb.nextInt();
        double sum = 0;
        for(int i=1;i<=n;i++){
            sum+=1/Math.pow(i,2);
        }
        System.out.println("Sum of the given series is: "+sum);
        gb.close();
    }
}
