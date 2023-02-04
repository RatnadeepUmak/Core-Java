package ArrayUse;
import java.util.*;
public class Return_Array_Sum {

    static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int size = s.nextInt();
        int input[] = new int[size];
        
        System.out.println("Enter the array: ");
        for(int i = 0; i < size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }

    static int sum(int input[]){
        int sum = 0;
        
        for(int i = 0; i < input.length; i++){
            sum = sum + input[i];
        }
        return sum;
    }
    public static void main(String args[]){
        int arr[] = takeInput();
        int total = sum(arr);
        System.out.println("Sum is: "+total);
    }    
}
