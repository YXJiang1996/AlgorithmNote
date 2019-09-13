package test.envision;

import java.util.Scanner;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/12 19:32
 */
public class test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] arr=input.split(",");
        int[] numbers=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            numbers[i]=Integer.valueOf(arr[i]);
        }
        System.out.println(maxLoss(numbers));
    }
    public static int maxLoss(int[] nums){
        int temp=0;
        int maxLoss=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>temp){
                temp=nums[i];
            }else{
                maxLoss+=(temp-nums[i]);
                temp=0;
            }
        }
        return maxLoss;
    }
}
