import java.lang.reflect.Field;

public class TestDemo {
    public static void main(String[] args){

    }

    public static void main3(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str = "Hello";
    // 获取 String 类中的 value 字段. 这个 value 和 String 源码中的 value 是匹配的.
        Field valueField = String.class.getDeclaredField("value");
    // 将这个字段的访问属性设为 true
        valueField.setAccessible(true);
    // 把 str 中的 value 属性获取到.
        char[] value = (char[]) valueField.get(str);
    // 修改 value 的值
        value[0] = 'h';
        System.out.println(str);
    }

    public static void main2(String[] args){
        String str = "abcde";  //直接赋值
        String str2 = new String("abcde");
        char[] array = {'a','b','c','d','e'};
        String str3 = new String(array);
        String str4 = "ab"+"cde";  //编译期已经确定是"abcde"
        String str5 = "ab"+ new String("cde");

        System.out.println(str == str2);  //false
        System.out.println(str == str3);  //false
        System.out.println(str == str4);  //true
        System.out.println(str == str5);  //false
        System.out.println(str2 == str3);  //false
    }

    public static void main1(String[] args){
        String str1 = "abcde";  //直接赋值
        System.out.println(str1);

        String str2 = new String("abcde");
        System.out.println(str2);

        char[] array = {'a','b','c','d','e'};
        String str3 = new String(array);
        System.out.println(str3);

        System.out.println(str1 == str2);  //false
        System.out.println(str1 == str3);  //false
    }
}
