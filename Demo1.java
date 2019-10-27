public class Demo1 {
    public static void main(String[] args){
        TestDemo1 testDemo1 = new TestDemo1();
        testDemo1.add(0,1);
        testDemo1.add(1,2);
        testDemo1.add(2,3);
        testDemo1.add(3,4);
        testDemo1.display();
        testDemo1.remove(5);
        testDemo1.display();
        testDemo1.clear();
        System.out.println(testDemo1.contains(2));
    }
}
