package ArrayUse;

public class Find_unique {
    static int findUnique(int arr[]){
        int res = arr[0];
        for(int i = 1; i < arr.length; i++){
           
            res = res ^ arr[i];
            
        }
        return res;
    }
    public static void main(String args[]){
        int arr[] = {2,11,8,11,2};
        int index = findUnique(arr);
        System.out.print(index);
    } 
    
}
