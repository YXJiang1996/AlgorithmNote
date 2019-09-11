package test.xiaomi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/11 18:53
 */
public class test1 {

    /**
     * 4
     * 0 0 2 4
     * 0 2 2 2
     * 0 4 2 2
     * 8 8 2 2
     *
     * 2 4 0 0
     * 4 2 0 0
     * 4 4 0 0
     * 16 4 0 0
     * @param input
     * @return
     */

    static void solution(String[] input) {
        for (String s : input) {
            String[] arr=s.split(" ");
            List<Integer> list=new ArrayList<>();
            int last=0;
            for(int i=0;i<arr.length;i++){
                int temp=Integer.valueOf(arr[i]);
                if(temp!=0){
                    if(last==0){
                        last=temp;
                    }else{
                        if(last==temp){
                            list.add(last+temp);
                            last=0;
                        }else{
                            list.add(last);
                            last=temp;
                        }
                    }
                }
            }
            if(last!=0){
                list.add(last);
            }
            int count=arr.length;
            while(list.size()<arr.length){
                list.add(0);
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<list.size();i++){
                sb.append(list.get(i));
                count--;
                if(count!=0){
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
        }

    }




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String res;

        int _input_size = 0;
        _input_size = Integer.parseInt(in.nextLine().trim());
        String[] _input = new String[_input_size];
        String _input_item;
        for (int _input_i = 0; _input_i < _input_size; _input_i++) {
            try {
                _input_item = in.nextLine();
            } catch (Exception e) {
                _input_item = null;
            }
            _input[_input_i] = _input_item;
        }

        solution(_input);
    }
}

