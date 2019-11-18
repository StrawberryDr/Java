//自定义类型进行排序的时候，一定要实现Comparable接口，并且要重写compareTo方法
class Student implements Comparable<Student>{
    public String name;
    public  int age;
    public double score;

    public Student(String name,int age,double score){
        this.name = name;
        this.age = age;
        this.score = score;
    }
    @Override
    public  int compareTo(Student o){
        return this.age-o.age;  //按照年龄排序
    }
}

public class TestDemo {
}
