/**
 * <p>Title: Demo04.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day07;
public class Demo04 {
	public static void main(String[] args) {
		B b=new B();/*
		 			*  B的静态块：1  
		 			*  B的对象块：3 2
		 			*  B的构造器：4 3
		 			*/
		/*
		 * A的静态块：1
		 * A的静态块：2
		 * B的对象块：5 2
		 * B的构造器：6 3
		 * A的对象块: 3 2
		 * A的构造器：4 3 
		 */
		A a= new A(); 
		//A.bDisplay() 5 3
		a.aDisplay();
	}
}
class B{
	static int i=1;
	int j=1;
	static {
		System.out.println("B的静态块："+i++); //B的静态块：1 
		System.out.println("----------------------------------");
	}
	public B(){
		i++;
		j++;
		System.out.println("B的构造器："+i+","+j);
		System.out.println("-----------------------------------");
	}
	{
		i++;
		j++;
		System.out.println("B的对象块："+i+","+j);
	}
}
class A extends B{
	static int i=1;
	static {
		System.out.println("A的静态块："+i); //1 
	}
	int j=1;
	static {
		i++;
		System.out.println("A的静态块："+i); //2
		System.out.println("--------------------------------");
	}
	public A(){
		i++;
		j++;
		System.out.println("A的构造器："+i+","+j); //4 3 
	}
	{
		i++;
		j++;
		System.out.println("A的对象块:"+i+","+j); //3 2
	}
	public void aDisplay() {
		i++;
		System.out.println("A.bDisplay() "+i+","+j);
	}
	public static void aStaticTest() {
		i++;
		System.out.println("B.staticTest() "+i);
	}
}