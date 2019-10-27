import org.omg.CORBA.PUBLIC_MEMBER;
import java.util.Arrays;

public class TestDemo1 {
    public int usedSize;
    public int[] elem ;
    public final int CAPACITY =10;

    public TestDemo1(){
        this.usedSize = 0;
        this.elem = new  int[CAPACITY];
    }

// 打印顺序表
    public void display() {
        for(int i = 0;i < usedSize;i++){
            System.out.println(this.elem[i]);
        }
    }

// 在 pos 位置新增元素
    //1、pos是否合法
    //2、挪数据
    //3、插入数据
    //4、usedSize++
    public void add(int pos, int data) {

        if(pos >= 0 && pos <= usedSize) {
            for(int i = usedSize-1;i >= pos;i--){
                this.elem[i+1] = this.elem[i];
            }
            this.elem[pos] = data;
            this.usedSize++;
        }else if(pos > CAPACITY){
            System.out.println("pos位置不合法");
        }

        if(usedSize == elem.length){
            this.elem = Arrays.copyOf(this.elem,this.elem.length*2);
        }
    }

// 判定是否包含某个元素
    public boolean contains(int toFind) {
        for(int i = 0;i<this.elem.length;i++){
            if(toFind == elem[i]){
                return true;
            }
        }
        return false;
    }

// 查找某个元素对应的位置
    public int search(int toFind) {
        for(int i = 0;i<this.elem.length;i++){
            if(toFind == elem[i]){
                return i;
            }
        }
        return -1;
    }

// 获取 pos 位置的元素
    public int getPos(int pos) {
        int ret =0;
        if(pos >= 0 && pos <= usedSize){
            ret = elem[pos];
            return ret;
        }
        return -1;
    }

// 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if(pos >= 0 && pos <= usedSize){
            elem[pos] = value;
        }
    }

//删除第一次出现的关键字key
    public void remove(int toRemove) {
        if(this.usedSize != 0) {
            for (int i = 0; i <= this.usedSize; i++) {
                if (this.elem[i] == toRemove) {
                    for (int j = i + 1; j <= this.usedSize; j++) {
                        this.elem[j - 1] = this.elem[j];
                        this.usedSize--;
                    }
                }
            }
            System.out.println("未找到");
        }
    }

// 获取顺序表长度
    public int size() {
//        int size = 0;
//        for(int i = 0;i < elem.length;i++){
//
//        }
//        return 0;
        return usedSize;
    }

// 清空顺序表
    public void clear() {
        usedSize = 0;
    }
}

