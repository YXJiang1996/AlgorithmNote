package test.tencent;

import java.util.Scanner;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/20 21:16
 */
public class test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            int[] arr=new int[temp];
            for(int j=0;j<temp;j++){
                arr[i]=sc.nextInt();
            }
        }
    }
}
