/*
Write a Java program that can take a positive integer greater than 2 as input and write out the
number of times one must repeatedly divide this number by 2 before getting a value less
than 2.
*/
import java.util.*;
public class DivideBy2 {
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter a positive number >2:");
        int n = gb.nextInt();
        int count = 0;
        while(n>2){
            n = n/2;
            count++;
        }
        System.out.println(count);
        gb.close();
    }
}
