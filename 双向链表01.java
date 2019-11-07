class ListNode{
    public int data;
    public ListNode next;
    public ListNode head;  //后继
    public ListNode prev;  //前驱

    public ListNode(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    public ListNode head;  //头
    public ListNode last;  //尾

    //头插
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        if(this.head == null){
            this.head = node;
            this.last = node;
        }else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }

    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);
        if(this.head == null){
            this.head = node;
            this.last = node;
        }else {
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
    }

    //打印

    public void display(){
        ListNode cur = this.head;
        if(this.head == null){
            System.out.println("链表为空");
        }
        while (cur != null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }
}
