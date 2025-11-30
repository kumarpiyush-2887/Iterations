import java.util.*;
public class SumSeries_3 {
    public static void main(String[]args){
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = gb.nextInt();
        double sum = 0;
        for(int i=1;i<=n;i++){
            sum+= Math.pow(-1,i+1)*((2.0*i)/(2*i-1));
        }
        System.out.println(sum);
    }
}

