/**
 * <p>Title: HomeWork02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day08;
public class HomeWork02 {
	public static void main(String[] args) {
//		Point point1=new Point(1, 1);
//		Point point2=new Point(1, 3);
//		point1.getDistance(point2);
		
		Circle cir=new Circle(3);
		cir.area();
	}
}

class Point{
	int x;
	int y;
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void movePoint(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void getDistance(Point point) {
		System.out.println("距离为："+Math.sqrt(Math.pow(this.x-point.x, 2)+Math.pow(this.y-point.y, 2)));
	}
}
class Circle{
	double r;
	//求面积
	Circle(double r){
		this.r=r;
	}
	public void area() {
		System.out.println("面积为："+3.14*r*r);
	}
}