package StarPattern;
import java.util.*;
public class Star_ptr_4 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*n - (2*i + 1); j++){
                System.out.print("*");
            }
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
