import java.util.*;
public class CosSeries {
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter value of x:");
        double x = gb.nextDouble();
        double term = 1;
        double sum = term;
        double error = 1e-6;
        int n=1;

        while(Math.abs(term)>error){
            term = -term*x*x/((2*n-1)*(2*n));
            sum+=term;
            n++;
        }

        System.out.println("cos("+x+"): "+sum);
        gb.close();
    }
}
