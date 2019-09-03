package dynamic;

import java.util.Scanner;

/**
 * 一个数组中最长的单调递增子序列的长度
 * @author Jiang.YX
 */
public class LongestIncreasingSubSequence {
    public static void main(String[] args) {
        //测试数据
        int[] test={10,22,9,33,21,50,41,60,80};
        System.out.println(longestIncreasingSubSequence(test));
    }
    public static int longestIncreasingSubSequence(int[] arr){
        int n=arr.length;
        //用于存储以i位为最后一个数字的最长子序列
        int[] result=new int[n];
        result[0]=1;
        for(int i=1;i<n;i++){
            result[i]=1;
            for(int j=0;j<i;j++){
                result[i]=arr[i]>arr[j]?Math.max(result[i],result[j]+1):result[i];
            }
        }
        int longestLength=0;
        for (int i : result) {
            longestLength=longestLength>i?longestLength:i;
        }
        return longestLength;
    }
}
