/* Write a Java Program to find the difference between the sum of the squares of the first
one hundred natural numbers and the square of the sum.
Example:
The sum of the squares of the first ten natural numbers is, 12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is, 
(1 + 2 + ... + 10)2 = 552 = 3025 Hence the difference between the sum of the squares 
of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.*/
public class SumOfSquare_SumKaSquare {
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        int sumOfSquares=0, sum=0;
        for(int i=1;i<=100;i++){
            sumOfSquares+=i*i;
            sum+=i;
        }
        int sumKaSquare = sum*sum;
        int diff = Math.abs(sumKaSquare-sumOfSquares);
        System.out.println("Sum of squares of first 100 natural numbers is: "+sumOfSquares);
        System.out.println("Square of sum of first 100 natural numbers is: "+sumKaSquare);
        System.out.println("Difference = "+diff);
    }
}
