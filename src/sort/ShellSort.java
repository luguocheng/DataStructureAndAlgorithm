package sort;

/**
 * description: ShellSort <br>
 * date: 2021/9/21 10:16 <br>
 * author: lgc <br>
 * version: 1.0 <br>
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[]{12,2,3,14,5,6,12,9};
        int gap = arr.length;
        int temp = 0;
        while(true){
            gap = gap/2;
            for (int i = 0; i < arr.length - gap; i++) {
                if(arr[i] > arr[i+gap]){
                    temp = arr[i];
                    arr[i] = arr[i+gap];
                    arr[i+gap] = temp;
                }
            }
            if(gap == 1)
                break;
        }
        for (int i = 0; i < arr.length -1 ; i++) {
            if(arr[i] > arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
