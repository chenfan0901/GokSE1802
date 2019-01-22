/**
 * <p>Title: Demo06.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day07;

public class Demo06 {
	/*
	 * 参数传递的两种方式：  
	 * 		1、值传递： 
	 * 			方法调用时， 实际参数值 会将它的值 拷贝一个副本
	 * 			传递给形式参数，在方法中任何对形参的操作都不会影响
	 * 			原本的实际参数
	 * 
	 * 		2、引用传递 ： 也称址传递， 方法调用时，
	 * 					   实际参数的引用（指的是实参的地址）传递给方法中的
	 * 					  形式参数，在方法执行时，对形参的实际操作，就是对实参
	 * 					  对应的操作。
	 */
	
	//值传递
	public void  test(int a) {
		a=10;
		System.out.println("test(int a) a:"+a);// 10
	}
	// 测试引用传递
	public void  test1(G g) {
		g.age=10;
		System.out.println(" test1(G g) g.age:"+g.age);//10
	}
	public static void main(String[] args) {
		// 测试值传递
		Demo06 demo=new  Demo06();
//		int a=19;
//		demo.test(a);
//		System.out.println("main a:"+a); // 19
		//测试引用传递
		G g=new G();
		g.age=27;
		demo.test1(g);
		System.out.println("main g.age:"+g.age);// 10
	}
}
class G{
	int age=34;
}