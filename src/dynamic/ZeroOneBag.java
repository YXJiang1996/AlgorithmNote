package dynamic;

import java.util.*;

/**
 * 0-1背包问题
 * @author Jiang.YX
 */
public class ZeroOneBag {
    public static void main(String[] args) {
        //测试用例
        int num=5;
        int capacity=10;
        int[] weight={0,2,2,6,9,4};
        int[] value={0,6,3,25,33,6};
        int[][] maxValues=maxValue(value,weight,num,capacity);
        int result=0;
        for(int i=0;i<=num;i++){
            result=result>maxValues[i][capacity]?result:maxValues[i][capacity];
        }
        System.out.println(result);
        System.out.println("物品序列为：");
        List<Integer> list=new ArrayList<>();
        for(int i=num;i>0;i--){
            if(maxValues[i][capacity]>maxValues[i-1][capacity]){
                list.add(i);
                capacity-=weight[i];
            }
        }
        Collections.reverse(list);
        System.out.println(list);
    }

    public static int[][] maxValue(int[] value,int[] weight,int num,int capacity){
        int[][] maxValues=new int[num+1][capacity+1];
        for(int i=1;i<=num;i++){
            for(int j=1;j<=capacity;j++){
                if(weight[i]>j){
                    maxValues[i][j]=maxValues[i-1][j];
                }else{
                    maxValues[i][j]=Math.max(maxValues[i-1][j],value[i]+maxValues[i-1][j-weight[i]]);
                }
            }
        }
        return maxValues;
    }
}
