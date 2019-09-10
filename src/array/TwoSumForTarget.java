package array;

import java.util.HashMap;
import java.util.Map;

/**
 * 在一个数组中找出和为目标值的两个整数
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/10 11:39
 */
public class TwoSumForTarget {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        System.out.println(twoSum(nums,target));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[0]=map.get(target-nums[i]);
                result[1]=i;
                return result;
            }else{
                map.put(nums[i],i);
            }
        }
        return result;
    }
}
