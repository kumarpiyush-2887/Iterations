/* Write a Java Program to print the following output using for loop. Where, input is 
the number of rows in output pattern. 
For input, N = 4.
1
121
1213121
121312141213121 */
import java.util.*;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = gb.nextInt();
        String pat="";
        System.out.println("The pattern is:");
        for(int i=1;i<=rows;i++){
            pat = pat + i + pat;
            System.out.println(pat);
        }
        gb.close();
    }
}
