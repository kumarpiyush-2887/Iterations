/* Write a Java Program to display the multiplication table of a number entered by the
user.
The program should use three different types of loops to print the table in parts as
follows:
• Use a for loop to print the table from 1 to 3
• Use a while loop to print the table from 4 to 6
• Use a do-while loop to print the table from 7 to 10 */
import java.util.*;
public class Tables {
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter a number to print table for:");
        int n = gb.nextInt();
        int i;

        System.out.println("Using for loop(1 to 3)");
        for(i=1;i<=3;i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }

        System.out.println("Using while loop(4 to 6)");
        while(i<=6){
            System.out.println(n+" x "+i+" = "+(n*i));
            i++;
        }
        
        System.out.println("Using do-while loop(7 to 10)");
        do{
            System.out.println(n+" x "+i+" = "+(n*i));
            i++;
        }while(i<=10);
        gb.close();
    }
}
