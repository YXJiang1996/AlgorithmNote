package test.bilibili;

import java.util.Scanner;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/10 16:50
 */
public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));
    }

    public static int count(int n) {
        while ((n & 1) == 0) {
            n >>= 1;
        }
        int ans = 1;
        int d = 3;
        while (d * d <= n) {
            int e = 0;
            while (n % d == 0) {
                n /= d;
                e++;
            }
            ans *= e + 1;
            d += 2;
        }
        if (n > 1) {
            ans <<= 1;
        }
        return ans;
    }
}
