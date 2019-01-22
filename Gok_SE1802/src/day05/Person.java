/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day05;
/*
 * 类：   将具有相同属性（变量） 和 行为（方法） 的对象（个体）的抽象就是类
 * 对象： 即类的具体体现
 * 
 * 类的组成：  变量（属性） + 方法 （行为）
 * 
 *    变量的分类： 
 *           1、 局部变量 ： 定义在局部代码段中的变量，只是在对应的作用域中生效
 *                        比如：  方法中， if语句中， for循环中。。。。。
 *           2、全局变量 :  指的是定义在类体中的变量
 *           			   作用返回可以在当前类中任何位置，或者在该类之外         
 *           	全局变量分两种：
 *           		2.1  实例变量 (成员变量)：  不加static的变量
 *           			被该类中的每个对象所私有的变量
 *           			调用：   对象名.变量名
 *             
 *           		2.2  静态变量（类变量） ：  加static的变量
 *           			被当前类中的所有对象所共有的变量    
 *           			调用：  类名.变量名
 */
public class Person {
	String userName;
	double money;
	
	static String classNo="1802";
	public static void main(String[] args) {
		Person person01=new Person();
		person01.userName="陳凡";
		person01.money=1000;
		
//		person01.classNo="1805"; // 不建议使用对象名去直接调用静态变量
		// 通过类名.属性名调用静态变量
		Person.classNo="1805";
		
		Person person02=new Person();
		person02.userName="張三";
		person02.money=100;
		
		person01.money=person01.money-999;
		System.out.println("陳凡的余额："+person01.money);
		System.out.println("張三的余额："+person02.money);
		
		System.out.println("陳凡的班级号："+person02.classNo);
		System.out.println("張三的班级号："+person02.classNo);
		
	}
	
	
	public void test() {
		if(true) {
			int i=10;
		}
		if(true) {
			int j=2;
//			j=j+i;
		}
	}
}
