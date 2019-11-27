public class TestDemo {
    public static void main(String[] args) {
        String str = "123456";
        System.out.println(isNumber(str)?"字符串由数字组成":"字符串中有非数字成员");
    }
    public static boolean isNumber(String str){
        char[] arr = str.toCharArray();
        for(int i = 0;i < arr.length;i++){
            if(arr[i] < '0' || arr[i] > '9'){
                return false;
            }
        }
        return true;
    }
}
