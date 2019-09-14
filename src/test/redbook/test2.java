package test.redbook;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/14 15:29
 */
public class test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        // a<<b((c)<) 括号表示注释，<表示退格，括号不受退格影响
        System.out.println(parseNote(input));
    }

    public static String parseNote(String str){
        char[] arr=str.toCharArray();
        Stack<Character> stack=new Stack<>();
        for (char ch : arr) {
            if(ch=='<'){
                if(!stack.isEmpty()&&stack.peek()!='('){
                    stack.pop();
                }
            }else if(ch==')'){
                while(!stack.isEmpty()){
                    if(stack.peek()=='('){
                        stack.pop();
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }else{
                stack.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
