/**
 * <p>Title: Demo05.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day08;

import java.io.IOException;
import java.sql.SQLException;

public class Demo05 {
	/*
	 * 继承： 作用是为了实现代码的复用,
	 *        通过extends关键字来实现，
	 *        被继承的类我们称为 父类（超类），
	 *        继承而得到的类叫做子类
	 *     
	 *     子类继承父类以后，子类可以定义新的属性和方法，
	 *     同时，子类也可以在本类定义和父类相同的属性（属性的隐藏），
	 *     		还可以定义和父类相同的方法（方法的重写/覆盖） 
	 *     
	 *     属性隐藏： 子类定义和父类相同的全局变量，子类调用该变量时，
	 *     			使用的是自己的变量
	 *     
	 *     方法重写： 在子类中定义一个和父类一模一样的方法
	 *     			 即返回值类型，方法名，参数列表都必须相同，
	 *     			 权限和抛出异常可同可不同
	 *     
	 *     重写原则： 1、 不能比父类的方法权限更小
	 *     			 2、 子类重写父类的方法，其所抛出的异常不能比父类更多，
	 *     				也不能抛出父类
	 *     
	 *     注：  在java中只支持单继承，单是可以多重继承
	 */
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.age=10;
		dog.eat();
		System.out.println(dog.color);
		
		Cat cat=new Cat();
		cat.eat();
	}
}
class Animal{
	public int age;
	public String color="red"; //狗的颜色
	public String type;  // 狗的品种
	
	protected void eat() {
		System.out.println("吃东西");
	}
	public void run() throws IOException,SQLException {
		System.out.println("跑");
	}
}
class Dog extends Animal{
	public String name; // 子类继承父类以后可以定义属于自己的新成员属性
	
	//子类继承父类可以，可以定义和父类同名变量
	public String color="white";
	
	public void eat() {
		System.out.println("dog啃骨头。。。");
	}
	
	public void run() throws IOException{
		System.out.println("跑");
	}
	//子类继承父类不能抛出更多的异常
//	public void run() throws IOException,SQLException,Exception {
//		System.out.println("跑");
//	}
}

class Cat extends Animal{
	
}
class Pig extends Animal{
	
}

