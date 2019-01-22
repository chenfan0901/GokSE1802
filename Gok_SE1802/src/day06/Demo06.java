/**
 * <p>Title: Demo06.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day06;

public class Demo06 {
	String userName;
	/**
	 * this关键字：   用来表示当前对象，  不能使用在静态方法中
	 * 
	 * 		1、可以用来调用本类中的全局变量，常用来区别形参和 实例变量
	 * 		2、调用本类中的方法
	 * 		3、特殊用法，在构造器中调用其他构造器，但是必须放在第一行
	 */
	public Demo06() {
		this("李四"); //在当前构造器中调用其他构造
		
		System.out.println("无参构造器");
	
	}
	public Demo06(String userName) {
		this.userName=userName;
		System.out.println("调用有参构造器");
	}
	
	public void setUserName(String userName) {
		System.out.println("this:"+this);
		this.userName=userName;
	}
	
	public void test() {
		this.setUserName("张三");
	}
	
	
	public static void main(String[] args) {
		Demo06 demo=new Demo06();
//		System.out.println("demo:"+demo);
//		demo.setUserName("cf");
//		System.out.println("demo.userName:"+demo.userName);
//		demo.test();
		System.out.println("demo.userName:"+demo.userName);
	}
}
