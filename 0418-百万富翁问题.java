public class Main {
    public static void main(String[] args) {
        int richMan = 10 * 30; //记录富翁的支出
        int stranger = 1; //记录陌生人的支出
        int temp = 1;
        for(int i = 1;i < 30;i++){
            temp *= 2;
            stranger += temp;
        }
        System.out.println(richMan + " " + stranger);
    }
}
