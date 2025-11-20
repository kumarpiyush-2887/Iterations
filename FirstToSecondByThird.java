/* Write a Java Program that gets three integer numbers from the user. Count from the
first number to the second number increments by the third number. Use for loop to do
it.
Also, display the sum of numbers displayed between the first number and second
number.  */
import java.util.*;
public class FirstToSecondByThird {
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter first integer:");
        int n1 = gb.nextInt();
        System.out.println("Enter second integer:");
        int n2 = gb.nextInt();
        System.out.println("Enter third integer:");
        int n3 = gb.nextInt();
        int sum = 0;
        for(int i=n1;i<=n2;i+=n3){
            System.out.print(i+"\t");
            sum+=i;
        }
        System.out.println("\nSum of numbers displayed is: "+sum);
        gb.close();
    }
}
