
import java.util.Scanner;
public class power {
    int powern(int n){
         if(n==0){
            return 1;
         }
    return 2*powern(n-1);
    }
    public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
   int n=sc.nextInt();
   power pcal= new power();
      System.out.println(pcal.powern(n)) ;


    }
    
}
