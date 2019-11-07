class ListNode{
    public int data;
    public ListNode next;
    public ListNode random;

    public ListNode(int data,ListNode next,ListNode random){
        this.data = data;
        this.next = null;
        this.random = random;
    }
}

public class SingleList {
    public ListNode head;
    public SingleList(){
    }

    //给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点，要求返回这个链表的深拷贝
    public ListNode copyRandomList(ListNode head){
        if(head == null){
            return null;
        }
        //1、将所有节点串起来
        ListNode cur = head;
        while(cur != null){
            ListNode node = new ListNode(cur.data,cur.next,null);
            ListNode tmp = cur.next;
            cur.next = node;
            cur = tmp;
        }
        //2、解决random指针
        cur = head;
        while (cur != null){
            if(cur.random != null){
                cur.next.random = cur.random.next;
            }else{
                cur.next.random = null;
            }
            cur = cur.next.next;
        }
        //3、拆分链表  cur—>需要拆开的节点
        cur = head;
        ListNode newHead = cur.next;
        while (cur.next != null){
            ListNode tmp = cur.next;
            cur.next = tmp.next;
            cur = tmp;
        }
        return newHead;
    }
}
