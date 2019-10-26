//实现交换两个变量的值。要求：需要交换实参的值

class Func {
    int[] arr = {};

    public void change(int arr[]) {
        int temp = 0;
        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        for(int x:arr){
            System.out.println(x);
        }
    }
}

public class TestDemo3 {
    public static void main(String[] args){
       int[] arr = {5,40};
        Func s = new Func();
        s.change(arr);
    }
}
