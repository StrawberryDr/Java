import javax.swing.plaf.metal.MetalTabbedPaneUI;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Solution {
    public static int[] sortedSquares(int[] A) {
        int[] ret = new int[A.length];
        for(int i = 0;i < A.length;i++){
            ret[i] = A[i]*A[i];
        }
        //bubbleSort(ret);
        Arrays.sort(ret);  //sort()方法用于给数组排序
        return ret;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {-4,-1,0,3,10};
        int[] ret = sortedSquares(arr);
        for (int x : ret) {
            System.out.print(x);
        }
    }
}
