public class Demo2 {
    public static void main(String[] args){
        SingleList singleList = new SingleList();
        singleList.display();
        singleList.addFirst(20);
        singleList.display();
        System.out.println("------------");
        singleList.addLast(30);
        singleList.display();
        System.out.println("------------");
        singleList.addIndex(0,10);
        singleList.display();
        System.out.println("------------");
        singleList.addIndex(2,40);
        singleList.display();
        System.out.println("------------");
        singleList.addIndex(1,10);
        singleList.display();
        System.out.println("------------");
    }
}
