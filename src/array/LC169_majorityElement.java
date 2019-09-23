package array;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/23 18:24
 */
public class LC169_majorityElement {
    public static void main(String[] args) {
        int[] arr={10,9,9,9,10};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums){
        int result=nums[0];
        int count=1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==result){
                count++;
            }else{
                count--;
                if(count<0){
                    result=nums[i];
                    count=1;
                }
            }
        }
        return result;
    }
}
