package test.tencent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/20 20:23
 */
public class test4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int time=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        int num=0;
        int index=0;
        while(time>0){
            if(arr[index]-num>0){
                System.out.println(arr[index]-num);
                time--;
                num=arr[index];
            }else{
                index++;
            }
        }
        while(time>0){
            System.out.println(0);
            time--;
        }
    }
}
