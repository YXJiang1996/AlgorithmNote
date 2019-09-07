package test.ctrip;

import java.util.*;

public class test2 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static String resolve(String expr) {
        //((ur)oi)
        //iour
        char[] arr=expr.toCharArray();
        Stack<Character> stack=new Stack<>();
        List<Character> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=')'){
                stack.push(arr[i]);
            }else{
                char temp=stack.pop();
                while(temp!='('){
                    list.add(temp);
                    if(stack.isEmpty()){
                        return "";
                    }else {
                        temp=stack.pop();
                    }
                }
                for (Character character : list) {
                    stack.push(character);
                }
                list.clear();
            }
        }
        Stack<Character> resultStack=new Stack<>();
        while(!stack.isEmpty()){
            resultStack.push(stack.pop());
        }
        StringBuilder sb=new StringBuilder();
        while(!resultStack.isEmpty()){
            char temp=resultStack.pop();
            if(temp!='('&&temp!=')'){
                sb.append(temp);
            }else{
                return "";
            }
        }
        return sb.toString();

    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
        String res;

//        String _expr;
//        try {
//            _expr = in.nextLine();
//        } catch (Exception e) {
//            _expr = null;
//        }
        String _expr="((ur)oi)";
        res = resolve(_expr);
        System.out.println(res);
    }
}

