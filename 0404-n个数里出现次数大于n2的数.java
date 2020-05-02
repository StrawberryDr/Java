import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void countSum(int[] array){
        for(int i = 0;i < array.length;i++){
            int count = 0;
            for(int j = 0;j < array.length;j++){
                if(array[i] == array[j]){
                    count++;
                }
            }
            if(count >= array.length/2){
                System.out.println(array[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            String[] string = str.split(" ");
            int[] arr = new int[string.length];
            for(int i = 0;i < arr.length;i++){
                arr[i] = Integer.valueOf(string[i]);
            }
            countSum(arr);
        }
    }
}
