package test.netease2;

import java.util.Scanner;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/21 15:53
 */
public class test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int A=sc.nextInt();
            int B=sc.nextInt();
            int p=sc.nextInt();
            int q=sc.nextInt();
            minTimes(A,B,p,q);
        }
    }
    public static void minTimes(int A,int B,int p,int q){
        int result=0;
        while(A<B){
            if(A+2*p<B){
                p=p*q;
                result++;
            }else{
                A=A+p;
                result++;
            }
        }
        System.out.println(result);
    }
}
