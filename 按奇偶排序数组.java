import java.util.Scanner;

public class solution {
    public static int[] sortArrayByParity(int[] A) {
        if(A.length<=1){
            return A;
        }//数组长度<=1，直接返回数组；

        int i = 0;
        int temp; //中间量
        for(int j = 0;j<A.length;j++){
            // 是偶数
            if((A[i]&1)==0){  //与：全1才1
                i++;  //if的条件语句值为0，即为偶数，继续向后判断
            }else{ //为奇数
                if((A[j]&1)==0){  //i为奇数，j为偶数：交换i和j位置的元素
                    temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                    i++;
                }
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {3,1,2,4};
        int[] ret = sortArrayByParity(A);
        for(int x : ret){
            System.out.print(x);
        }
    }
}
