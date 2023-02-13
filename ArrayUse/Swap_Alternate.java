package ArrayUse;

public class Swap_Alternate {
    static void SwapAlternate(int arr[]) {
        
        for (int i = 0; i < arr.length - 1; i = i + 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        
        }
        
    }

    public static void main(String args[]) {
        int arr[] = { 1, 5, 3, 8, 2 };

        SwapAlternate(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
