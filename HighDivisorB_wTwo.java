/*(A divisor of a number is any positive integer that divides the number exactly,
including 1 and the number itself.
Write a Java program that accepts two integers, n1 and n2, and finds the number
between n1 and n2 (inclusive) that has the highest number of divisors.
Your program should:
1. Read two integers: n1 and n2
2. Check every integer from n1 to n2
3. Count all divisors of each number
4. Determine the number that has the most divisors.
5. If two numbers have same divisor count, the program selects the larger
number.
6. Display:
o The number with the highest number of divisors
o The total number of divisors it has  */
import java.util.*;
public class HighDivisorB_wTwo {
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int n1 = gb.nextInt();
        int n2 = gb.nextInt();
        int highest=0;
        int count = Integer.MIN_VALUE;
        for(int i=n1;i<=n2;i++){
            int c=0;
            for(int j=1;j<=i;j++){
                if(i%j==0)
                    c++;
            }
            if(c>count){
                count=c;
                highest=i;
            }
            else if(c==count){
                count=c;
                highest = i>highest?i:highest;
            }
        }
        System.out.println("number with maximum divisors: "+highest);
        System.out.println("Number of divisors of "+highest+" is: "+count);
        gb.close();
    }
}
