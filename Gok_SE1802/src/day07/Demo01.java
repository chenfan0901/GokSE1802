/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day07;

public class Demo01 {
	/*
	 * 类加载与对象创建：
	 *   1、类加载
	 * 		类加载是优先于 对象创建执行的，发生在类第一次被虚拟机调用,
	 * 		类会被虚拟机加载,一般来说 类只被加载一次
			
			过程： 静态变量初始化， 函数入口分配， 静态代码块执行		
	 * 
	 * 	2、对象的创建：  晚于类的加载
	 * 		过程：  	1、初始化实例变量；
	 *				2、分配实例方法的函数入口；
	 *				3、执行对象块；
	 *				4、执行构造函数(super();剩余语句才是第四部分执行)
	 * 		
	 */
	static String str;
	int age;
	public Demo01() {
		System.out.println("无参数构造器被执行。。。。");
	}
	/*
	 * static{ } 为静态代码块，只随着类加载被执行一次，可以在程序有多个，
	 *  		一般用于在类加载时，只需要执行一次的操作，
	 *  		比如 加载资源的操作，如 文本文件，图片，视频，音频文件的加载 
	 */
	static {
//		age=19; 不能访问实例变量
		System.out.println("str:"+str);
		str="str";
		System.out.println("str:"+str);		
//		test();
		staticTest();
		System.out.println("-----------------------------");
	}
	
	//{} 对象块，随着每次创建对象时被调用，也是创建对象时只执行一次
	{
		System.out.println("age:"+age);
		age=19;
		System.out.println("age:"+age);
		System.out.println("str:"+str);
		str="在实例变量中赋值";
		System.out.println("str:"+str);
		test();
		staticTest();
	}
	
	public void test() {
		System.out.println("实例方法test()");
	}
	public static void staticTest() {
		System.out.println("静态方法staticTest()");
	}
	public static void main(String[] args) {
		Demo01 demo=new Demo01();
		demo.age=20;
	}
}
