package ArrayUse;

public class Find_Duplicate {
    static int findDuplicate(int arr[]){
        int temp =0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    temp = arr[i];
                }
            }
        }
        return temp;
    }
    public static void main(String args[]){
        int arr[] = {0,2,1,3,2};

        System.out.print("Duplicate value is: "+findDuplicate(arr));
    }
}
