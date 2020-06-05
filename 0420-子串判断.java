import java.util.Scanner;

public class Main {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] ret = new boolean[n];
        for(int i = 0;i < n;i++){
            if(s.contains(p[i])){
                ret[i] = true;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = {'a','b','c','d'};
        int num = sc.nextInt();
        String str = "abc";
    }
}
