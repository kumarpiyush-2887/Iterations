 /* 
        1
      2 2
    3 3 3
  4 4 4 4
5 5 5 5 5
*/
public class Pattern_7 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=5;j>i;j--){
                System.out.print("\t");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+"\t");
            }
            System.out.println();
        }
        
    }
}
