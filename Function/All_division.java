package Function;
import java.util.*;
public class All_division {

    static void printDivison(int n){
        System.out.println("All Divisions are: ");
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i+" ");
                }
        }
}    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n =s.nextInt();
        printDivison(n);
        return;
        
    }
}
