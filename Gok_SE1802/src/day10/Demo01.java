/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;
public class Demo01 {
	public static void printAreaMethod(Graph gra) {
		System.out.println(gra.getArea());
	}
	
	public static void main(String[] args) {
		Graph gr=new Cricle(3.2);
		printAreaMethod(gr);
	}
}
/*
 * 抽象类： 一种特殊的类，一般只是提供父类的形式，不能被直接实例化，
 * 			只能够被子类继承，子类 继承父类以后，
 * 			那么必须实现父类中的所有抽象方法。
 * 
 *       注：当一个类中有方法是abstract关键字修饰时，那么当前必须是abstract的，
 *       	 当一个类是抽象类的时候，那么该类中可以没有抽象方法。
 * 
 *抽象类的特点：
 *		1、不可以被实例化
 *		2、只能被继承，且继承后必须实现对应的抽象方法，如果不想实现，
 *		      则当前子类也必须为抽象类
 *		3、在抽象类可以有普通的实例变量 和 普通方法
 *		4、抽象类不可以是final的
 */
abstract class Graph{
	/*
	 * 探讨两个问题：
	 * 		1、对于某些父类来说，其方法的方法体是否有其具体的意义
	 * 		      比如图形类的求面积的方法的方法体，只有具体到某个图形时才有意义
	 * 		2、当别人来继承当前类时，
	 * 		      如何向外界传达你继承我这个父类时，需要实现我指定的方法。
	 */
//	public abstract double getArea() {
//		return 0.0;
//	} 
	public abstract double getArea() ;
}

//圆
class Cricle extends Graph{
	double r;
	public Cricle(double r) {
		this.r=r;
	}
	
	@Override
	public double getArea() {
		return 3.14*r*r;
	}
	
}

//长方形
class Retanle extends Graph{
	int a;
	int b;
	public Retanle(int a,int b){
		this.a=a;
		this.b=b;
	} 
	public double getArea() {
		return a*b;
	}
}

