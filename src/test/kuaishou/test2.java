package test.kuaishou;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/16 22:02
 */
public class test2 {
    private static List<String> result=new ArrayList<String>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        parseString(input,"");
        Collections.sort(result);
        System.out.println(result);

    }
    public static void parseString(String input,String outPut){
        if(input.length()==0){
            result.add(outPut);
            return;
        }
        char temp=input.charAt(0);
        char[] arr=intToChar(temp);
        for (char c : arr) {
            parseString(input.substring(1,input.length()),outPut+c);
        }

    }

    public static char[] intToChar(char n) {
        switch (n) {
            case '2':
                char[] arr2 = {'a', 'b', 'c'};
                return arr2;
            case '3':
                char[] arr3 = {'d', 'e', 'f'};
                return arr3;
            case '4':
                char[] arr4 = {'g', 'h', 'i'};
                return arr4;
            case '5':
                char[] arr5 = {'j', 'k', 'l'};
                return arr5;
            case '6':
                char[] arr6 = {'m', 'n', 'o'};
                return arr6;
            case '7':
                char[] arr7 = {'p', 'q', 'r', 's'};
                return arr7;
            case '8':
                char[] arr8 = {'t', 'u', 'v'};
                return arr8;
            case '9':
                char[] arr9 = {'w', 'x', 'y', 'z'};
                return arr9;
            default:
                return null;


        }
    }
}
