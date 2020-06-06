
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Main {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if (pHead == null || pHead.next == null) {
            return null;
        }
        //创建两个新的链表接收值
        //小于x的值放在leftHead链表中
        //大于x的值放在rightHead链表中
        ListNode leftHead = new ListNode(-1);
        ListNode leftTail = leftHead;
        ListNode rightHead = new ListNode(-1);
        ListNode rightTail = rightHead;

//        ListNode cur = pHead;
        for(ListNode cur = pHead;cur != null;cur = cur.next){
            if(cur.val < x){
                leftTail.next = new ListNode(cur.val);
                leftTail = leftTail.next;
            }else {
                rightTail.next = new ListNode(cur.val);
                rightTail = rightTail.next;
            }
        }
        leftTail.next = rightHead;
        return leftHead.next;
    }
}
