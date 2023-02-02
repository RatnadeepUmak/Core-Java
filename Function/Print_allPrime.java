package Function;
import java.util.*;
public class Print_allPrime {

    static boolean isPrime(int n){
        int count = 0;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 2){
            return true;
        }else{
            return false;
        }
    }

    static void printPrime(int n){
        for(int i = 1; i <= n; i++){
            boolean isPrime = isPrime(i);
                if(isPrime){
                System.out.println(i);
                }
            
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printPrime(n);

    }
}
