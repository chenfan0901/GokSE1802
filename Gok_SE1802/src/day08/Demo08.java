/**
 * <p>Title: Demo08.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day08;
public class Demo08 extends Super{
//	public final void test() {
//		System.out.println("Super.test() ");
//	}
	
	public static void main(String[] args) {
		/*
		 * final关键： 
		 *      1、final可以修饰变量，表示将变量定义为常量'
		 *      2、final还可以用来修饰方法，该方法为最终方法，
		 *         那么该方法不可被重写
		 *      3、final还可以修饰类，表示该类为最终类，
		 *      	那么此类不可别继承     
		 */
		final int a=10;
	}
}

class Super{
	public final void test() {
		System.out.println("Super.test() ");
	}
}
final class Super1{
	public final void test() {
		System.out.println("Super.test() ");
	}
}