class TestDemo1{
    private float f = 1.0f;
    int m = 12;
    static int n = 1;
    public static void main (String args[]) {
        TestDemo t = new TestDemo();
        //float a = t.f;
        //int b = this.n;   static修饰，不依赖于对象
        //int c = TestDemo.m;   静态成员变量/方法才用类名属性访问
        // int d = TestDemo.f;
    }
}

public class TestDemo {
    String str=new String("hello");
    char[] ch={'a','b'};
    public static void main(String args[]){
        TestDemo ex=new TestDemo();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch);
    }
    public void change(String str,char ch[]){
        str="test ok";
        ch[0]='c';
    }
}
