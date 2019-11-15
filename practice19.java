//final class Animal  --->类被final修饰后不能被继承
//final可以修饰常量、属性、类
class Animal{
    public String name;
    public int age;
    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println(this.name + "Animal::eat()");
    }
}
class Cat extends Animal{   //关键字extends
    public String sex;
    public Cat(String name,int age,String sex){
        super(name,age);   //super显示调用父类的构造方法
        this.sex= sex;
    }
    public void jump(){
        System.out.println(this.name + "跳");
    }
    public void eat(){
        System.out.println(this.name + "Cat::eat()");
    }
}
public class TestDemo {
    public static void main(String[] args){
        Animal animal = new Animal("动物",10);
        Cat cat = new Cat("豆豆",1,"women");
        cat.jump();
        cat.eat();
    }
}
