package test.netease;

import java.util.*;

public class test1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]=sc.nextInt();
        }
        for (int i : input) {
            String binary=Integer.toBinaryString(i);
            StringBuilder sb=new StringBuilder(binary);
            String reverseBinary=sb.reverse().toString();
            if(binary.equals(reverseBinary)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
