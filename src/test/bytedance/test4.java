package test.bytedance;

import java.util.*;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/8 18:59
 */
public class test4 {
    private static List<String> result = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] arr=new int[input.length()];
        for(int i=0;i<input.length();i++){
            arr[i]=Integer.valueOf(input.charAt(i)+"");
        }
        numDecoding("",arr);
        Collections.sort(result);
        for (String s : result) {
            System.out.println(s);
        }

    }

    public static void numDecoding(String str, int[] arr) {
        if(arr.length==0){
            if(!result.contains(str))
            {result.add(str);}
        }else if(arr.length==1){
            char temp=intToChar(arr[0]);
            if(!result.contains(str+temp)){
            result.add(str+temp);}
        }else{
            if(arr[1]==0){
                char temp=intToChar(arr[0]*10+arr[1]);
                numDecoding(str+temp,Arrays.copyOfRange(arr,2,arr.length));
            }else{
                int temp=arr[0]*10+arr[1];
                if(temp>0&&temp<=26){
                    char ch1=intToChar(temp);
                    numDecoding(str+ch1,Arrays.copyOfRange(arr,2,arr.length));
                }
                char ch2=intToChar(arr[0]);
                numDecoding(str+ch2,Arrays.copyOfRange(arr,1,arr.length));
            }
        }
    }

    public static char intToChar(int i) {
        switch (i) {
            case 1:
                return 'A';
            case 2:
                return 'B';
            case 3:
                return 'C';
            case 4:
                return 'D';
            case 5:
                return 'E';
            case 6:
                return 'F';
            case 7:
                return 'G';
            case 8:
                return 'H';
            case 9:
                return 'I';
            case 10:
                return 'J';
            case 11:
                return 'K';
            case 12:
                return 'L';
            case 13:
                return 'M';
            case 14:
                return 'N';
            case 15:
                return 'O';
            case 16:
                return 'P';
            case 17:
                return 'Q';
            case 18:
                return 'R';
            case 19:
                return 'S';
            case 20:
                return 'T';
            case 21:
                return 'U';
            case 22:
                return 'V';
            case 23:
                return 'W';
            case 24:
                return 'X';
            case 25:
                return 'Y';
            case 26:
                return 'Z';
            default:
                return '#';
        }
    }
}
