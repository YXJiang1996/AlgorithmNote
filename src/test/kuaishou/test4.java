package test.kuaishou;

import java.util.Scanner;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/16 21:56
 */
public class test4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println(longestArithSeqLength(arr));
    }
    public static int longestArithSeqLength(int[] arr){
        int[][] n=new int[arr.length][20001];
        int ans=Integer.MIN_VALUE;
        int d;
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<i;j++){
                d=arr[i]-arr[j]+10000;
                if(n[j][d]==0){
                    n[i][d]=2;
                }else{
                    n[i][d]=n[j][d]+1;
                }
                ans=Math.max(n[i][d],ans);
            }
        }
        return ans;
    }
}
