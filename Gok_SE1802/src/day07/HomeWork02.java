/**
 * <p>Title: HomeWork02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day07;

public class HomeWork02 {
	public static void main(String[] args) {
		Circle cir=new Circle(5);
		System.out.println("面积："+cir.area());
		System.out.println("周长："+cir.girth());

		cir.setR(10);
		System.out.println("面积："+cir.area());
		System.out.println("周长："+cir.girth());
		
	}
}
class Circle {
	private double r;
	public Circle(double r) {
		this.r=r;
	}
	
	public void setR(double r) {
		this.r=r;
	}
	public double getR() {
		return r;
	}
	
	public  double area() {
		return r*r*3.14;
	}
	public double girth() {
		return 2*r*3.14;
	}
}