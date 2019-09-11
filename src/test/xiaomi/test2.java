package test.xiaomi;

import java.util.Scanner;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/11 18:53
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class test2 {


//4
//        4
//        2
//        7
//        6
    static int solution(int[] arr) {
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            map.put(arr[i],i);
        }
        Collections.sort(list);
        int count1=0;
        for (int i = 0; i < list.size(); i++) {
            int temp=map.get(list.get(i));
            count1+=Math.abs(temp-i);
        }
        Collections.sort(list,Collections.reverseOrder());
        int count2=0;
        for (int i = 0; i < list.size(); i++) {
            int temp=map.get(list.get(i));
            count2+=Math.abs(temp-i);
        }
        int result=count1>count2?count2/2:count1/2;
        return result;
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _arr_size = 0;
        _arr_size = Integer.parseInt(in.nextLine().trim());
        int[] _arr = new int[_arr_size];
        int _arr_item;
        for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
            _arr_item = Integer.parseInt(in.nextLine().trim());
            _arr[_arr_i] = _arr_item;
        }

        res = solution(_arr);
        System.out.println(String.valueOf(res));

    }
}
