package test.redbook;

import java.util.Scanner;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/14 15:48
 */
public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        if (n == 1) {
            System.out.println(arr[0] + " " + 1);
        } else {
            int index = arr[0] > arr[1] ? 0 : 1;
            int[] maxArr = new int[n];
            int[] maxCount = new int[n];
            maxArr[0] = arr[0];
            maxArr[1] = Math.max(arr[0], arr[1]);
            maxCount[0] = 1;
            maxCount[1] = 1;
            for (int i = 2; i < n; i++) {
                if (arr[i] + maxArr[i - 2] > maxArr[i - 1]) {
                    maxArr[i] = arr[i] + maxArr[i - 2];
                    maxCount[i] = maxCount[i - 2] + 1;
                    index = i;
                } else {
                    maxArr[i] = maxArr[i - 1];
                    maxCount[i] = maxCount[i - 1];
                    index = i - 1;
                }
            }
            System.out.println(maxArr[index] + " " + maxCount[index]);
        }
    }
}
