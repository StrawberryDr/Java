public class Main {
    public static int countWays(int n) {
        if(n < 3){
            return n;
        }
        if(n == 3){
            return 4;
        }
        int ret = 0;
        int[] array = {1,2,4};
        for(int i = 4;i <= n;i++){
            ret = ((array[0]+array[1])%1000000007+array[2])%1000000007;
            array[0] = array[1];
            array[1] = array[2];
            array[2] = ret;
        }
        return ret;
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(countWays(n));
//    }
}
