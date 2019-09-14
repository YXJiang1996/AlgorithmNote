package dynamic.bag;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins={1,2,5};
        int amount=11;
        System.out.println(coinChange(coins,amount));
    }

    /**
     * 从1块需要几个硬币，2块需要几个硬币，自下向上创建一个数组
     * @param coins
     * @param amount
     * @return
     */
    public static int coinChange(int[] coins, int amount) {
        int[] number=new int[amount+1];
        Arrays.fill(number,amount+1);
        number[0]=0;
        for(int i=1;i<=amount;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<=i){
                    number[i]=Math.min(number[i],number[i-coins[j]]+1);
                }
            }
        }
        return number[amount]>amount?-1:number[amount];

    }
}
