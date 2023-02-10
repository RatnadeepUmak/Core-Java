package ArrayUse;
public class Linear_Search {

    static int linearSearch(int arr[], int x){
        // int val = 0;
        for(int i = 0; i < arr.length; i++){
            if(x == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,5,2,8,34,9};
        int index = linearSearch(arr, 9);
        System.out.println(index);
    }
}
    

