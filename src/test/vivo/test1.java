package test.vivo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/11 16:08
 */
public class test1 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        int output = solution(inputStr);
        System.out.println(output);
    }

    private static int solution(String str) {
        //(()(()((()(0)))))
        //5
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                stack.push('(');
            }else if(str.charAt(i)==')'){
                stack.pop();
            }else if(str.charAt(i)=='0'){
                break;
            }
        }
        return stack.size();


    }
}
