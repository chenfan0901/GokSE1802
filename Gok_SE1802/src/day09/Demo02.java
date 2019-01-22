/**
 * <p>Title: Demo02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day09;

public class Demo02 {
	public static void main(String[] args) {
		Super sup=new Sub();
		Goo goo=new Goo();
		goo.gooTest(sup);
	}
}
class Super{
	public void test() {
		System.out.println("Super.test() ");
	}
}
class Sub extends Super{
	public void test() {
		System.out.println("Sub.test() ");
	}
}
class Goo{
	public void gooTest(Super sup) {
		System.out.println("gooTest(Super sup)");
		sup.test();
	}
	public void gooTest(Sub sub) {
		System.out.println("gooTest(Sub sub)");
		sub.test();
	}
}
