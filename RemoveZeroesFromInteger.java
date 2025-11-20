/* Write a Java Program to take an integer input from the user and print the input by
removing all zeros.
Example:
Input = 10200 then Output = 12. */
import java.util.*;
public class RemoveZeroesFromInteger{
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n = gb.nextInt();
        int newNo=0, place=1;

        for(int i=n;i!=0;i/=10){
            int dig = i%10;
            if(dig!=0){
                newNo = newNo + (dig*place);
                place*=10;
            }
        }

        System.out.println("After removing zeroes from "+n+", the integer is: "+newNo);
        gb.close();
    }
}