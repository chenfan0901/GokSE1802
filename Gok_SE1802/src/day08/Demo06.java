/**
 * <p>Title: Demo06.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day08;

public class Demo06 {
	public static void main(String[] args) {
		/*
		 * 当直接创建子类对象时，此时父类中的this都是子类对象 
		 */
		Sub sub = new Sub();
		sub.printMessage();
		System.out.println("x:" + sub.x);
	}
}
class Base {
	int x = 10;
	public Base() {
		this.printMessage();
		System.out.println("父类构造器被调用x:" + x);
		x = 20;
	}
	public void printMessage() {
		System.out.println("Base.printMessage() x:" + x);
	}
}
class Sub extends Base {
	int x = 30;
	public Sub() {
		this.printMessage();
		System.out.println("子类构造器被调用,x:" + x);
		x = 40;
	}
	public void printMessage() {
		System.out.println("Sub.printMessage(), x: " + x);
	}
}
