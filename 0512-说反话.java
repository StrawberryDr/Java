import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String start = "";
        start = sc.nextLine();
        String[] array;
        array = start.split(" ");
        for(int i = array.length;i > 0;i--){
            System.out.print(array[i-1]);
            if(i-1 != 0){
                System.out.print(" ");
            }
        }
    }
}
