package string;

import java.util.HashMap;
import java.util.Map;

/**
 * 无重复字符的最长子串
 * 两个指针，一遍遍历，每次发现有重复的字符之后后面的指针就移动
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/10 15:31
 */
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abba"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int ans=0;
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0,j=0;j<n;j++){
            if(map.containsKey(s.charAt(j))){
                i=Math.max(i,map.get(s.charAt(j))+1);
                map.put(s.charAt(j),j);
            }else{
                map.put(s.charAt(j),j);
            }
            ans=Math.max(ans,j-i+1);
        }
        return ans;
    }
}
