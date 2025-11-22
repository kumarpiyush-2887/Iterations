/* WAP to enter the first number and second number. Display the prime numbers between the
first and second number.
Sample run:
Enter the first number: 4
Enter the second number: 15
Prime numbers between 4 and 15 are: 5 7 11 13 */

import java.util.*;
public class PrimeBetweenTwo{
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1 = gb.nextInt();
        System.out.println("Enter second number:");
        int n2 = gb.nextInt();
        System.out.print("Prime numbers between "+n1+" and "+n2+" are: ");
        for(int i=n1;i<=n2;i++){
            int f=0;
            for(int j=1;j<=i;j++){
                if(i%j==0)
                    f++;
            }
            if(f==2)
                System.out.print(i+" ");
        }
        System.out.println();
        gb.close();
    }
} 