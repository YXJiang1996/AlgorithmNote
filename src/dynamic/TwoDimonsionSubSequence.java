package dynamic;

import java.util.*;

/**
 * 二维的最大单调递增子序列的问题
 * @author Jiang.YX
 */
public class TwoDimonsionSubSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Case> caseList=new ArrayList<>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            Case temp=new Case(x,y);
            caseList.add(temp);
        }
        Collections.sort(caseList, new Comparator<Case>() {
            @Override
            public int compare(Case o1, Case o2) {
                return o1.x-o2.x;
            }
        });
        int index=longestIncreasingSubSequence(caseList);
        int[] indexes=new int[n];
        indexes[index]=1;
        int currentY=caseList.get(index).getY();
        for(int i=index-1;i>=0;i--){
            if(caseList.get(i).getY()<currentY){
                currentY=caseList.get(i).getY();
                indexes[i]=1;
            }
        }
        for(int i=0;i<n;i++){
            if(indexes[i]==1){
                System.out.println(caseList.get(i).toString());
            }
        }

    }

    public static int longestIncreasingSubSequence(List<Case> list){
        int n=list.size();
        //用于存储以i位为最后一个数字的最长子序列
        int[] result=new int[n];
        result[0]=1;
        for(int i=1;i<n;i++){
            result[i]=1;
            for(int j=0;j<i;j++){
                result[i]=list.get(i).getY()>list.get(j).getY()?Math.max(result[i],result[j]+1):result[i];
            }
        }
        int index=0;
        int longestLength=0;
        for (int i = 0; i < result.length; i++) {
            index=longestLength>result[i]?index:i;
        }
        return index;
    }

    public static class Case{
        private int x;
        private int y;
        public Case(int x,int y){
            this.x=x;
            this.y=y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public String toString() {
            return x+" "+y;
        }
    }
}
