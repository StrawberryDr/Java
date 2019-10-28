public class Demo {
    public static void main(String[] args){
        int count = 0;
        Practice practice = new Practice();
        count = practice.usedSize;
        practice.add(0,1);
        practice.add(1,2);
        practice.add(2,3);
        practice.add(3,4);
        practice.display();
        practice.remove(5);
        practice.remove(3);
        practice.display();
        practice.clear();
        practice.display();
        System.out.println(practice.contains(4));
        System.out.println(practice.contains(5));
    }
}
