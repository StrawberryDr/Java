//编写一个类Calculator,有两个属性num1,num2,这两个数据的值
// 不能在定义的同时初始化，最后实现加减乘除四种运算.

class Calculator{
    int num1;
    int num2;

    public int Sum(int a,int b){
        return a+b;
    }
    public int Sub(int a,int b){
        if(a>=b){
            return a-b;
        }else{
            return b-a;
        }
    }
    public int Mul(int a,int b){
        return a*b;
    }
    public void Consult(int a,int b){
        if(b != 0){
            System.out.println("商："+a/b);
        }else{
            System.out.println("除数不能为0！");
        }
    }
}

public class TestDemo1 {
    public static void main(String[] args){
        Calculator c = new Calculator();
        c.num1 = 0;
        c.num2 = 4;
        System.out.println("和："+c.Sum(c.num1,c.num2));
        System.out.println("差："+c.Sub(c.num1,c.num2));
        System.out.println("积："+c.Mul(c.num1,c.num2));
        c.Consult(c.num1,c.num2);
    }
}
