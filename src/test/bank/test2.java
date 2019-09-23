package test.bank;

import java.util.Scanner;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/15 21:12
 */
public class test2 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);

//        int n=Integer.valueOf(sc.nextLine());
//        int[][] input=new int[n][n];
//        int[] weight=new int[n+1];
//        int[] parentNode=new int[n+1];
//        parentNode[1]=-1;
//        while(sc.hasNextLine()){
//            String str=sc.nextLine();
//            String[] temp=str.split(" ");
//            int u=Integer.valueOf(temp[0]);
//            int v=Integer.valueOf(temp[1]);
//            int c=Integer.valueOf(temp[2]);
//            weight[v]=weight[u]+c;
//            parentNode[v]=u;
//        }
        int n=5;
        int[] weight={0,0,-3,2,3,-6};
        int[] parentNode={0,-1,1,1,2,2};
        int[] newWeight=new int[n+1];
        for(int i=n;n>=1;n--){
            int temp=weight[i]-weight[parentNode[i]];
            if(temp>newWeight[i]){
                newWeight[i]=temp;
            }
        }
        for(int i=1;i<=n;i++){
            if(i==n){
                System.out.println(newWeight[i]);
            }else{
                System.out.println(newWeight[i]+" ");
            }
        }


    }
}
