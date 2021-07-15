package array;

/**
 * description: SparseArray <br>
 * date: 2021/7/13 0:16 <br>
 * author: lgc <br>
 * version: 1.0 <br>
 */
public class SparseArray {
    public static void main(String[] args) {
        int[][] originalArr = new int[11][11];
        originalArr[1][2] = 1;
        originalArr[2][4] = 2;
        int count = 0;
        for (int i = 0; i < originalArr.length; i++) {
            for (int j = 0; j < originalArr[i].length; j++) {
                if (originalArr[i][j] != 0) {
                    count++;
                    System.out.println(originalArr[i][j]);
                }
            }
        }
        int[][] sparseArr = new int[count + 1][3];
        sparseArr[0][0] = originalArr.length;
        sparseArr[0][1] = originalArr[0].length;
        sparseArr[0][2] = count;
        int point = 1;
        for (int i = 0; i < originalArr.length; i++) {
            for (int j = 0; j < originalArr[i].length; j++) {
                if (originalArr[i][j] != 0) {
                    sparseArr[point][0] = i;
                    sparseArr[point][1] = j;
                    sparseArr[point][2] = originalArr[i][j];
                    point++;
                }
            }
        }

        for (int i = 0; i < sparseArr.length; i++) {
            for (int j = 0; j < sparseArr[i].length; j++) {
                    System.out.println(sparseArr[i][j]);
                }
            }
        }

}
