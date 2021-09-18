package sort;

/**
 * @description:
 * @author: lugc
 * @time: 2021/9/18 17:27
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{12,2,3,14,5,6,12,1,9};
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {

            for (int j = 0; j < i; j++) {
                if(arr[j]>arr[i]){
                    temp = arr[i];
                    for (int k = i; k > j; k--) {
                        arr[k] = arr[k-1];
                    }
                    arr[j] = temp;
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}