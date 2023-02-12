package SearchingSorting;

public class Merge_Sort {

    static int[] mergeSort(int nums1[], int nums2[]) {
        int i = 0;
        int j = 0;
        int k = 0;
        int nums3[] = new int[nums1.length + nums2.length];

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                nums3[k] = nums1[i];
                i++;
                k++;
            } else {
                nums3[k] = nums2[j];
                j++;
                k++;
            }
        }
        while (i < nums1.length) {
            nums3[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            nums3[k] = nums2[j];
            j++;
            k++;
        }
        return nums3;

    }

    public static void main(String args[]) {
        int nums1[] = { 2, 6, 9, 15 };
        int nums2[] = { 1, 4, 6, 7 };
        int nums3[] = mergeSort(nums1, nums2);

        for(int i = 0; i < nums3.length; i++){
            System.out.print(nums3[i]+" ");
        }

    }
}
