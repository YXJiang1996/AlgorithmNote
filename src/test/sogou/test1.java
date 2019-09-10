package test.sogou;

import java.util.*;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/8 17:25
 */
public class test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=Integer.valueOf(sc.nextLine());
        Map<String,Integer> map=new HashMap<>();
        List<String> list=new ArrayList<>();
        while(sc.hasNextLine()){
            String temp=sc.nextLine();
            String[] arr=temp.split(" ");
            if(map.containsKey(arr[0])){
                list.remove(arr[0]);
                list.add(arr[0]);
                int oldValue=map.get(arr[0]);
                int newValue=Integer.valueOf(arr[1]);
                if(oldValue<newValue){
                    map.put(arr[0],newValue);
                }
            }else{
                if(map.size()<size){
                    map.put(arr[0],Integer.valueOf(arr[1]));
                    list.add(arr[0]);
                }else{
                    String key=list.get(0);
                    list.remove(0);
                    System.out.println(key+" "+map.get(key));
                    map.remove(key);
                    map.put(arr[0],Integer.valueOf(arr[1]));
                }
            }

        }
    }
}
