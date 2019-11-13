类和对象

类
1.OOP语言：面向对象程序设计语言；
  OOP语言的三大特征：继承、封装、多态；
2.面向对象和面向过程：
  面向过程：C语言；关注过程，过程中涉及的行为即功能；
			处理小问题
  面向对象：Java、C++；关注对象，参与对象涉及到的主体，是通过逻辑将一个个功能实现连接起来；
			处理大问题
3.类：模板
  对象：实体
  一个类可以产生多个对象；

4.定义类的语法：
  class 类名{
	  类体;
  }
eg:——————————————————————
public class TextDemo1 {
    public static void main(String[] args){
        Person person = new Person();
        System.out.println(person.count);   //可以通过引用访问静态成员变量，但是不建议，存在警告；
        System.out.println(Person.count);   //静态成员变量/方法的访问通过类进行——>类名.属性；
        System.out.println(person.SIZE2);  //实例成员变量的访问需要引用；
    }
    
    public static void main1(String[] args){
        //实例化一个对象——new关键字
        Person person = new Person();
        person.show();
        person.name = "zhangfei";
    }
}

class Person{
    public String name = "bit";  //属性  成员变量  实例成员变量
    //不建议在定义变量时初始化；在主函数中使用person.name的方式进行赋值；
    public int age = 19;
    
    public static int count = 10;  //static修饰的为静态成员变量；存放在堆的方法区；
    public static final int SIZE = 10;
    
    public final int SIZE2 = 20;//实例成员变量；final修饰后存放位置不一定

    //行为
    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }

    public void show(){
        System.out.println(" name: "+name+"  age: "+age);
    }
}

非常重要：所有被 static 修饰的不管是方法还是成员，都不依赖于对象；（属于类，并且只有一份，存放在方法区）

//成员变量和局部变量的区别
成员变量：
          类中方法外
          堆内存
          随着对象的创建而存在，随着对象的消失而消失
          有默认初始化值
局部变量：
          方法定义中或者方法声明上
          栈内存
          随着方法的调用而存在，随着方法的调用完毕而消失
          没有默认初始化值，必须定义、赋值，然后才能使用

局部变量和成员变量的名称可以相同，在方法中使用时，采取就近原则

