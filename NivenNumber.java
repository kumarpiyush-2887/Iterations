/* Write the Java Program to check whether a number is a “Niven number” or not.
A number is called as the Niven number if the number is divisible by its sum. */
import java.util.*;
public class NivenNumber {
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = gb.nextInt();

        // Calculating the sum
        int sum = 0;
        for(int i=n;i!=0;i/=10){
            int dig = i%10;
            sum+=dig;
        }

        //Checking and displaying for niven
        if(n%sum==0)
            System.out.println(n+" is a niven number");
        
        else
            System.out.println(n+" is not a niven number");
        
        gb.close();
    }
}
