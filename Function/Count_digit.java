package Function;
import java.util.*;
public class Count_digit {

    static int count(int n){
        int cnt = 0;
        while(n > 0){
            // int lastDigit = n % 10;
            cnt = cnt + 1;
            n = n / 10;
        }
        return cnt;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // int cnt;
        System.out.println(count(n));
        
    
    } 
}
