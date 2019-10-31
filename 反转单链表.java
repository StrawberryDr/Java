import com.sun.org.apache.bcel.internal.generic.LUSHR;

//节点类
class ListNode{
    public int data;
    public ListNode next;

    public ListNode(int data){
        this.data = data;
        this.next = null;
    }
}

public class SingleList {
    public ListNode head;

    public SingleList() {
    }

    //头插法
    //1、判断是不是第一次插入；
    //2、进行插入操作
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }

    //尾插法
    //1、如果是第一次插入即head == null;
    //2、不是第一次插入：cur从头开始遍历，直到cur.next == null时，将node赋给cur.next
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        if (this.head == null) {
            this.head = node;
        } else {
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    //任意位置插入，第一个数据节点为0号下标
    public void addIndex(int index, int data) {
        ListNode node = new ListNode(data);
        if (index < 0 || index > size()) {
            System.out.println("输入index不合法");
        } else if (index == 0) {
            addFirst(data);
        } else {
            ListNode cur = searchIndex(index);
            node.next = cur.next;
            cur.next = node;
        }
    }

    //找到index标号的前一个
    private ListNode searchIndex(int index) {
        ListNode cur = this.head;
        for (int i = 0; i < index - 1; i++) {
            cur = cur.next;
        }
        return cur;
    }

    //查找是否包含关键字key
    public boolean contains(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除第一次出现的关键字key
    public void remove(int key) {
        ListNode cur = this.head;
        ListNode temp = this.head.next;
        if (this.head == null) {
            System.out.println("单链表为空");
            return;
        }
        if (this.head.data == key) {
            this.head = this.head.next;
        } else if (temp.data == key) {
            cur.next = temp.next;
            temp = cur.next;
        } else {
            cur = temp;
            temp = temp.next;
        }
    }


    //删除所有值为key的节点
    public void removeAll(int key) {
        ListNode cur = this.head;
        ListNode temp = this.head.next;
        if (this.head == null) {
            System.out.println("单链表为空");
            return;
        }
        while (temp != null) {
            if (this.head.data == key) {
                this.head = this.head.next;
            } else if (temp.data == key) {
                cur.next = temp.next;
                temp = cur.next;
            } else {
                cur = temp;
                temp = temp.next;
            }
        }
    }

    //单链表长度
    public int size() {
        ListNode cur = this.head;
        int size = 0;
        while (cur.next != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }

    //打印单链表
    public void display() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.println(cur.data + " ");
            cur = cur.next;
        }
    }

    //清空单链表
    public void clear() {
        ListNode cur = this.head.next;
        while (this.head != null) {
            this.head = null;
            this.head = cur;
        }
    }

    //反转
    public void reverseList() {
        ListNode prev = null;
        ListNode newHead = null;
        ListNode cur = this.head;

        while (cur != null) {
            ListNode curNext = cur.next;
            if (curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        this.head = newHead;
    }

    //链表的中间节点:一快一慢指针
    public ListNode middleNode() {
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}


