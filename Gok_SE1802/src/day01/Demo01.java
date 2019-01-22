package day01;
public class Demo01 {
	public static void main(String[] args) {
		/*
		 *1、 标识符：给类、方法或变量等取的名字
		 *    	取名规则： 字母、数字、下划线、美元符号
		 *    		但是： 1、数字不能开头
		 *    			  2、不能是java关键字
		 *    
		 *    标识符需要遵守的规范：
		 *    	1、见名知其意
		 *    	2、当标识符由多个单词组成时，采用驼峰命名法
		 *      3、类名首字母大写
        		4、变量名和方法名首字母小写
        		5、常量所以字母都大写
        		6、包名小写
        		7、工程名首字母大写
		 */
		int age=10;
		String userName="陈凡";
//		int 你好=10;
		
		/*
		 * 2 变量： 
		 *  2.1、变量的本质
		 * 	            变量的本质就是一个“可操作的存储空间”
		 *        形象的理解：变量相当于有名字的容器，该容器用于装载不同类型的数据。
		 * 
		 * 2.2 变量的声明： 
		 * 	   变量的类型  +  变量名  = 变量值
		 * 
		 *  注： 1、java是一门强类型的语言，所以每个变量都必须要有自己的数据类型  
		 *      2、  所有的局部变量如果要用于计算，需要先进行初始赋值,否则 编译报错。
		 */
		int i;// 声明一个int类型的变量i
		i=10; // 对i进行初始赋值(第一次赋值)
//		int a;
//		int b;
//		int c=a+b;  //编译报错， a和b未初始化赋值，不能用于计算
		int a=10; //在声明变量的同时进行初始化赋值
		int b=7;
		int c=a+b;
		int aa,bb,cc; // 在一行可以同时声明多个 变量
		b=10;
		/*
		 * 3、常量：  在程序执行的过程中，其值不发生改变的量
		 * 	  分类：  1、一种是字面常量，一般指的是这个值本身，就叫做常量，比如： 5， 5.5 ，true，' A '
			        2、自定义常量，通过final关键字修饰的变量叫常量
		 */
		final int STATE=0;
//		STATE=10; // 编译报错，常量不可改变
		
		/*
		 * 4、数据类型的分类：
		 * 		1、复合数据类型(数组，类类型，枚举类型。。。。)
		 * 		2、基本数据类型（8个）
		 * 		             分为四类：
		 * 					逻辑类型:  boolean 
		 * 					整数类型(4个)：byte,short,int ,long
		 * 					小数类型（浮点数）2个: float,double 
		 * 					字符类型  1个 :  char
		 */
		
	}
	
	
	
}