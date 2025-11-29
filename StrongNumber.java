/*A Strong number is a number in which the sum of the factorials of its digits is equal
to the number itself.
Example:
145 is a Strong number because:
1! = 1
4! = 24
5! = 120
Sum = 1 + 24 + 120 = 145

Write a Java Program that checks whether a given number is a Strong number or
not.
Use loops and conditional statements. */
import java.util.*;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = gb.nextInt();
        int sum = 0;
        for(int i=n;i!=0;i/=10){
            int dig = i%10;
            int product = 1;
            for(int j=1;j<=dig;j++){
                product*=j;
            }
            sum+=product;
        }
        if(sum==n)
            System.out.println(n+" is a Strong number:");
        else
            System.out.println(n+" is not a Strong Number");
        gb.close();
    }
}
