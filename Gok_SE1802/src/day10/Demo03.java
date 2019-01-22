/**
 * <p>Title: Demo03.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;

public class Demo03 {
	public static void model1(C a) {
		System.out.println("模块1");
		a.method();
	}
	public static void model2(C c) {
		System.out.println("模块2");
		c.method();
	}
	
	public static void main(String[] args) {
		C c=new B();
		model1(c);
		model2(c); 
	}
}

interface C{
	public void method();
}

class A implements C{
	public void method() {
		System.out.println("业务核心方法。。。");
	}
}

class B implements C{
	public void method() {
		System.out.println("新的业务核心方法。。。");
	}
}


