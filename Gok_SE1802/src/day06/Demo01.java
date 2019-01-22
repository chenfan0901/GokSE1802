/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day06;

public class Demo01 {
	/*
	 * 方法分类： 
	 * 		1、实例方法 ：  不加static关键字
	 * 			      调用： 	通过对象名.方法名			
	 * 		2、静态方法：   加static关键字
	 * 				调用：   类名.方法名
	 * 		3、构造器（构造方法）	
	 */
	
	public String studentName="李XX";
	public static String classNo="1802";
	/*
	 * 方法之间可以直接相互调用，
	 * 		但是：  1、静态方法只能直接调用本类中静态方法
	 * 			   2、实例方法可以直接调用本类中 静态方法和  实例方法
	 * 
	 * 在方法中也可以直接去访问全局变量
	 * 		但是： 1、静态方法只能直接访问静态变量
	 * 			  2、 实例方法可以直接访问 静态变量 和 全局变量
	 */
	public static void testSataic01() {
		System.out.println("testSataic01()");
//		studentName="sdfsd"; 静态方法不可以直接访问实例变量
		classNo="1803";
		
	}
	public static void testSataic02() {
		System.out.println("testSataic02()");
	}
	
	public  void test01() {
		System.out.println("实例方法test01()");
		test02();
		testSataic01();
	}
	
	public  void test02() {
		classNo="1804";
		studentName="王XX";
		System.out.println("实例方法test02()");
	}
	
	public static void main(String[] args) {
//		Demo01 demo=new Demo01();
//		demo.test02();
//		Demo01.testSataic01();
		
		//测试方法之间的相互调用
//		testSataic01();
//		test01(); //main是静态方法，不能直接调用test01()实例方法
		
		
		// 测试方法直接访问本类中的变量
		System.out.println("classNo:"+classNo);
		testSataic01();
		System.out.println("classNo:"+classNo);
		System.out.println("---------------------------------");
		
		Demo01 demo1=new Demo01();
		System.out.println("classNo:"+classNo);
		System.out.println("demo1.studentName:"+demo1.studentName);
		demo1.test02();
		System.out.println("classNo:"+classNo);
		System.out.println("demo1.studentName:"+demo1.studentName);
	
		Demo01 demo2=new Demo01();
		System.out.println("demo2.studentName:"+demo2.studentName);
	}
	
}
