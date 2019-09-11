package test.xiaomi;
import java.util.Arrays;
import java.util.Scanner;

public class test3 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int solution(int[] arr) {
        int n = arr.length;
        int[] sortArr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            sortArr[i] = arr[i];
        }
        Arrays.sort(sortArr);
        int count = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == sortArr[j]) {
                ++count;
                ++j;
            }
        }
        return n - count;
    }

    /******************************结束写代码******************************/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _arr_size = 0;
        _arr_size = Integer.parseInt(in.nextLine().trim());
        int[] _arr = new int[_arr_size];
        int _arr_item;
        for (int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
            _arr_item = Integer.parseInt(in.nextLine().trim());
            _arr[_arr_i] = _arr_item;
        }

        res = solution(_arr);
        System.out.println(String.valueOf(res));

    }
}
