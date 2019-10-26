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
        this.name = name;
    }

    public void setAge(int age) {
        //age = age;   //就近原则，相当于把自己给自己；
        this.age = age;
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
