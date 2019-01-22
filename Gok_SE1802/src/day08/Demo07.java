/**
 * <p>Title: Demo07.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day08;

public class Demo07 extends Father{
	int age=10;
	/*
	 * super: 代表父类对象，和this一样，
	 * 		    不能直接出现在static方法中。
	 * 		1、可以用来直接调用父类的被隐藏的属性和 被覆盖的方法
	 * 		2、super关键字定义子类构造器的第一行，表示在创建子类对象
	 * 			先创建父类对象，可以省略，编译器会自动添加
	 */
	public Demo07() {
		super();
//		super("ccsf"); // 必须在子类构造器的第一行，优先保证父类成员变量的初始化
	}
	
	public void test() {
		System.out.println("age:"+age);
		System.out.println(super.age);
		faMethod();
		super.faMethod();
	}
	
	public void faMethod() {
		System.out.println("子类重写父类的faMethod()");
	}
	public static void main(String[] args) {
		Demo07 demo=new Demo07();
		demo.test();
	}
}
class Father{
	String name;
	int age=30;
	public Father() {
		super();
	}
	public Father(String name) {
		this.name=name;
	}
	public void faMethod() {
		System.out.println("父类的方法");
	}
}