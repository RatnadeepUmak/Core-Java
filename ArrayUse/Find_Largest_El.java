package ArrayUse;

import java.util.*;

public class Find_Largest_El {

    static int largestInArray(int input[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
        }
        return max;
    }

    static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int size = s.nextInt();
        int input[] = new int[size];
        System.out.println("Enter the array: ");
        for (int i = 0; i < size; i++) {

            input[i] = s.nextInt();
        }
        return input;
    }

    public static void print(int input[]) {
        int size = input.length;
        System.out.println("Your array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = takeInput();
        print(arr);
        int largest = largestInArray(arr);
        System.out.println("Largest is: " + largest);
    }
}
