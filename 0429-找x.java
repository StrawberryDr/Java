import java.util.Scanner;

public class Main {
    public static int findX(int n,int[] array,int x){
        for(int i = 0;i < n;++i){
            if(x == array[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            if(n<1 || n>200){
                continue;
            }
            int[] arr = new int[n];
            for(int i = 0;i < n;++i){
                arr[i] = sc.nextInt();
            }
            int x = sc.nextInt();
            System.out.println(findX(n,arr,x));;
        }
    }
}
