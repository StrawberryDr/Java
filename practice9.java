class Demo{
    //int num = 10;// 可以访问
//私有的成员变量
    private int num = 10; //不能访问

    public void show(){
        System.out.println(num);
    }//通过公共方法间接调用成员变量

    //私有的成员方法
    private void method(){
    }//外界不能直接访问

    public void func(){
        method(); //通过公共方法间接调用私有的method方法
    }
}

public class TestDemo3{
    public static void main(String[] args){
        Demo d = new Demo();
        //System.out.println(d.num);
        //d.method();
        d.show();
        d.func();
    }
}
