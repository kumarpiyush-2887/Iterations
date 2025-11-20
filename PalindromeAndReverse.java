/* Write a Java Program that takes an integer as input and reverses its digits using a
while loop.
After reversing, the program should check whether the number is a palindrome.
A palindrome number is one that remains the same when its digits are reversed.
For example, 121 and 1221 are palindrome numbers, but 123 is not. */
import java.util.*;
public class PalindromeAndReverse {
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = gb.nextInt();
        int revNo = 0;
        for(int i=n;i!=0;i/=10){
            int dig = i%10;
            revNo = revNo*10+dig;
        }
        System.out.println("Reversed number is: "+revNo);
        if(n==revNo)
            System.out.println(n+" is a palindrome number");
        
        else
            System.out.println(n+" is not a palindrome number");
        
        gb.close();
    }
}
