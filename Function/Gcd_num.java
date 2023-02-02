package Function;
import java.util.*;
public class Gcd_num {

    static void printGcd(int n1, int n2){
        int gcd = 1;

        for(int i = 1; i <= n1; i++){
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
              
            }
           
        }
        System.out.print("GCD is: "+gcd+" ");
    }
  
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = s.nextInt();
        System.out.println("Enter second number: ");
        int n2 = s.nextInt();

        printGcd(n1, n2);
        return;

    }
}
