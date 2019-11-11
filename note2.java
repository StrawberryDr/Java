逻辑控制

顺序结构：按照代码书写的顺序一行一行执行


分支结构
1.if语句
  语法形式1：
            if(布尔表达式)｛
				条件满足时执行的代码块;
			}
				
  语法形式2：
			if(布尔表达式){
				条件满足时执行的代码块;
			}else{
				条件不满足时执行的代码块
			}
  语法形式3：
			if(布尔表达式){
				条件满足时执行的代码块;
			}else if(布尔表达式){
				条件满足时执行的代码块;
			}else{
				条件不满足时执行的代码块;
			}
//悬垂else：和最近的if匹配

2.switch语句
  语法格式：
			switch(整数|枚举|字符|字符串){
				case 内容1:{
					内容满足时执行的代码块;
					break;
				}
				case 内容2:{
					内容满足时执行的代码块;
					break;
				}
				···
				default:{
					内容不满足时执行的代码块;
					break;
				}
			}

  不能作为 switch 参数的类型： long  double  float  boolean ；
  switch 不能表达复杂的条件；
  switch 支持嵌套，但是不建议使用，影响代码的美观性；


循环结构
1.while循环
  语法格式：
			while(循环条件){
				循环语句;
			}
  //循环条件为 true 时执行；

  break ：提前结束循环
  continue ：跳过本次循环，立即进入下一次循环
2.for循环
  语法格式：
			for(表达式1;表达式2;表达式3){
				循环体;
			}
	表达式1：用于初始化循环变量
	表达式2：循环条件（）
	表达式3：更新循环变量
	for 写死循环，只需要表达式2的循环条件为空即可。（eg: for(int i; ;i++)）
3. do while 循环
   语法格式： do{
				 循环语句;
				}while(循环条件);
	先执行循环语句，再判定循环条件


输入输出
1.System.out.println(msg);  // 输出一个字符串, 带换行
  System.out.print(msg);  // 输出一个字符串, 不带换行
  System.out.printf(format, msg);  //格式化输出
2.System.in  键盘 输入
  System.out 屏幕 输出
  //编译时异常必须处理后再使用
  import java.io.IOException;
  （ import ：引入包  （include））
  import java.util.Scanner;
  （util 工具类）
  
  









  