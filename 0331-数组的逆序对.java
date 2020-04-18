import java.util.*;

public class Main {
    public static int count(int[] arr,int n){
        int count = 0;
        for(int i = 0;i < n;i++){
            for(int j = i+1;j < n;j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(count(arr,n));
    }
}
