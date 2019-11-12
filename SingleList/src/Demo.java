public class Demo {
    public static void createCut(ListNode headA,ListNode headB){
        headA.next.next = headB.next.next.next.next;
    }

    //合并两个链表
    public static ListNode mergeTwoLists(ListNode headA,ListNode headB){
        ListNode curA = headA;
        ListNode curB = headB;
        ListNode node = new ListNode(-1);
        ListNode tmp = node;
        while (curA != null && curB != null){
            if(curA.data < curB.data){
                tmp.next = curA;
                curA = curA.next;
                tmp = tmp.next;
            }else {
                tmp.next = curB;
                curB = curB.next;
                tmp = tmp.next;
            }
        }
        if(curA != null){
            tmp.next = curA;
        }
        if(curB != null){
            tmp.next = curB;
        }
        return node.next;
    }

    //两个链表的交点
    public static ListNode getIntersectionNode(ListNode headA,ListNode headB){
        if(headA == null || headB == null){
            return null;
        }
        ListNode pL = headA;  //长
        ListNode pS = headB;  //短

        int lenA = 0;
        while (pL != null){
            lenA++;
            pL = pL.next;
        }
        int lenB = 0;
        while (pS != null){
            lenB ++;
            pS = pS.next;
        }

        int len = lenA - lenB;
        if(len < 0){
            len = lenB - lenA;
            pL = headB;
            pS = headA;
        }else {
            pL = headA;
            pS = headB;
        }

        while (pL != null && len > 0){
            pL = pL.next;
            len --;
        }

        while (pL != null && pL != pS){
            pL = pL.next;
        }
        if(pL == pS && pS != null){
            return pL;
        }
        return null;
    }


    public static void main(String[] args){
        SingleList singleList = new SingleList();
    }
}
