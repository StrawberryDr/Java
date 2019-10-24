public class TestDemo2 {

    public static void main(String[] args){

    }
}

//成员变量和局部变量的区别
//成员变量：
//          类中方法外
//          堆内存
//          随着对象的创建而存在，随着对象的消失而消失
//          有默认初始化值
//局部变量：
//          方法定义中或者方法声明上
//          栈内存
//          随着方法的调用而存在，随着方法的调用完毕而消失
//          没有默认初始化值，必须定义、赋值，然后才能使用
class Variable{
    //成员变量
    int num = 10;
    public void show(){
        int num2 = 20; //局部变量
    }
}
