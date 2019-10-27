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

//    public SingleList() {
//
//    }

//头插法
    //1、是不是第一次插入
    //2、进行插入操作
    public void addFirst(int data) {
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

//任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        ListNode node = new ListNode(data);
        if(index < 0 || index >size()){
            System.out.println("不合法index");
        }else if(index == 0){
            addFirst(data);
        }else{
            ListNode cur = searchIndex(index);
            node.next = cur.next;
            cur.next = node;
        }
    }
    //找到index标号的前一个
    private ListNode searchIndex(int index){
        ListNode cur = this.head;
        for(int i = 0;i < index-1; i++){
            cur = cur.next;
        }
        return cur;
    }


//查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        ListNode cur = this.head;
        while(cur != null){
            if(cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

//删除第一次出现关键字为key的节点
    public void remove(int key){
    }

//删除所有值为key的节点
    public void removeAllKey(int key){
    }

//得到单链表的长度
    public int size(){
        ListNode cur = this.head;
        int size = 0;
        while(cur != null){
            size ++;
            cur = cur.next;
        }
        return size;
    }

//打印单链表
    public void display(){
        ListNode cur = this.head;
        while(cur != null){
            System.out.println(cur.data+" ");
            cur = cur.next;
        }
    }

//清空单链表
    public void clear(){
    }

}//单链表
