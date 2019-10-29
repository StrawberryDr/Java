public class Demo {
    public static void main(String[] args){
        SingleList singleList = new SingleList();
        singleList.display();
        System.out.println("-------------------------");
        singleList.addFirst(10);
        singleList.display();
        System.out.println("-------------------------");
        singleList.addLast(20);
        singleList.display();
        System.out.println("-------------------------");
        singleList.addIndex(0,10);
        singleList.display();
        System.out.println("-------------------------");
        singleList.addIndex(2,10);
        singleList.display();
        System.out.println("-------------------------");
        singleList.addIndex(1,40);
        singleList.display();
        System.out.println("-------------------------");
        singleList.removeAll(10);
        singleList.display();
        System.out.println("-------------------------");
        singleList.clear();
        singleList.display();
        System.out.println("-------------------------");
    }
}
