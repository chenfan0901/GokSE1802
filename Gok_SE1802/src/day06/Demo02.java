/**
 * <p>Title: Demo02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day06;

public class Demo02 {
	/*
	 * 构造器（构造器）：
	 *      特殊的方法，  结构：    权限修饰词 +类名(){   }
	 *  	其作用是用来创建对象，并且实现创建对象的时的初始化操作。。
	 *    
	 * 分类： 1、无参数构造器
	 * 			无参构造器可以不写， java编译器在编译时会自动检测整个代码中
	 * 			是否含有构造器，如果没有则默认添加一个无参构造器。
	 * 			如果代码中添加了有参构造器，则不会再默认添加无参构造器
	 * 
	 * 		 2、 有参数构造器
	 */
	public String studentName;
	public int age;
	public String classNo;
	
	public Demo02() {
		System.out.println("我是一个无参构造器。。。。");
	}
	
	public Demo02(String studentName,int age) {
		this.studentName=studentName;
		this.age=age;
	}
	
	public Demo02(String studentName,int age,String classNo) {
		this.studentName=studentName;
		this.age=age;
		this.classNo=classNo;
	}
	
	
	
	public static void main(String[] args) {
		Demo02 demo1=new Demo02();
		
		Demo02 demo=new Demo02("陈凡",17,"1802");
		
		System.out.println("姓名："+demo.studentName);
		System.out.println("年龄："+demo.age);
		System.out.println("班号："+demo.classNo);
		
	}
	
}
