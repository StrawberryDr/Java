数组


一维数组：

1.基本语法：
  //动态初始化
  数据类型[] 数组名称 = new 数据类型[]{初始化数据};
  
  //静态初始化
  数据类型[] 数组名称 = {初始化数据};
eg：
	int[] arr = new int[]{1, 2, 3};
	int[] arr = {1, 2, 3};
  //定义数组后没有初始化，默认值为0；
  //数组中如果是引用类型，默认值为null；
	
	new 关键字：产生一个对象；
	“引用”：用来存放对象的地址；
	数组越界在运行期间会发生数组越界异常；
	
2.打印数组：
获取数组长度：  
  System.out.println(arr.length);
  //这里的length不是方法，是一个属性
  
  for-each遍历数组：
					for(表达式1:表达式2){
						
					}
  for-each和for循环遍历数组的区别：for-each不能够通过下标访问数组；
  
  System.out.println(Arrays.toString(数组名));//将数组以字符串形式输出
  （Arrays方法在import.java.util.Arrays包中）
  
3.Java中数组的内存分析：
//JVM  
  Java虚拟机栈：局部变量；
  本地方法栈：native方法的局部变量---底层由c/c++实现；速度快；
  程序计数器：下一条执行指令的地址；
  堆：对象；new关键字修饰；
  方法区：静态变量、类的信息；
  常量池：作用--->存放字符串常量；（JDK 1.7 之前，常量池在方法区中；JDK 1.7 开始，常量池在堆中）
  
//哈希码

4.null：是所有引用类型的初始值；
  空指针异常：
eg:  int[] array = null;  //长度为0
	 System.out.println(array.length);
	 
  String str = "hello";
  System.out.println(str.length());  //这里的length是一个方法；
  
5.数组的拷贝
  for 循环；
  System.arraycopy(原数组名,0,目的数组名,0,原数组长度);
  目的数组名 = Arrays.copyOf(原数组名,array.原数组长度);
  //后两者的区别和联系：arraycopy是一个被native修饰的方法；
  //					Array.copyOf内部调用了arraycopy方法；
  //arraycopy速度更快；
  目的数组名 = 原数组名.clone();
  
eg：
	public static void main(String[] args){
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
  
  深拷贝：如果原数组中存放的是简单类型，即为深拷贝；
  浅拷贝：如果原数组中存放的是引用类型，即为浅拷贝；

//冒泡排序
//二分查找


二维数组：

1.基本语法：
  数据类型[][] 数组名称 = new 数据类型 [行数][列数]{初始化数据};
2.打印数组：
  System.out.println(Arrays.deepToString(array));
  
  //为了防止数组越界异常，通常用下面的方式打印不规则二维数组：
  for (int row = 0; row < arr.length; row++) { 
	for (int col = 0; col < arr[row].length; col++) { 
		System.out.printf("%d\t", arr[row][col]); 
	} 
	System.out.println(""); 
  }
  
  
可变参数编程
public static int sum(int... a){
	int ret = 0;
	for(int x:a){
		ret += x;
	}
	
System.out.println(sum(int[]{1,2,3,4,5}));   //匿名数组


  
  
 






  
  