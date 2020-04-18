import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static int findKth(int[] a, int n, int K) {
        // write code here
        ArrayList<Integer> arrs = new ArrayList<>();
        for(int i = 0;i < a.length;i++){
            arrs.add(a[i]);
        }
        Stack<Integer> stack = new Stack<>();
        while (K > 0){
            int max = arrs.get(0);
            int temp = 0;  //记录最大元素的位置
            for(int i = 1;i < arrs.size();i++){
                if(arrs.get(i) > max){
                    max = arrs.get(i);
                    temp = i;
                }
            }
            arrs.remove(temp);
            stack.push(max);
            K--;
        }
        return stack.pop();
    }

//    public static int findMax(int[] arr){
//        ArrayList<Integer> arrs = new ArrayList<>();
//        int max = arrs.get(0);
//        int temp = 0;  //记录最大元素的位置
//        for(int i = 1;i < arrs.size();i++){
//            if(arr[i] > max){
//                max = arr[i];
//                temp = i;
//            }
//        }
//        arrs.remove(temp);
//        return max;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1,3,5,2,2};
        System.out.println(findKth(arr,5,3));
    }
}
