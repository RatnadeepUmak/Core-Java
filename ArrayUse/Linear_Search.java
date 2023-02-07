package ArrayUse;
import java.io.LineNumberInputStream;
import java.util.*;
public class Linear_Search {
    
    static int linearSearch(int input[], int x){

        for(int i = 0; i < input.length; i++){
            if(input[i] == x){
            return i;     
            }
        }
        return -1;
        
    }
    public static void main(String args[]){
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int x = s.nextInt();
            // System.out.println(x+" "+linearSearch(n  , x));
    }
    
}
