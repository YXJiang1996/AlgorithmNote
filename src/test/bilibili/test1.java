package test.bilibili;

import java.util.Scanner;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/10 16:50
 */
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        System.out.println(minDistance(word1, word2));

    }

    public static int minDistance(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        if (l1 * l2 == 0) {
            return l1 + l2;
        }
        int[][] dp = new int[l1 + 1][l2 + 1];
        for(int i=0;i<l1+1;i++){
            dp[i][0]=i;
        }
        for(int j=0;j<l2+1;j++){
            dp[0][j]=j;
        }
        for(int i=1;i<l1+1;i++){
            for(int j=1;j<l2+1;j++){
                int left=dp[i-1][j]+1;
                int down=dp[i][j-1]+1;
                int left_down=dp[i-1][j-1];
                if(word1.charAt(i-1)!=word2.charAt(j-1)){
                    left_down+=1;
                }
                dp[i][j]=Math.min(left,Math.min(down,left_down));
            }
        }
        return dp[l1][l2];
    }
}
