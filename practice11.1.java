import java.util.Arrays;

public class Practice {
    public int usedSize;
    public int[] elem;
    public final int CAPACITY = 10;

    public Practice() {
        this.usedSize = 0;
        this.elem = new int[CAPACITY];
    }

// 打印顺序表
    public void display() {
        for(int i = 0;i < usedSize;i++){
            System.out.print(this.elem[i] + "  ");
        }
        System.out.println("\n"+this.usedSize);
    }

//在pos位置插入元素
    //1、pos是否合法
    //2、挪数据：从（usedsize-1）标号位置的元素开始依次往后移
    //3、插入数据
    //4、usedSize++
    public void add(int pos,int data){
        if(pos >= 0 && pos <= usedSize){
            for(int i = usedSize-1;i >= pos;i--){
                this.elem[i+1] = this.elem[i];
            }
            this.elem[pos] = data;
            usedSize++;
        }else if(pos > usedSize){
            System.out.println("\n");
            System.out.println("输入的pos位置不合法");
        }
        //如果表满，将表长度扩大为原来的2倍
        if(usedSize == elem.length){
            this.elem = Arrays.copyOf(this.elem,this.elem.length*2);
        }
    }

//判断是否包含某个元素
    public boolean contains(int toFind){
        for(int i = 0;i < this.elem.length;i++){
            if(toFind == this.elem[i]){
                return true;
            }
        }
        return false;
    }

//查找某个元素对应的位置
    public int search(int toFind){
        for(int i =0;i < this.elem.length;i++){
            if(toFind == this.elem[i]){
                return i;
            }
        }
        return -1;
    }

//获取pos位置的元素
    public int getPos(int pos){
        int ret = 0;
        if(pos >= 0 || pos < this.usedSize){
            ret = this.elem[pos];
            return ret;
        }
        return -1;
    }

//将pos位置的元素设置为value
    public void setPos(int pos,int value){
        if(pos >= 0 && pos < this.usedSize){
            this.elem[pos] = value;
        }
    }

//删除第一次出现的关键字key
    public void remove(int toRemove){
        int ret = search(toRemove);
        if(ret == -1){
            System.out.println("未找到该关键字");
            return;
        }
        for(int i = ret;i < this.usedSize;i++){
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize --;
    }

//    public void remove(int toRemove) {
//        if(this.usedSize != 0) {
//            for (int i = 0; i < this.usedSize; i++) {
//                if (this.elem[i] == toRemove) {
//                    for (int j = i + 1; j <= this.usedSize; j++) {
//                        this.elem[j - 1] = this.elem[j];
//                        this.usedSize--;
//                    }
//                }
//            }
//            System.out.println("未找到该关键字");
//        }
//    }

//获取顺序表长度
    public int size(){
        return this.usedSize;
    }

//清空顺序表
    public void clear(){
        this.usedSize = 0;
    }

}