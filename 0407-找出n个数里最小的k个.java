import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //3 9 6 8 -10 7 -11 19 30 12 23 5
//    public static int[] getArray(String input){
//        if(!input.isEmpty()){
//            String[] str = input.split(" ");
//            int[] temp = new int[str.length];
//            for(int i = 0;i < str.length;i++){
//                temp[i] = Integer.valueOf(str[i]);
//            }
//            return temp;
//        }
//        return null;
//    }
//
////    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
////        ArrayList<Integer> list = new ArrayList<Integer>();
////        if(input.length < k || k == 0)
////            return list;
////
////        for (int i = 0; i < k; i++)
////            list.add(input[i]);
////
////        for (int i = k; i < input.length; i++) {
////            int j = getMax(list);
////            int temp = (Integer) list.get(j);
////            if (input[i] < temp)
////                list.set(j, input[i]);
////        }
////        return list;
////    }
////    public static int getMax(ArrayList<Integer> list) {
////        int max = list.get(0);
////        int j = 0;
////        for (int i = 0; i < list.size(); i++) {
////            if (list.get(i) > max) {
////                max = list.get(i);
////                j = i;
////            }
////        }
////        return j;
////    }
//    public static void printNum(int[] array,int k){
//        Arrays.sort(array);  //按序排列
//        for(int i = 0;i < k;i++){
//            System.out.print(array[i]);
//            if(i != k-1){
//                System.out.print(" ");
//            }
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            int[] nums = new int[strs.length-1];
            for(int i=0;i<strs.length-1;i++){
                nums[i]=Integer.valueOf(strs[i]);
            }
            int k = Integer.valueOf(strs[strs.length-1]);
            Arrays.sort(nums);
            for(int i=0;i<k;i++){
                System.out.print(nums[i]);
                if(i != k-1){
                    System.out.print(" ");
                }
            }
        }
//        ArrayList<Integer> ret = GetLeastNumbers_Solution(array,4);
//        System.out.println(ret);
    }
}
