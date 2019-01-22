/**
 * <p>Title: Demo06.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day03;

import java.util.Scanner;

public class Demo06 {
	/* 
	 * return ：  用在方法的末尾，表示结束当前方法,
	 * 			1、 当当前方法是被非void 关键字所修饰时， 此方法必须要通过
	 * 			   return关键字返回对应类型的数据，否则编译报错
	 * 
	 * 			2、 当当前方法是被void关键字修饰时，则可不加return
	 */
	
	//定义 getRush()计算 找零业务
	/*
	 * public      static      void          getRush( 方法参数) {方法体 }
	 * 权限修饰词     方法类型    是否需要有返回值      方法名 
	 */
//	public static void  
//				getRush(double totalMoney,int num,double price) {
//		double rush=totalMoney-num*price;
//		System.out.println("应找零："+rush);
//	}
	
	public static double  getRush(double totalMoney,int num,double price) {
		double rush=totalMoney-num*price;
		return rush;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// sc.nextDouble() 表示从控制台获取一个double类型的数据
		System.out.println("请输入商品价格：");
		double price=sc.nextDouble();
		System.out.println("请输入商品数量：");
		// sc.nextInt()获取一个int类型的数据
		int num=sc.nextInt();
		System.out.println("请输入所给金额：");
		double totalMoney=sc.nextDouble();
		double rush=getRush(totalMoney, num, price);
		System.out.println("rush:"+rush);
		
		
	}

}
