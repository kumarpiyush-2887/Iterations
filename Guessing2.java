/* Write a Java program that generates a random integer number between 1 and 10.
The program should repeatedly ask the user to guess the number until the correct guess
is made.
• If the user’s guess is greater than the random number, display the message:
"Too high, try again."
• If the user’s guess is less than the random number, display the message:
"Too low, try again."
• If the user guesses correctly, display the message:
"Good guess!"
The program must use a do-while loop to continue prompting the user until the correct
number is guessed */
import java.util.*;
public class Guessing2 {
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        int guess = 1+(int)(Math.random()*(10-1+1));
        System.out.println("Guess a number b/w 1 to 10:");
        int user;
        do{
            System.out.println("Enter your guess:");
            user = gb.nextInt();
            if(user==guess)
                System.out.println("Good guess!!");
            
            else if(user>guess)
                System.out.println("Too high, try again.");
            
            else if(user<guess)
                System.out.println("Too low, try again.");
            
        }while(user!=guess);
        gb.close();
    }
}
