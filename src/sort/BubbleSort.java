package sort;

import java.util.Arrays;

/**
 * @description:
 * @author: lugc
 * @time: 2021/9/18 17:08
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{12,2,3,14,5};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
               if(arr[j]>arr[j+1]){
                   temp = arr[j+1];
                   arr[j+1] = arr[j];
                   arr[j] = temp;
               }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}