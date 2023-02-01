package Function;
import java.util.*;
public class Reverse_Num {

    static int reverse_Number(int n){

        int revN = 0;

        while(n > 0){
            int lastDigit = n % 10;
            n = n / 10;
            revN = (revN * 10) + lastDigit;
        }
        return revN;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = s.nextInt();

        System.out.println("Reverse Number is: "+reverse_Number(n));
    }
}
