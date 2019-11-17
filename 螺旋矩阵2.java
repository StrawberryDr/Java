import java.util.*;
public class Snake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[n][m];
        int max = n * m;
        int row = 0, col = 0;
        int direction = 0;
        for (int j = 1; j <= max; j++) {
            matrix[row][col] = j;
            switch (direction) {
                case 0:
                    if (col + 1 >= n || matrix[row][col + 1] > 0) {
                        direction += 1;
                        direction %= 4;
                        row += 1;
                    } else {
                        col = col + 1;
                    }
                    break;
                case 1:
                    if (row + 1 >= n || matrix[row + 1][col] > 0) {
                        direction += 1;
                        direction %= 4;
                        col -= 1;
                    } else {
                        row = row + 1;
                    }
                    break;
                case 2:
                    if (col - 1 < 0 || matrix[row][col - 1] > 0) {
                        direction += 1;
                        direction %= 4;
                        row = row - 1;
                    } else {
                        col = col - 1;
                    }
                    break;
                case 3:
                    if (row - 1 < 0 || matrix[row - 1][col] > 0) {
                        direction += 1;
                        direction %= 4;
                        col += 1;
                    } else {
                        row = row - 1;
                    }
                    break;
                default:
                    System.out.println("ERROR");
                    System.exit(0);
            }
        }
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < m; k++) {
                // 判断输出最大数的长度
                int size = ((n * m) + "").length();

                for (int i = 0; i <= (size - (matrix[j][k] + "").length() + 1); i++) {
                    System.out.print(" ");
                }
                System.out.print(matrix[j][k]);
            }
            System.out.println("");
        }
    }
}

//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int count = 0;
//        for(int i = 1;i <= n;i++){
//            if(i%a!=0 && i%b!=0 && i%c!=0){
//                count++;
//            }
//        }
//        System.out.println(count);
//    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int i = 1;
//        int count=0;
//        while (i <= n) {
//            int tmp = i;
//            while (tmp != 0){
//                if(tmp % 10 == 2){
//                    break;
//                }else {
//                    tmp = tmp /10;
//                }
//            }
//            if(tmp == 0){
//                count++;
//            }
//            i++;
//        }
//        System.out.println(count);
//    }
