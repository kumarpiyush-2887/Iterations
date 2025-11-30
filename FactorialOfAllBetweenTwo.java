/* WAP to calculate and display the factorial of all numbers between m and n (where m < n, m
> 0, n > 0)
Sample run:
Enter the value of m: 2
Enter the value of n: 5
Factorial of 2 is: 2
Factorial of 3 is: 6
Factorial of 4 is: 24
Factorial of 5 is: 120 */

import java.util.*;
public class FactorialOfAllBetweenTwo {
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter value of m (Smaller number):");
        int m = gb.nextInt();
        System.out.println("Enter value of n (larger number):");
        int n = gb.nextInt();
        int factorial = 1;
        for(int i=1;i<=m;i++){
            factorial = factorial*i;
        }
        for(int i=m;i<=n;i++){
            System.out.println("Factorial of "+i+" is: "+factorial);
            factorial = factorial*(i+1);
        }
        gb.close();
    }
    
}