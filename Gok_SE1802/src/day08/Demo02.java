/**
 * <p>Title: Demo02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day08;

public class Demo02 {
	/*
	 *  访问控制权限修饰符： 通过对类中的  属性和 方法添加权限修饰词，以控制外部对象对他们的访问，				  			
	 *  		private    ：  私有权限， 被该权限修饰的方法和变量，只能在当类中被使用
	 *  		不写（默认）:  默认权限， 该权限修饰的方法和变量，能够在 当前类 和 同包类中被访问
	 *  		protected  :  受保护权限，  可以在当前类，同包类，继承类中可以使用
	 *  		public     :  公有的，可以在当前类，同包类，继承类，不同包被访问
	 */
	private int age;
	String userName;
	protected int money;
	public String classNo;
	public static void main(String[] args) {
		Demo02 demo02=new Demo02();
		demo02.age=12;
		demo02.userName="cc";
		demo02.classNo="1802";
	}

}
