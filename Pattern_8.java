/*

5 4 3 2 *
5 4 3 * 1
5 4 * 2 1
5 * 3 2 1
* 4 3 2 1

*/
public class Pattern_8 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            int n=5;
            for(int j=1;j<=5;j++){
                if(n!=i)
                    System.out.print(n+" ");
                else
                    System.out.print("* ");
                n--;
            }
            System.out.println();
        }
    }
}
