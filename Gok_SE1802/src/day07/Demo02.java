/**
 * <p>Title: Demo02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day07;
/*
 * 完整的类加载和对象创建顺序：
 * 
 * 		先进行类加载，如果当前类有继承父类，
 * 			则先进行 父类的类加载，父类加载完毕以后再进行子类的类加载
 * 		
 * 		接着是对象的创建， 如果有继承父类，先创建父类，再创建子类对象
 */
public class Demo02 extends Father{
	static String str="Demo02.str";
	int age=20;
	public Demo02() {
		System.out.println("子类的无参数构造器被执行。。。。");
	}
	
	static {
		System.out.println("子类静态块被执行");
		System.out.println("子类静态变量str:"+str);
		System.out.println("----------------------------------");
	}
	
	{
		System.out.println("子类对象块被执行");
		System.out.println("Demo02.age:"+age);
	}
	public static void main(String[] args) {
		Demo02 demo=new Demo02();
	}
}
class Father{
	static String str="Father.str";
	int age=47;
	public Father() {
		System.out.println("父类的无参数构造器被执行。。。。");
		System.out.println("----------------------------------");
	}
	
	static {
		System.out.println("父类静态块被执行");
		System.out.println("父类静态变量str:"+str);	
		System.out.println("----------------------------------");
	}
	
	{
		System.out.println("父类对象块被执行");
		System.out.println("Father.age:"+age);
	}
}