import java.util.Scanner;

public class Main {
    public static void process(int[] num,int m,String ret,int sum,int i){
        if(i == num.length){
            if(sum == m){
                System.out.println(ret.trim());
            }
            return;
        }
        process(num,m,ret+num[i]+" ",sum+num[i],i+1);
        process(num,m,ret,sum,i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String ret = "";
        int[] num = new int[n];
        int sum = 0;
        int j = 1;
        for(int i = 0;i < n;i++){
            num[i] = j++;
        }
        process(num,m,ret,sum,0);
    }
}
