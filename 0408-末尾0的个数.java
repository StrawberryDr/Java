import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if(n >= 1 && n <= 1000){
            while (n > 0){
                count += n/5;
                n = n/5;
            }
        }
        System.out.println(count);
    }
}
