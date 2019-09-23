package test.netease2;

import java.util.Scanner;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/21 16:03
 */
public class test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            int temp=sc.nextInt();
            int[] arr=new int[temp];
            for (int j = 0; j < arr.length; j++) {
                arr[j]=sc.nextInt();
            }
            System.out.println(longestPerfectSequenceLength(arr));
        }
    }

    public static int longestPerfectSequenceLength(int[] arr){
        int n=arr.length;
        int[] sum=new int[n];
        int[] length=new int[n];
        sum[0]=arr[0];
        length[0]=1;
        for(int i=1;i<n;i++){
            int tempLen=0;
            int tempSum=Integer.MAX_VALUE;
            for(int j=0;j<i;j++){
                if(arr[i]>sum[j]){
                    tempLen=Math.max(tempLen,length[j]+1);
                    tempSum=Math.min(tempSum,sum[j]+arr[i]);
                }
            }
            length[i]=tempLen;
            sum[i]=tempSum;
        }
        int result=0;
        for (int len : length) {
            result=result>len?result:len;
        }
        return result;
    }
}

