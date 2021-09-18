package sort;

/**
 * @description:
 * @author: lugc
 * @time: 2021/9/18 18:19
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{12,2,3,14,5,6,12,1,9};
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i; j < arr.length; j++) {
                if(min>arr[j]){
                    min = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = min;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}