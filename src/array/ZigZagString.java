package array;

import java.util.Arrays;

/**
 * Z自行变换字符串
 * 例如LEETCODEISHIRING
 * 转化为
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * 再横向输出LCIRETOESIIGEDHN
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/10 15:47
 */
public class ZigZagString {
    public static void main(String[] args) {
        String s="A";
        int numRows=1;
        System.out.println(convert(s,numRows));
    }
    public static String convert(String s, int numRows) {
        if(numRows==1){return s;}
        int cycle=numRows+numRows-2;
        String[] arr=new String[numRows];
        Arrays.fill(arr,"");
        for(int i=0;i<s.length();i++){
            int temp=i%cycle;
            if(temp<numRows){
                arr[temp]+=s.charAt(i);
            }else{
                arr[numRows*2-temp-2]+=s.charAt(i);
            }
        }
        StringBuilder result=new StringBuilder();
        for (String str : arr) {
            result.append(str);
        }
        return result.toString();
    }
}
