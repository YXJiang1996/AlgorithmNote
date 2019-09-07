package test.ctrip;

import java.util.*;

public class test3 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int schedule(int m,int[] array) {
//3 5
//1 5 3 4 2
        if(array.length==m){
            int temp=0;
            for(int i=0;i<m;i++){
                temp=Math.max(temp,array[i]);
            }
            return temp;
        }
        if(m==1){
            int temp=0;
            for (int i : array) {
                temp+=i;
            }
            return temp;
        }
        int result=Integer.MAX_VALUE;
        int n=array.length;
        for(int i=0;i<=n-m;i++){
            int temp=0;
            for(int j=0;j<=i;j++){
                temp+=array[j];
            }
            temp=Math.max(temp,schedule(m-1,Arrays.copyOfRange(array,i+1,array.length)));
            result=Math.min(temp,result);
        }
        return result;

    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int size  = in.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        int res = schedule(m,array);
        System.out.println(String.valueOf(res));
    }
}

