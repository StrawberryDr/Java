import java.security.Signature;

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
    public SingleList(){
    }

    public int size(){
        ListNode cur = this.head;
        int size = 0;
        while (cur != null){
            size++;
            cur = cur.next;
        }
        return size;
    }

    public void display(){
        ListNode cur = this.head;
        while (cur != null){
            System.out.println(cur.data + " ");
            cur = cur.next;
        }
    }
    public void display1(ListNode newHead){
        ListNode cur = newHead;
        while (cur != null){
            System.out.println(cur.data + " ");
            cur = cur.next;
        }
    }

    public void addFirst(int data){
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }

    public void addLast(int data){
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        if(this.head == null){
            this.head = node;
        }else {
            while (cur.next != null){
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    public void addIndex(int index,int data){
        ListNode node = new ListNode(data);
        if(index < 0 || index > size()){
            System.out.println("index不合法");
        }else if(index == 0){
            addFirst(data);
        }else {
            ListNode cur = searchIndex(index);
            node.next = cur.next;
            cur.next = node;
        }
    }
    private ListNode searchIndex(int index){
        ListNode cur = this.head;
        for(int i = 0;i < index-1;i++){
            cur = cur.next;
        }
        return cur;
    }

    public boolean contains(int key){
        if(this.head == null){
            System.out.println("链表为空");
        }
        ListNode cur = this.head;
        while (cur != null){
            if(cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

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
            System.out.println("未找到关键字");
        }else {
            ListNode cur = prev.next;
            prev.next = cur.next;
        }
    }
    private ListNode searchPrev(int key){
        ListNode prev = this.head;
        while (prev.next != null){
            if(prev.next.data == key){
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }

    public void removeAllkey(int key){
        ListNode cur = this.head;
        ListNode tmp = this.head.next;
        if(this.head == null){
            System.out.println("链表为空");
            return;
        }
        if(this.head.data == key){
            this.head = this.head.next;
        }
        while (tmp != null){
            if(tmp.data == key){
                cur.next = tmp.next;
                tmp = cur.next;
            }else {
                cur = tmp;
                tmp = cur.next;
            }
        }
    }

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
            cur = newHead;
        }
        this.head = newHead;
    }

    public ListNode middleNode(){
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode fingKthTail(int k){
        ListNode fast = this.head;
        ListNode slow = this.head;
        if(k < 0 || this.head == null){
            return null;
        }
        while (k - 1 > 0){
            if(fast.next != null){
                fast = fast.next;
                k--;
            }else {
                return  null;
            }
        }
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode partition(int x){
        ListNode cur = this.head;
        ListNode beforeStart = null;
        ListNode beforeEnd = null;
        ListNode afterStart = null;
        ListNode afterEnd = null;
        while (cur != null){
            if(cur.data < x){
                if(beforeStart == null){
                    beforeStart = cur;
                    beforeEnd = cur;
                }else {
                    beforeEnd.next = cur;
                    beforeEnd = beforeEnd.next;
                }
            }else {
                if(afterStart == null){
                    afterStart = cur;
                    afterEnd = cur;
                }else {
                    afterEnd.next = cur;
                    afterEnd = afterEnd.next;
                }
            }
            cur = cur.next;
        }
        if(beforeEnd == null){
            return afterStart;
        }else {
            if (afterStart != null) {
                afterEnd.next = null;
            }
            beforeEnd.next = afterStart;
            return beforeStart;
        }
    }

    public ListNode deleteDuplication(){
        ListNode node = new ListNode(-1);
        ListNode  cur = this.head;
        ListNode tmp = node;
        while (cur != null){
            if(cur.next != null && cur.data == cur.next.data){
                while (cur.next != null && cur.data == cur.next.data){
                    cur = cur.next;
                }
                cur = cur.next;  //不保留，删除本行代码即只保留一个重复元素
            }else {
                tmp.next = cur;
                cur = cur.next;
                tmp = tmp.next;
            }
        }
        tmp.next = null;
        return node.next;
    }

    public boolean chkPalindrome(){
        if(this.head == null){
            return false;
        }
        if (this.head.next == null){
            return  true;
        }
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode p = slow.next;
        while (p != null){
            ListNode pNext = p.next;
            p.next = slow;
            slow = p;
            p = pNext;
        }
        while (slow != head){
            if(this.head.data == slow.data){
                this.head = this.head.next;
                slow = slow.next;
                if(head.next == slow){
                    return true;
                }
            }else {
                return false;
            }
        }
        return false;
    }
}
