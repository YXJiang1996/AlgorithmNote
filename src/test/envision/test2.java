package test.envision;

import java.util.Scanner;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/12 19:51
 */

/**
 * 4,5
 * 1,1,1,0,0
 * 0,0,1,0,0
 * 1,1,0,0,0
 * 1,0,0,0,0
 */
public class test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] mn=input.split(",");
        int m=Integer.valueOf(mn[0]);
        int n=Integer.valueOf(mn[1]);
        int[][] board=new int[m][n];
        for(int i=0;i<m;i++){
            String temp=sc.nextLine();
            String[] arr=temp.split(",");
            for(int j=0;j<n;j++){
                board[i][j]=Integer.valueOf(arr[j]);
            }
        }
        System.out.println(maxArea(board));
    }

    public static int maxArea(int[][] board){
        int max=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==1){
                    int temp=spread(board,i,j);
                    max=max>temp?max:temp;
                }
            }
        }
        return max;
    }

    public static int spread(int[][] board,int i,int j){
        int result=1;
        board[i][j]=0;
        if(i-1>=0&&board[i-1][j]==1){result+=spread(board,i-1,j);}
        if(i+1<board.length&&board[i+1][j]==1){result+=spread(board,i+1,j);}
        if(j-1>=0&&board[i][j-1]==1){result+=spread(board,i,j-1);}
        if(j+1<board[0].length&&board[i][j+1]==1){result+=spread(board,i,j+1);}
        return result;

    }
}
