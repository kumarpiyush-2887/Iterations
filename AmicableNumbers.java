/* Amicable numbers are pair of numbers each of whose divisors are added to give the
other number. Example: The smallest pair of amicable numbers is (220, 284).
They are amicable because the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20,
 22, 44, 55 and 110, of which the sum is 284; and the proper divisors of 284 are 1, 2,
  4, 71 and 142, of which the sum is 220.
Note: 1 is included as a divisor but the numbers are not included as their own divisors.
Write a java program that tests whether a given pair of numbers is amicable numbers 
or not. */
import java.util.*;
public class AmicableNumbers {
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1 = gb.nextInt();
        System.out.println("Enter second number:");
        int n2 = gb.nextInt();
        int sum1=1, sum2=1; // Since 1 will be factors of both

        for(int i=2;i<=n1/2;i++){
            if(n1%i==0)
                sum1+=i;
        }

        for(int i=2;i<=n2/2;i++){
            if(n2%i==0)
                sum2+=i;
        }

        if(sum1==n2 && sum2==n1)
            System.out.println(n1+" and "+n2+" are amicable numbers.");
        else
            System.out.println(n1+" and "+n2+" are not amicable numbers.");
        gb.close();
    }
}
