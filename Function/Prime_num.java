package Function;
import java.util.*;
public class Prime_num {

    static void checkPrime(int n){
        int count = 0;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Prime..!");
        }else{
            System.out.println("Not Prime..!");
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();

        checkPrime(n);
        return;
    }
}
