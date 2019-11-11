常量（在运行期间不可以改变）

1.常量声明之后只能初始化一次，之后不能再修改；
2.Java中声明常量的关键字：final---可以不在定义的时候初始化，但是一旦初始化就不能再修改  
  final还可以修饰函数、类、接口 
 （final int x = 10;）
  C语言中声明常量的关键字：const
3.数值类型：
  int：4个字节（默认值为0）
	   System.out.println(Integer.MAX_VALUE);//int的最大值
	   System.out.println(Integer.MIN_VALUE);//int的最小值
  long：8个字节（默认值为0）
	    System.out.println(Long.MAX_VALUE);//long的最大值
	    System.out.println(Long.MIN_VALUE);//long的最小值
  short：2个字节（默认值为0）
         System.out.println(Short.MAX_VALUE);//short的最大值
	     System.out.println(Short.MIN_VALUE);//short的最小值
  double：8个字节（默认值为0.0d）
	      System.out.println(Double.MAX_VALUE);//double的最大值
	      System.out.println(Double.MIN_VALUE);//double的最小值
  float：4个字节（默认值为0.0f）
		 System.out.println(Float.MAX_VALUE);//float的最大值
	     System.out.println(Float.MIN_VALUE);//float的最小值
4.字符类型：
  char：2个字节  没有符号位  0~65535
5.字节类型：
  byte：1个字节   -128~127
6.布尔类型：
  boolean：没有规定字节大小  初始值只有true和false(默认为false)
//以上8个是内置类型（简单类型/基本类型）
7.***字符串类型：
  string：没有\0结尾；   （string是引用类型）
  转义字符：
		   \n   换行
		   \t   水平制表符
		   \'   单引号
		   \"   双引号
		   \\   反斜杠
  "+"操作：当一个含有”+“的表达式中存在字符串的时候，都是执行字符串拼接行为



变量（在运行期间可以改变）

1.变量作用域：变量声明后有效的程序范围/能被访问到的范围；
2.基本数据类型变量存放在虚拟机栈；
 （虚拟机栈容量较小，但运算速度比较快）；
3.局部变量：声明在方法或者小的语句块中的变量；
  在第一次使用之前必须进行初始化；
4.Java中变量作用域在声明该变量的代码块内；   
  当代码块执行结束，块内所有的变量生命结束；   
  内部代码块可以访问外部代码块中的变量；
5.变量的命名规则：只能包括数字、字母、下划线（数字不能开头）；    
  小驼峰命名法：除了第一个单词，后面的每一个单词的首字母大写；
 （book：阿里巴巴Java编程规则）



类型转换（Java是强类型语言，对类型有严格要求）

1.不同数字类型的变量之间赋值，表示范围更小的类型能隐式转换成范围较大的类型；
  eg：int a = 10;
      double b = 10;
	  a = b;  //编译报错
	  b = a;  //编译通过
2.数值类型和布尔类型不能相互赋值；也不能通过强制类型转换实现；
3.使用字面值常量赋值的时候，Java会自动针对数字范围进行检查，判定赋值是否合理；
4.强制类型转换：（可能会引起精度丢失）
  格式：  a = （目标转换类型）b；
  short类型和char类型相互复制一定要进行强制类型转换；
5.数值提升
6.byte和byte的运算：
  eg:  byte a = 10;
       byte b =20;
	   byte c = a + b;
	   System.out.println(c);   //编译错误---运算之前要先提升类型为int类型，再参与运算
								（CPU是按照四个字节为单位来读取数据进行运算，所有不够四个字节的数据都会先进行数值类型提升为四个字节）
	   改正：
	   byte c = (byte)(a + b);  //先进行强制转换





