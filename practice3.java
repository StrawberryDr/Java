import java.util.Arrays;

public class TestDemo2 {

    //奇数在前，偶数在后
    public static void Change(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            while(left < right && arr[left]%2 != 0){
                left++;
            }
            while(left < right && arr[right]%2 == 0){
                right--;
            }
            if(left < right){
                int tmp = arr[left];
                arr[left]=arr[right];
                arr[right]=tmp;
            }
        }
        for(int x:arr){
            System.out.print(x);
        }
    }

    //逆置
    public static String Reverse(int[] arr){
        String array = "[";
        for(int i = 0;i < arr.length/2;i++){
            int ret = arr[i];
            arr[i] = arr[arr.length-(i+1)];
            arr[arr.length-(i+1)] = ret;
        }
        for(int i = 0;i < arr.length;i++){
            array += arr[i];
            if(i < arr.length-1){
                array += ",";
            }
        }
        array += "]";
        return array;
    }
    //平均值
    public static int Average(int[] arr){
        int ret = 0;
        for(int x:arr){
            ret += x;
        }
        ret = ret / arr.length;
        return ret;
    }
    //最小值
    public static int Min(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    //最大值
    public static int Max(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int max = Max(arr);
        int min = Min(arr);
        int average = Average(arr);
        String ret = Reverse(arr);
        System.out.println(max);
        System.out.println(min);
        System.out.println(average);
        System.out.println(ret);
        Change(arr);
    }




    public static void main3(String[] args){
        int[] array = {1,2,3,4,5,6};
        int[] array2 = new int[array.length];
        for(int i = 0;i < array.length;i++){
            array2[i] = array[i];
        }
        //数组拷贝:
//        System.out.println(Arrays.toString(array2));
//        System.arraycopy(array,0,array2,0,array.length);
        array2 = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(array2));
    }

    //字符串形式输出数组
    public static String toString(int[] array){
        String ret ="[";
        for(int i = 0;i < array.length;i++){
            ret = ret + array[i];
            if(i < array.length-1){
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }

//写一个方法，将数组中的每个于是怒*2：
    public static int[] Ret(int[] arr){
        int[] arr1 = new int[arr.length];
        for(int i = 0;i < arr.length;i++){
            arr1[i] = arr[i]*2;
        }
        return arr1;
    }
    public static void main2(String[] args){
       int[] arr = {1,2,3,4,5};
//        int[] ret =Ret(arr);
//        for(int i = 0;i<arr.length;i++){
//            System.out.println(ret[i]);
//        }
        String ret =toString(arr);
        System.out.println(ret);
    }

    public static void main1(String[] args){
        int[] arr = new int[]{1,2,3};
        int[] arr1 = {1, 2, 3};
        System.out.println(arr[1]);
        //for-each遍历数组
        for(int x:arr){
            System.out.println(x);
        }
    }
}
