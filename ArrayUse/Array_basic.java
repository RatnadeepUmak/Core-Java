package ArrayUse;
import java.util.*;
public class Array_basic {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int arr[] = new int[n];
        arr[3] = n; //initialize value at 3rd index..
        System.out.println(arr[3]);

        char chArray[] = new char[n]; // before initializing value it is null
        chArray[0] = 'a';
        System.out.println(chArray[0]);
        double dArray[] = new double[n];
        dArray[1] = n;
        System.out.println(dArray[1]); 

        boolean bArray[] = new boolean[5];
        System.out.println(bArray[0]);

    }
    
}
