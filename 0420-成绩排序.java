import java.util.Scanner;

public class Main {
    private static String[] name;
    private static int[] grade;

    public static boolean compare(int i,int j,int flag){
        return flag == 0 ? grade[i]>grade[j] : grade[i]<grade[j];
    }
    public static void sort(int flag,int n){
        for(int i = 1;i < n;i++){
            for(int j = i;j > 0 && compare(j,j-1,flag);j--){
                getOrder(j,j-1);
            }
        }
    }
    public static void getOrder(int i,int j){
        String tempName = name[j];
        int tempGrade = grade[j];
        name[j] = name[i];
        grade[j] = grade[i];
        name[i] = tempName;
        grade[i] = tempGrade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int flag = sc.nextInt();
            //初始化name[]和grade[]
            name = new String[n];
            grade = new int[n];
            for(int i = 0;i < n;i++){
                name[i] = sc.next();
                grade[i] = sc.nextInt();
            }
            sort(flag,n);
            for(int i = 0;i < n;i++){
                System.out.println(name[i] + " " + grade[i]);
            }
        }
    }
}
