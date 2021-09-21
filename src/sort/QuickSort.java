package sort;

/**
 * description: QuickSort <br>
 * date: 2021/9/21 23:58 <br>
 * author: lgc <br>
 * version: 1.0 <br>
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{12,2,3,14,5,6,12,9};
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void quickSort(int [] arr,int leftIndex,int rightIndex){
        if (leftIndex >= rightIndex) {
            return;
        }
        int pivot = arr[rightIndex];
        int left = leftIndex;
        int right = rightIndex;
        while(left != right){
            while (pivot >= arr[left] && left < right){
                left++;
            }
            arr[right] = arr[left];

            while (pivot <= arr[right] && left < right){
                right--;
            }
            arr[left] = arr[right];
        }
        arr[left] = pivot;
        quickSort(arr,leftIndex,left - 1);
        quickSort(arr,right + 1,rightIndex);
    }
}
