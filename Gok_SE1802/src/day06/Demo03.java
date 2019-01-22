/**
 * <p>Title: Demo03.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day06;

public class Demo03 {
	/*
	 * 方法的重载：
	 * 		指在同一个类中，可以有多个同名的不同方法，
	 * 		这些方法之间 名字相同， 权限，类型，返回值类型可同可不同
	 * 		但是参数列表一定不同。
	 * 
	 * 	        程序运行时根据所传参数的类型 来调用相应的方法
	 */
	public void test(int a ) {
		System.out.println("test(int a )");
	}
	void test(double b ) {
		System.out.println("test(double b )");
	}
	public void test(double b,int a ) {
		System.out.println("test(double b,int a )");
	}
	public void test(int a,double b ) {
		System.out.println("test(int a,double b ) ");
	}
	public static void main(String[] args) {
		Demo03 demo=new Demo03();
		demo.test(19);
	}
}
