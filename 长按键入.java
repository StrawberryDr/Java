import java.util.Scanner;

public class Solution {
    public static boolean isLongPressedName(String name, String typed) {
        if(name.length() > typed.length()){
            return false;
        }
        char[] names = name.toCharArray();
        char[] type = typed.toCharArray();
        int i = 0,j = 0;
        while (i < names.length && j < type.length) {
            if (names[i] == type[j]) {
                i++;
            }
            j++;
        }
        if(i == names.length){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String typed = scanner.nextLine();
        boolean ret = isLongPressedName(name,typed);
        System.out.println(ret);
    }
}
