package test.kuaishou;

import java.util.Scanner;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/16 21:49
 */
public class test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(getMaxDiff(arr));
    }
    public static int getMaxDiff(int[] array){
        int sum=getSum(array);
        int length=array.length;
        int[][] f=new int[length+1][sum/2+1];
        for(int i=0;i<length;i++){
            for(int j=1;j<=sum/2;j++){
                f[i+1][j]=f[i][j];
                if(array[i]<j&&f[i][j-array[i]]+array[i]>f[i][j]){
                    f[i+1][j]=f[i][j-array[i]]+array[i];
                }
            }
        }
        return sum-2*f[length][sum/2];
    }

    public static int getSum(int[] array){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return sum;
    }
}
