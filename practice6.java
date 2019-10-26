
public class TestDemo1 {
    public static void main(String[] args){
        Phone p = new Phone();
        p.brand = "华为";
        p.color = "黑色";
        System.out.println(p.color);
        p.play();
        p.call("嘻嘻嘻");
    }

    public static void mainStudent(String[] args) {
        Student s = new Student();  //创建一个对象

        //输出成员变量值；
        System.out.println(s.name);  //未初始化打印对应类型的零值
        System.out.println(s.age);
        System.out.println(s.address);

        //给成员变量赋值
        s.name = "憨憨";

        //调用方法
        s.eat();
        s.sleep();
        s.study();
    }
}

//定义一个类
class Student{

    //定义变量
    String name;
    int age;
    String address;

    //定义方法
    public void study(){
        System.out.println("学生爱学习");
    }
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}



//手机类
class Phone{

    //定义变量
    String color;
    String brand;
    int price;

    //定义方法
    public void call(String name){
        System.out.println("给" + name +"打电话");
    }
    public void send(){
        System.out.println("发短信");
    }

    public void play(){
        System.out.println("玩游戏");
    }
}