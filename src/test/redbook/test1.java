package test.redbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/14 15:10
 */
public class test1 {


    private static List<Integer> list = new ArrayList();
    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
            list.add(0);
        }
        while (list.contains(0)) {
            int index = list.indexOf(0);
            tag(arr,n,index);
            count++;
        }
        System.out.println(count);
    }



    public static void tag(int[][] arr, int n,int index) {
        for (int i = 0; i < n; i++) {
            if (arr[index][i] == 1) {
                if(list.get(i)==0){
                    list.set(i,1);
                    tag(arr,n,i);

                }
            }
        }
    }


}
