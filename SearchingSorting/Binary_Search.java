package SearchingSorting;

public class Binary_Search {

    static int binarySearch(int arr[], int x){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;
            if(x == arr[mid]){
                return mid;
            }else if(x > arr[mid]){
                start = mid + 1;
            }else{
                end  = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,4,7,10,34,40,60,98};
        int index = binarySearch(arr, 10);
        System.out.println(index);
    }
}
