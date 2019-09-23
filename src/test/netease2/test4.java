package test.netease2;

import java.util.Scanner;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/21 16:24
 */
public class test4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(getSum(arr));
    }
    public static int getSum(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    sum+=(j-i);
                }
            }
        }
        return sum;
    }
}
