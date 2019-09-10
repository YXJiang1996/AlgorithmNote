package test.bytedance;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/8 18:59
 */
public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        String useLess = sc.nextLine();
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        for (int i = 0; i < p; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            System.out.println(func(arr,start,end));
        }
    }

    private static String[] del(String[] arr, int ss) {
        String[] tmp = new String[arr.length - 1];
        for (int i = 0; i < ss; i++) {
            tmp[i] = arr[i];
        }
        for (int i = ss; i + 1 < arr.length; i++) {
            tmp[ss] = arr[ss + 1];
        }
        return tmp;
    }

    private static int play(String[] arr) {
        int border = arr.length;
        int score = 0;
        int i = 0;
        int direction = 1;
        while (i < border && i >= 0) {
            if (arr[i].equals("<")) {
                direction = -1;
                if (arr[i + direction].equals("<") || arr[i + direction].equals(">")) {
                    del(arr, i);
                    border -= 1;
                    i += direction;
                }
            } else if (arr[i].equals(">")) {
                direction = 1;
                if (arr[i + direction].equals("<") || arr[i + direction].equals(">")) {
                    del(arr, i);
                    border -= 1;
                    i = i;
                }
            } else {
                int temp=Integer.valueOf(arr[i]);
                score += temp;
                arr[i] =String.valueOf(temp-1);
                if (Integer.valueOf(arr[i]) < 0) {
                    del(arr, i);
                    border -= 1;
                }
            }
            i += direction;
        }
        return score;
    }

    private static int func(String[] arr, int start, int end) {
        int score = 0;
        if (start == end) {
            if (arr[start - 1].equals("<") || arr[start - 1].equals(">")) {
                return 0;
            } else {
                return Integer.valueOf(arr[start - 1]);
            }
        } else {
            String[] playarr =Arrays.copyOfRange(arr,start-1,end);
            return play(playarr);
        }
    }
}
