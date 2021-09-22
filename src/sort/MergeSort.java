package sort;

/**
 * @description:
 * @author: lugc
 * @time: 2021/9/22 15:05
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{12,2,3,14,5,6,12,1,9};
        mergeSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    public static void mergeSort(int[] arr,int left,int right){
        if(left==right){
            return;
        }
        int mid = (left+right)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        int[] temp = new int[arr.length];
        merge(arr,temp,left,mid,right);
    }
    public static void merge(int[] arr,int[] temp,int left,int mid,int right){
        int leftIndex = left;
        int rightIndex = mid+1;
        int index = left;
        //1 3 6 9 | 2 7 8  445
        while (leftIndex <= mid && rightIndex <= right){
            if(arr[leftIndex] <= arr[rightIndex]){
                temp[index] = arr[leftIndex];
                index ++;
                leftIndex++;
            }else{
                temp[index] = arr[rightIndex];
                index ++;
                rightIndex++;
            }
        }
        for (int i = leftIndex; i <= mid; i++) {
            temp[index] = arr[leftIndex];
            index++;
        }
        for (int i = rightIndex; i <= right; i++) {
            temp[index] = arr[rightIndex];
            index++;
        }
        for (int i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
    }
}