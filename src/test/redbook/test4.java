package test.redbook;

import java.util.*;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/14 16:04
 */
public class test4 {

    public static class Treasure {
        int x;
        int y;

        public Treasure(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Treasure> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            Treasure treasure=new Treasure(x,y);
            list.add(treasure);
        }
        Collections.sort(list, new Comparator<Treasure>() {
            @Override
            public int compare(Treasure o1, Treasure o2) {
                return o1.x-o2.x;
            }
        });
        System.out.println(longestIncreasingSubSequence(list));
    }

    public static int longestIncreasingSubSequence(List<Treasure> list){
        int n=list.size();
        int[] length=new int[n];
        for(int i=0;i<n;i++){
            length[i]=1;
            for(int j=0;j<i;j++){
                Treasure ti=list.get(i);
                Treasure tj=list.get(j);
                length[i]=ti.y>=tj.y?Math.max(length[i],length[j]+1):length[i];
            }
        }
        int result=0;
        for (int i : length) {
            result=result>i?result:i;
        }
        return result;
    }


}


