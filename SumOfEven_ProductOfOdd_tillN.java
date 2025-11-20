/* Write a Java Program to print the sum of all even numbers and the product of all odd
numbers from 1 to N.
Where, N is the input to the program.
Example:
For input, N = 10
Sum of all even numbers = 2 + 4 + 6 + 8 + 10 = 30
Product of all odd numbers = 1 * 3 * 5 * 7 * 9 = 945 */
import java.util.*;
public class SumOfEven_ProductOfOdd_tillN {
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = gb.nextInt();
        int sum=0, product=1;
        for(int i=1;i<=n;i++){
            if(i%2==0)
                sum+=i;
            
            else
                product*=i;
            
        }
        System.out.println("Sum of all even numbers till "+n+" is= "+sum);
        System.out.println("Product of all odd numbers till "+n+" is= "+product);
        gb.close();
    }
}
