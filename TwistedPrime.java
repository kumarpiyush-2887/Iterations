/*WAP to check whether a number is twisted prime or not. Twisted prime is a number if 
the number and its reverse both are prime then it is called twisted prime.*/
import java.util.*;
public class TwistedPrime {
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = gb.nextInt();
        int revNo = 0;
        for(int i=n;i!=0;i/=10){
            int dig = i%10;
            revNo = revNo*10 + dig;
        }
        int f1 = 0, f2 = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                f1++;
        }
        for(int i=1;i<=revNo;i++){
            if(revNo%i==0)
                f2++;
        }
        if(f1==2 && f2==2)
            System.out.println(n+" is a twisted prime.");
        else
            System.out.println(n+" is not a twisted prime.");
        gb.close();
    }
}
