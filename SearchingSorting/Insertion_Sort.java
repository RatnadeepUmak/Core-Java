package SearchingSorting;

public class Insertion_Sort {

    static void insertionSort(int nums[]){
        for(int i = 1; i < nums.length; i++){
            int j = i - 1;
            int temp = nums[i];

            while(j >= 0 && nums[j] > temp){
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = temp;
        }
    }
    public static void main(String args[]){
        int nums[] = {1,7,4,0,9,4};

        insertionSort(nums);

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
