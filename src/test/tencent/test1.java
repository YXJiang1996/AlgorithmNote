package test.tencent;

import java.util.Scanner;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/20 20:03
 */
public class test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            int length=Integer.parseInt(sc.nextLine());
            if(length<11){
                System.out.println("NO");
                continue;
            }
            String str=sc.nextLine();
            int firstEight=str.indexOf('8');
            if(firstEight!=-1&&length-firstEight>=11){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
}
