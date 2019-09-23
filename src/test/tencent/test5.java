package test.tencent;

import java.util.Scanner;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/20 21:05
 */
public class test5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp1=sc.nextInt();
        for(int i=1;i<n;i++){
            int temp=sc.nextInt();
            temp1=temp1^temp;
        }
        int temp2=sc.nextInt();
        for(int i=1;i<n;i++){
            int temp=sc.nextInt();
            temp2=temp2^temp;
        }
        System.out.println(temp2+temp1);
    }
}
