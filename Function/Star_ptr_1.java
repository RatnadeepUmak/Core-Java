package Function;
import java.util.*;
public class Star_ptr_1 {

    static void printStar(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        printStar(n);
    }
}
