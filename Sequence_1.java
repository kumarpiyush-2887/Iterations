/* Given a=0, b=1 and c=1 are the first three numbers of some sequence. All other numbers in
the sequence are generated from the sum of their three most recent predecessors. Write a java
program to generate this sequence up to n terms where n > 3. */
import java.util.*;
public class Sequence_1 {
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter value of n (n>3)");
        int n = gb.nextInt();
        System.out.println("The series is:");
        int ft=0,st=1,tt=1,nt=0;
        System.out.print(ft+" "+st+" "+tt+" ");
        for(int i=1;i<=n-3;i++){
            nt = ft + st + tt;
            System.out.print(nt+" ");
            ft=st;
            st=tt;
            tt=nt;
        }
        System.out.println();
        gb.close();
    }
}
