package test.kuaishou;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/16 21:29
 */
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(isIPv4(str)){
            System.out.println("IPv4");
        }else if(isIPv6(str)){
            System.out.println("IPv6");
        }else{
            System.out.println("Neither");
        }
    }

    public static boolean isIPv4(String str) {
        if (!Pattern.matches("[0-9]+[.][0-9]+[.][0-9]+", str)) {
            return false;
        } else {
            String[] arrays = str.split("\\.");
            if (Integer.parseInt(arrays[0]) < 256 && arrays[0].length() <= 3
                    && Integer.parseInt(arrays[1]) < 256 && arrays[1].length() <= 3
                    && Integer.parseInt(arrays[2]) < 256 && arrays[2].length() <= 3
                    && Integer.parseInt(arrays[3]) < 256 && arrays[3].length() <= 3) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean isIPv6(String str){
        return isIPv6Std(str)||isIPv6Compress(str);
    }
    public static boolean isIPv6Std(String str){
        if(!Pattern.matches("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$",str)){
            return false;
        }
        return true;
    }

    public static boolean isIPv6Compress(String str){
        if(!Pattern.matches("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?::[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$",str)){
            return false;
        }
        return true;
    }
}
