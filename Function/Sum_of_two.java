package Function;
import java.util.*;
public class Sum_of_two {

    static int sum(int num1, int num2){
        int num3 = num1 + num2;
        return num3;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        int result = sum(num1, num2);
        System.out.println(result);
    }
}
