//package test1.bytedance;
//
//import java.util.Scanner;
//
///**
// * @author Jiang.YX
// * @version 1.0
// * @date 2019/9/8 18:59
// */
////4
////6 5 3 4
////5可以被3,4看到
//
//public class test1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] height=new int[n];
//        for(int i=0;i<n;i++){
//            height[n]=sc.nextInt();
//        }
//        int[] result=new int[n];
//        for(int i=0;i<n;i++){
//            int max=0;
//            for(int j=i+1;j<n;j++){
//                if(height[j]>max){
//                    max=height[j];
//                    if(height[j]<=height[i]){
//                        result[i]=result[i]+1;
//                    }
//                }else{
//                    break;
//                }
//
//            }
//        }
//        int resultIndex=0;
//        int resultNum=result[0];
//        for (int i : result) {
//            if(result[i]>resultNum){
//                resultNum=result;
//            }
//        }
//
//    }
//}
