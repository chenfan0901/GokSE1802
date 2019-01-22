/**
 * <p>Title: Demo07.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day07;

//在java中只有值传递， 就算是传地址，也是传的地址的拷贝
public class Demo07 {
	public static void test(Teacher teacher1,Teacher teacher2) {
		//定义一个中间变量
		Teacher temp;
		temp=teacher1;
		teacher1=teacher2;
		teacher2=temp;
	}
	public static void main(String[] args) {
		Teacher teacher1=new Teacher(8000);
		Teacher teacher2=new Teacher(4000);
		System.out.println("teacher1.salary:"+teacher1.salary);// 8000
		System.out.println("teacher2.salary:"+teacher2.salary);// 4000
		test(teacher1, teacher2);
		System.out.println("teacher1.salary:"+teacher1.salary);// 
		System.out.println("teacher2.salary:"+teacher2.salary);
	}
}
class Teacher{
	double salary;
	public Teacher(double salary) {
		super();
		this.salary = salary;
	}
}