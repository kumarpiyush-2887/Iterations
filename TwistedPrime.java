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
        boolean prime1=true, prime2=true;
        for(int i=2;i<=(int)(Math.sqrt(n));i++){
            if(n%i==0){
                prime2=false;
                break;
            }
        }
        for(int i=2;i<=(int)(Math.sqrt(revNo));i++){
            if(revNo%i==0){
                prime2=false;
                break;
            }
        }
        if(prime1 && prime2)
            System.out.println(n+" is a twisted prime.");
        else
            System.out.println(n+" is not a twisted prime.");
        gb.close();
    }
}
