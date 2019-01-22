/**
 * <p>Title: Demo04.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;
public class Demo04 {
	/*
	 * 内部类 ： 定义在一个类中的类，内部这个类叫内部类，
	 * 			外面的类叫外部类		
	 * 			可以将把内部类看成   类的变量
	 * 
	 * 			所以的内部类分为：  1、全局内部类
	 * 								1.1  实例内部类
	 * 								1.2  静态内部类
	 * 							  2、局部内部类
	 */
	String str="外部内的实例变量";
	static String staticStr="外部内的静态变量";
	public void outMethod() {
		System.out.println("外部类的实例方法");
	}
	public static void outStaticMethod() {
		System.out.println("外部类的静态方法");
	}
	
	/*
	 *内部类可以直接访问外部类的全局变量和方法，
	 *		实例内部类能访问实例变量，静态变量和实例方法，静态方法
	 *		静态内部类只能访问静态方法和静态变量
	 */
	class Inner{
		String innStr=str;
		String innstaStr=staticStr;
		public void test() {
			System.out.println("直接访问到的变量值为："+innstaStr);
			outMethod();
			outStaticMethod();
		}
	}
	
	static class InnerStatic{
		public void test() {
//			System.out.println(str);
			System.out.println(staticStr);
//			outMethod();
			outStaticMethod();
		}
	}
	
	public void test() {
		int i=10;
		/*
		 *  局部内部类可以直接访问当前代码段中的局部变量,
		 *  但是注意仅仅只是访问，不可以修改
		 */
		class Demo{
			public void demoMethod() {
				System.out.println("我是局部内部类的demoMethod()");
				System.out.println(i);
			}
		}
		Demo demo=new Demo();
		demo.demoMethod();
	}
	
	public static void main(String[] args) {
		Demo04 demo04=new Demo04();
		demo04.test();
		
		// 对全局内部类的使用
		// 1、静态内部类：
		InnerStatic is=new InnerStatic();
		is.test();
		
		
		//2、访问实例内部类：
		Demo04 de=new Demo04();
		Inner in=de.new Inner();
		in.test();
	}
	
}
