import java.util.Scanner;

public class Main {
    public static int gradeStudent(int[] array,int grade){
        int count = 0;
        for(int i = 0;i < array.length;i++){
            if(grade == array[i]){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int N = sc.nextInt();
            if(N == 0){
                break;
            }
            int[] array = new int[N];
            for(int i = 0;i < N;i++){
                array[i] = sc.nextInt();
            }
            int grade = sc.nextInt();
            System.out.println(gradeStudent(array,grade));
        }
    }
}
