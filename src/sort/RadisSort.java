package sort;

import java.util.Arrays;

/**
 * @description:
 * @author: lugc
 * @time: 2021/9/22 20:27
 */
public class RadisSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 23, 6, 9, 287, 56, 1, 789, 34, 65, 653 };
        System.out.println(Arrays.toString(arr));
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void radixSort(int[] arr) {

        // 存数组中最大的数字,为了知道循环几次
        int max = Integer.MIN_VALUE;// (整数中的最小数)
        // 遍历数组，找出最大值
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        // 计算最大数是几位数,,此方法计较绝妙
        int maxLength = (max + "").length();
        // 用于临时存储数据的数组
        int[][] temp = new int[10][arr.length];
        // 用于存储桶内的元素位置
        int[] counts = new int[arr.length];

        // 第一轮个位数较易得到余数，第二轮就得先除以十再去取余，之后百位除以一百
        // 可以看出，还有一个变量随循环次数变化，为了取余

        // 循环的次数
        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
            // 每一轮取余
            for (int j = 0; j < arr.length; j++) {
                // 计算余数
                int ys = (arr[j] / n) % 10;
                // 把便利店数据放在指定数组中，有两个信息，放在第几个桶+数据应该放在第几位
                temp[ys][counts[ys]] = arr[j];
                // 记录数量
                counts[ys]++;
            }

            // 记录取的数字应该放到位置
            int index = 0;
            // 每一轮循环之后把数字取出来
            for (int k = 0; k < counts.length; k++) {
                // 记录数量的数组中当前余数记录不为零
                if (counts[k] != 0) {
                    for (int l = 0; l < counts[k]; l++) {
                        // 取出元素
                        arr[index] = temp[k][l];
                        index++;
                    }
                    // 取出后把数量置为零
                    counts[k] = 0;
                }
            }

        }
    }
}