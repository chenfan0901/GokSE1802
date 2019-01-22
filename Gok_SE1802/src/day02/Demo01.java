/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day02;
public class Demo01 {
	public static void main(String[] args) {
		/*
		 * 八大基本数据类型
		 */
		/*
		 * 1、 逻辑类型      boolean
		 *     字面常量值：        true  ,false
		 *     字节数：    	当boolean声明一个基本类型的变量时，那么该变量占4个字节； 
						 	当boolean声明一个数组类型 的时候，那么每个数组的元素占 1个字节
		 */
		boolean b=false;
		boolean b1=true;
		
		/*
		 * 2整数类型：  
		 * 	   byte       字节数 ：1        范围：  -128  ~  127
			   short      字节数  2         范围：  -2^15 ~ 2^15-1
			   int（常用）  字节数：4        范围： -2^31 ~ 2^31-1
			   long        字节数：8        范围：      -2^63 ~ 2^63-1
			 4中类型都代表整数，只是取值范围不一样
			 
		        字面常量值： 所有整数类型的字面常量值其实都是int类型
		 */
		byte by1=127; // 在给变量赋值时，不能超过对应类型的取值范围
		byte by2=2;
		 // 2和127都是int类型，，所以by1+by2得到的结果也是int类型
//		byte by3=by1+by2;
		System.out.println("int的最大值："+Integer.MAX_VALUE);
		System.out.println("int的最小值："+Integer.MIN_VALUE);
		
		// long类型，在使用时，需要在其后加l
//		long lo=12312367567; //此时的数据还是int类型，12312367567超出了int的范围
		long lo=2342234234233244l;
		
		/*
		 *3、浮点数类型： 
		 *		float     字节数：4    取值范围    -3.403E38~3.403E38
		 *		double    字节数：8    取值范围：-1.798E308~1.798E308
		       两个数据类型都表示浮点数，只是精度的区别
		       浮点数类型的默认字面常量值为 double类型
		 */
		double d=12.4444;
		//定义float时需要加f后缀
		float  f=123.6f;
		/*
		 * 浮点数的精度问题：
		 * 		 0000.1110 ---->0. 1/2^1+1/2^2+1/2^3-->0.875
		 *       0.3---->0000.0101
		 *       
		 * 浮点数不能够描述一个精确的小数，
		 * 所以涉及到需要精确计算的领域时，不能够使用浮点数类型进行计算
		 * 比如说银行
		 */
		double d1=0.3;
		System.out.println("d1*3:"+d1*3);// 0.9
		
		/*
		 * 4、 字符类型
		 * 		char    字节数： 2    
		 * 		范围：    是Unicode字符集中的所有字符，
		 * 				也即0~65535之间的所有编码；
 				字面常量：  'A','你'
 				转义字符：  \  ,在java中允许使用“\”把其后的字符转成别的含义
 						     如：   \n表示换行 
 				String:  一串字符， 本质上来说是由多个字符组成的数组
 						  定义的时候需要加双引号“ ”
		 */ 
		char ch='n';
		char ch01='\'';
		String path="C:\\Users\\asus\\Desktop\\java课件\\免费班新课件";
		char ch02=97; // 可以通过数值的方式初始化 字符
	}

}