成员变量如果没有进行初始化直接打印，结果的默认值是所对应的0值；
  引用类型——>null;(数组、类、string）
  简单类型——>对应0值；
成员变量未初始化打印其长度，会发生空指针异常；



5.形式参数问题
//		基本类型：形式参数的改变不影响实际参数
//		引用类型：形式参数的改变直接影响实际参数

eg:
//形式参数是基本类型：
class Demo{
	public int sum(int a, int b){
		return a+b;
	}
}

//形式参数是引用类型  (类是引用类型)
class Student{
	public void show(){
		System.out.println("我爱学习");
	}
}
class StudentDemo{
	//如果一个方法的形式参数是引用类型，这里需要的是该类的对象
	public void method(Student s){
		//调用时，把main方法中的s的地址传送到这里
		s.show();
	}
}

class Test{
	public static void main(String[] args){
		//形式参数是基本类型的调用
		Demo d= new Demo();
		int ret = d.sum(10,20); 
		System.out.println(ret);
		
		//形式参数是引用类型的调用
		//调用StudentDemo类中的method()方法
		StudentDemo sd = new StudentDemo();
			//创建学生对象
		Student s = new Student();
		sd.method(s); //把s的地址给到这里
	}
}


6.匿名对象
//匿名对象：就是没有名字的对象
//匿名对象的应用场景：
//					1.调用方法，仅仅只调用一次的时候；（调用多次的时候不适合）
//					2.可以作为实际参数传递；
//匿名对象调用的好处：匿名对象调用完毕就是垃圾，可以被垃圾回收器回收；提高了内存使用效率；

eg:
class Student{
	public void show(){
		System.out.println("我爱学习");
	}
}

class StudentDemo{
	public void method(Student s){
		s.show();
	}
}

class NoNameDemo{
	public static void main(String[] args){
		//带名字的调用
		Student s = new Student();
		s.show();
		s.show();//同一个对象调用两次方法的时候
		
		//匿名对象
		//new Student();
		//匿名对象调用方法
		new Student().show();
		new Student().show();//匿名对象只能使用一次，这里其实是创建了一个新的对象再调用一次show()方法；
		
		//带名字的实际参数传递
		StudentDemo sd = new StudentDemo();
		Student s = new Student();
		sd.method(s);  //这里的s是一个实际参数
		//匿名对象作为实际参数传递
		sd.method(new Student());
		
		//多个匿名对象
		new StudentDemo().method(new Student());
	}
}


7.封装
//为了不让类的调用者。直接访问到我们的数据成员 方法
//定义：隐藏对象的属性和细节，仅对外提供公共访问方式；
//好处：隐藏实现细节，提供公共的访问方式；
//		提高了代码的复用性
//		提高安全性
//封装原则：将不需要对外提供的内容隐藏起来；把属性隐藏，提供公共方法对其访问；

eg:
/*
	定义一个学生类：
			成员变量：name，age
			成员方法：show()方法；
*/
class Student{
	//姓名
	String name;
	//年龄
	//int age;
	private int age；
	
	//数据校验
	public void setAge(int a){
		if(age<0 || age>120){
			System.out.println("数据有误");
		}else{
			age = a;
		}
	
	
	//show()方法，显示所有成员变量
	public void show(){
		System.out.println("姓名"+name);
		System.out.println("年龄"+age);
	}
	
}
class StudentDemo{
	public static void main(String[] args){
		//创建学生对象
		Student s = new Student();
		s.show();  //打印结果：null  0
		
		//给成员变量赋值
		s.name = "憨憨";
		//s.age = 18;
		s.setAge(27);
		s.show();
		
		//给age赋值
		//s.age = -27;  //这个数据是不合理的
		//s.show();
		//我们在这里发现了一个问题：通过对象给成员变量赋值时，可以赋值一些非法的数据；
		//要在赋值之前先对数据进行判断；
		//判断在Student类中进行；不可以在成员变量的位置进行判断；（因为做数据校验依靠赋值语句，赋值语句要定义在方法中）
		//StudentDemo类是一个测试类，测试类一般只创建对象、调用方法；
		
		//通过方法给值
		s.setAge(-27);
		s.show();  //打印：数据有误
		//但是如果不调用方法赋值，数据校验功能不起作用；
		//为了解决该问题，我们可以强制要；求必须使用方法进行校验，而不能直接调用成员变量赋值；
		//利用private关键字解决该问题
		
	}
}

******private 关键字
//是一个权限修饰符
//可以修饰成员（成员变量和方法）
//被private修饰的成员，只能在本类中被访问；

eg:
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

private 最常见的应用
//把成员变量用private修饰
//提供对应的get(),set()方法
//一个标准的案例的使用

eg:
class StudentDemo {
    private String name;
    private int age;

    //获取值
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
	
    //赋值
    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }
}

public class TestDemo4 {
    public static void main(String[] args){
        //创建学生对象
        StudentDemo s = new StudentDemo();

        //使用成员变量
        //System.out.println(s.name+"---"+s.age);  //private修饰
        System.out.println(s.getName()+"---"+s.getAge());

        //给成员变量赋值
        //s.name = "嘻嘻";
        //s.age = 27;
        s.setAge(27);
        s.setName("林青霞");
    }
}


******this 关键字
				this.成员；
				this.成员变量；
				this()；

//当前类的对象引用；就代表当前类的一个对象；
//注意：谁调用这个方法，在该方法内部的this就代表哪个对象；
//解决局部变量隐藏成员变量
//通过this调用其他构造方法，必须要把this放在第一句；并且只能有一个；
eg：
class StudentDemo {
    private String name;
    private int age;

    //获取值
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    //赋值

    public void setName(String name) {
        //name = name;  //就近原则，相当于把自己给自己；
        this.name = name;  //this代表name
    }

    public void setAge(int age) {
        //age = age;   //就近原则，相当于把自己给自己；
        this.age = age;   //this代表age
    }
}

public class TestDemo4 {
    public static void main(String[] args){
        //创建学生对象
        StudentDemo s = new StudentDemo();

        //给成员变量赋值
        s.setAge(27);
        s.setName("林青霞");

        //获取数据
        System.out.println(s.getName()+"---"+s.getAge());
    }
}


******构造方法
给对象的数据进行初始化
格式：
	方法名与类名相同；
	没有返回值类型，甚至连void都没有
	没有具体返回值，不需要return
注意：
	如果我们没有给出构造方法，系统将自动提供一个无参构造方法；
	如果我们给出了构造方法，系统就不再提供默认的无参构造方法；（如果这时还想使用无参构造方法，必须自己给出无参构造方法）
	构造方法可以是私有的；私有的构造方法不能在类外得到对象（单例模式）
eg:
class Student1{
    private String name;  //null
    private int age;  //0

    public Student1(){
        System.out.println("这是构造方法");
    }
}

public class ConstructDemo {
    public static void main(String[] args){
        //创建对象
        Student1 s = new Student1();
        System.out.println(s);  //哈希地址

    }
}

构造方法的重载：
class Student1{
    private String name;  //null
    private int age;  //0

    public Student1(){
        System.out.println("这是构造方法");
    }

    //构造方法的重载
    public Student1(String name){
        System.out.println("这是带一个String类型的构造方法");
        this.name = name;
    }

    public void show(){
        System.out.println(name+"---"+age);
    }
}

public class ConstructDemo {
    public static void main(String[] args){
        //创建对象
        Student1 s = new Student1();
        //System.out.println(s);  //哈希地址
        s.show();
        System.out.println("-------------------------");
        Student1 s1 = new Student1("林青霞");
        s1.show();
    }
}

7.为什么main函数必须是用static所修饰的？
  所有被 static 修饰的不管是方法还是成员，都不依赖于对象；
  static 修饰的main函数不需要通过对象调用；
  
8.静态方法内部，不能访问非静态的数据成员；
  静态的方法不依赖于对象；
  
9.产生一个对象的步骤：
					为对象分配内存；
					合适的构造方法；

10.代码块：同一种代码块的执行与其顺序有关
		本地代码块
		实例代码块：类中方法外——>初始化类的实例数据成员；
					优先于构造方法执行；
		静态代码块：由 static 修饰——>初始化静态数据成员；
					优先于实例代码块执行；
					只初始化一次；
		
  


  




