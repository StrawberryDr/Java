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

    //链表长度
    public int size() {
        ListNode cur = this.head;
        int size = 0;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }

    //打印

    public void display() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }

    public void display1(ListNode newHead) {
        ListNode cur = newHead;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }

    //清空
    public void clear() {
        ListNode cur = this.head.next;
        while (this.head != null) {
            this.head = null;
            this.head = cur;
        }
    }

    //头插法
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

    //任意位置插入,第一个数据节点下标为0
    public void addIndex(int index, int data) {
        ListNode node = new ListNode(data);
        if (index < 0 || index > size()) {
            System.out.println("index不合法");
        } else if (index == 0) {
            addFirst(data);
        } else {
            ListNode cur = searchIndex(index);
            node.next = cur.next;
            cur.next = node;
        }
    }

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
        if (this.head == null) {
            System.out.println("链表为空");
        }
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
        if (this.head == null) {
            System.out.println("链表为空");
            return;
        }
        if (this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        ListNode prev = searchPrev(key);
        if (prev == null) {
            System.out.println("未找到该关键字");
        } else {
            ListNode cur = prev.next;
            prev.next = cur.next;
        }
    }

    private ListNode searchPrev(int key) {
        ListNode prev = this.head;
        while (prev.next != null) {
            if (prev.next.data == key) {
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }

    //删除所有值为key的节点

    public void removeAll(int key) {
        ListNode cur = this.head;
        ListNode temp = this.head.next;
        if (this.head == null) {
            System.out.println("链表为空片");
            return;
        }
        if (this.head.data == key) {
            this.head = this.head.next;
        }
        while (temp != null) {
            if (temp.data == key) {
                cur.next = temp.next;
                temp = cur.next;
            } else {
                cur = temp;
                temp = cur.next;
            }
        }
    }

    //反转
    public void reverseList() {
        ListNode prev = null;
        ListNode newHead = null;
        ListNode cur = this.head;
        if (this.head == null) {
            System.out.println("链表为空");
            return;
        }
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


//        if(this.head == null){
//            System.out.println("链表为空");
//            return;
//        }
//        while (cur != null){
//            ListNode curNext = cur.next;
//            if(curNext == null){
//                newHead = cur;
//            }
//            cur.next = prev;
//            prev = cur;
//            cur = curNext;
//        }
//        this.head = newHead;
    }

    //中间节点
    public ListNode middleNode() {
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    //输出倒数第k个节点
    public ListNode findKthTail(int k) {
        ListNode fast = this.head;
        ListNode slow = this.head;
        if (k < 0 || this.head == null) {
            return null;
        }
        while (k - 1 > 0) {
            if (fast.next != null) {
                fast = fast.next;
                k--;
            } else {
                return null;
            }
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    //以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
    public ListNode partition(int x) {
        ListNode cur = this.head;
        ListNode beforeStart = null;
        ListNode beforeEnd = null;
        ListNode afterStart = null;
        ListNode afterEnd = null;
        while (cur != null) {
            if (cur.data < x) {
                if (beforeStart == null) {
                    beforeStart = cur;
                    beforeEnd = cur;
                } else {
                    beforeEnd.next = cur;
                    beforeEnd = beforeEnd.next;
                }
            } else {
                if (afterStart == null) {
                    afterStart = cur;
                    afterEnd = cur;
                } else {
                    afterEnd.next = cur;
                    afterEnd = afterEnd.next;
                }
            }
            cur = cur.next;
        }
        if (beforeEnd == null) {
            return afterStart;
        } else {
            if (afterStart != null) {
                afterEnd.next = null;
            }
            beforeEnd.next = afterStart;
            return beforeStart;
        }
    }

    //在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针
    public ListNode deleteDuplication() {
        ListNode node = new ListNode(-1);
        ListNode cur = this.head;
        ListNode tmp = node;
        while (cur != null) {
            if (cur.next != null && cur.data == cur.next.data) {
                while (cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;
            } else {
                tmp.next = cur;
                cur = cur.next;
                tmp = tmp.next;
            }
        }
        tmp.next = null;
        return node.next;
    }

    //链表的回文结构
    public boolean chkPalindrome() {
        if (this.head == null) {
            return false;
        }
        if (this.head.next == null) {
            return true;
        }
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode p = slow.next;
        while (p != null) {
            ListNode pNext = p.next;
            p.next = slow;
            slow = p;
            p = pNext;
        }
        while (slow != head) {
            if (this.head.data == slow.data) {
                this.head = this.head.next;
                slow = slow.next;
                if (head.next == slow) {
                    return true;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    //给定一个链表，判断链表中是否有环
    public boolean hasCycle() {
        ListNode fast = this.head;
        ListNode slow = this.head;
        if (this.head == null) {
            return false;
        }
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    //给一个环
    public void creatLoop() {
        ListNode cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = this.head.next.next;
    }

    //确定环的入口地址
    public ListNode detectCycle() {
        ListNode fast = this.head;
        ListNode slow = this.head;
        if (this.head == null) {
            return null;
        }
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                fast = this.head;
                fast = fast.next;
                slow = slow.next;
                while (slow != fast) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }

    //有环的长度
    public int lengthList() {
        ListNode fast = this.head;
        ListNode slow = this.head;
        int size = 1;
        if (this.head == null) {
            return 0;
        }
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                break;
            }
        }
        fast = fast.next;
        while (slow != fast) {
            fast = fast.next;
            size++;
        }
        size++;
        return size;
    }
}
