 class ListNode{
    public int data;
    public ListNode next;

    public ListNode(int data){
        this.data = data;
        this.next = null;
    }
 }//节点类

public class SingleList {
    public ListNode head;
    public SingleList(){

    }

    //头插法
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        if(this.head == null){
            this.head = node;
        }else{
            node.next = this.head;
            this.head = node;
        }
    }

    //尾插法

    public void addLast(int data){
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        if(this.head == null){
            this.head = node;
        }else{
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    //任意位置插入，第一个数据节点下标为0
    public void addIndex(int index,int data){
        ListNode node = new ListNode(data);
        if(index < 0 || index > size()){
            System.out.println("输入的index不合法");
        }else if(index == 0){
            addFirst(data);
        }else{
            ListNode cur = searchIndex(index);
            node.next = cur.next;
            cur.next = node;
        }
    }
    private ListNode searchIndex(int index){
        ListNode cur = this.head;
        for(int i =0;i < index-1;i++){
            cur = cur.next;
        }
        return cur;
    }//找到index下标的前驱

    //查找是否包含关键字key
    public boolean contains(int key){
        ListNode cur = this.head;
        if(this.head == null){
            System.out.println("链表为空");
        }
        while(cur != null){
            if(cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除第一次出现的关键字key
    public void remove(int key){
        if(this.head == null){
            System.out.println("链表为空");
            return;
        }
        if(this.head.data == key){
            this.head = this.head.next;
            return;
        }
        ListNode prev = searchPrev(key);
        if(prev == null){
            System.out.println("未找到该关键字");
        }else{
            ListNode cur = prev.next;
            prev.next = cur.next;
        }
    }
    private ListNode searchPrev(int key){
        ListNode prev = this.head;
        while(prev.next != null){
            if(prev.next.data == key){
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }

    //删除所有值为key的节点
    public void removeAll(int key){
        ListNode cur = this.head;
        ListNode temp = this.head.next;
        if(this.head == null){
            System.out.println("链表为空");
            return;
        }
        while(temp != null){
            if(temp.data == key){
                cur.next = temp.next;
                temp = cur.next;
            }else{
                cur = temp;
                temp = cur.next;
            }
        }
        if(this.head.data == key){
            this.head = this.head.next;
        }
    }

    //单链表长度
    public int size(){
        ListNode cur = this.head;
        int size = 0;
        while(cur != null){
            size ++;
            cur = cur.next;
        }
        return size;
    }

    //打印

    public void display(){
        ListNode cur = this.head;
        while (cur != null){
            System.out.println(cur.data + "  ");
            cur = cur.next;
        }
    }

    //清空
    public void clear(){
        ListNode cur = this.head.next;
        while (this.head != null){
            this.head = null;
            this.head = cur;
        }
    }

    //反转
    public void reverseList(){
        ListNode prev = null;
        ListNode newHead = null;
        ListNode cur = this.head;
        if(this.head == null){
            System.out.println("链表为空");
            return;
        }
        while (cur != null){
            ListNode curNext = cur.next;
            if(curNext == null){
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        this.head = newHead;
    }

    //链表的中间节点
    public ListNode middleNode(){
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    //输出倒数第K个节点
    public ListNode findKthTail(int k){
        ListNode fast = this.head;
        ListNode slow = this.head;
        if(k < 0 || this.head == null){
            return null;
        }
        while(k-1 >0){
            if(fast.next != null){  //fast先走k-1步
                fast = fast.next;
                k--;
            }else{
                System.out.println("没有这个节点");
                return null;
            }
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
