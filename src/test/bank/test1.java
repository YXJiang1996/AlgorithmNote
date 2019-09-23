package test.bank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/15 21:11
 */
public class test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        char[] arr=input.toCharArray();
        int[] index=new int[input.length()];
        Arrays.fill(index,1);
        for(int i=0;i<input.length();i++){
            int temp=finalIndex(i,arr,0);
            index[i]=index[i]-1;
            index[temp]=index[temp]+1;
        }
        for (int i = 0; i < index.length; i++) {
            if(i==index.length){
                System.out.print(index[i]);
            }else{
                System.out.print(index[i]+" ");
            }
        }

    }
    public static int finalIndex(int i,char[] arr,int time){
        if(arr[i]=='R'){
            if(arr[i+1]=='L'){
                return i+time;
            }else{
                return finalIndex(i+1,arr,(time+1)%2);
            }
        }else{
            if(arr[i-1]=='R'){
                return i-time;
            }else{
                return finalIndex(i-1,arr,(time+1)%2);
            }
        }
    }
}
