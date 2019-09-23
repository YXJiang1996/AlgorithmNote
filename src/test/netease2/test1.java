package test.netease2;

import java.util.Scanner;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/21 15:49
 */
public class test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            int temp=sc.nextInt();
            findMin(temp);
        }
    }
    public static void findMin(int x){
        StringBuilder sb=new StringBuilder();
        while(x>=10){
            sb.append(9);
            x-=9;
        }
        sb.append(x);
        sb.reverse();
        System.out.println(sb.toString());
    }
}
