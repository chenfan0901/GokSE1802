/**
 * <p>Title: Demo05.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;

/*
 * 匿名内部类：  没有名字的内部类，一般当抽象类或者接口中的方法只需要在
 * 				我们的代码中被使用，此时去创建子类是不合适的，我们就可以使用
 * 				匿名内部类的方式来实现此方法
 */
public class Demo05 {
	public static void main(String[] args) {
		TestClass tc=new TestClass() {
			public void method() {
				System.out.println("通过匿名内部类实现method()");
			}
		};
		tc.method();
	}
}

abstract class TestClass{
	public abstract void method();
}
//class Child extends TestClass{
//	@Override
//	public void method() {
//		System.out.println("实现了抽象方法。。。");
//	}
//}