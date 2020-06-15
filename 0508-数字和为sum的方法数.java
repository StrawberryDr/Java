import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] array = new int[n+1];
        long[][] method = new long[n+1][sum+1];
        for(int i = 0;i <= n;i++){
            method[i][0] = 1;
        }
        for(int j = 1;j <= sum;j++){
            method[0][j] = 0;
        }
        for(int i = 0;i <= n;i++){
            array[i] = sc.nextInt();
            for(int j = 0;j <= sum;j++){
                if(j >= array[i]){
                    method[i][j] = method[i-1][j] + method[i-1][j-array[i]];
                }else {
                    method[i][j] = method[i-1][j];
                }
            }
        }
        System.out.println(method[n][sum]);
    }
}
