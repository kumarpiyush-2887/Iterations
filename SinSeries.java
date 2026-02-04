import java.util.*;
public class SinSeries {
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter value of x:");
        double x = gb.nextDouble();
        double term = x;
        double sum = term;
        double error = 1e-6;
        int n = 1;

        while(Math.abs(term)>error){
            term = -term*x*x/((2*n)*(2*n+1));
            sum+=term;
            n++;
        }

        System.out.println("sin("+x+") is: "+sum);
        gb.close();
    }
}
