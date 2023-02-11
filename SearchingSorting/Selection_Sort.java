package SearchingSorting;

public class Selection_Sort {

    static void selectionSort(int nums[]){
        for(int i = 0; i < nums.length - 1; i++){
            int min = nums[i];
            int minIndex = i;

            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] < min){
                    min = nums[j];
                    minIndex = j;
                }
            }
            if(minIndex != i){
                nums[minIndex] = nums[i];
                nums[i] = min;
            }
        }
    }
    public static void main(String args[]){
        int nums[] = {2,6,9,1,5};

        selectionSort(nums);
        
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
