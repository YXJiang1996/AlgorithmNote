package test.tencent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/20 20:20
 */
public class test2 {
    //    3
////            1 8
////            2 5
////            1 2
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> staff=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int count=sc.nextInt();
            int lazy=sc.nextInt();
            for (int j = 0; j < count; j++) {
                staff.add(lazy);
            }
        }
        Collections.sort(staff);
        int result=0;
        for(int i=0;i<staff.size()/2;i++){
            int temp=staff.get(i)+staff.get(staff.size()-i-1);
            result=result>temp?result:temp;
        }
        System.out.println(result);
    }
}
