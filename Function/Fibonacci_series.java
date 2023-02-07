package Function;

import java.util.Scanner;

public class Fibonacci_series {
    static void fibo(int size, int a, int b){
        int temp = 0;
        for(int i = 1; i <= size; i++){
            temp = a + b;
            System.out.print(temp+" ");
            a = b;
            b = temp;
        }
        // return temp;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");

        // System.out.print(fibo(size, a, b));
        fibo(size, a, b);
        
    }

}
