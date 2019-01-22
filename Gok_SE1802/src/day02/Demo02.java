/**
 * <p>Title: Demo02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day02;
// import关键字表示在当前程序引入他人写好的工具类
import java.util.Scanner;
public class Demo02 {
	public static void main(String[] args) {
		/*
		 *  1、算术运算符：
		 *   
		 *  二元运算符：
		 *      +、-、*、/、%（取模/求余） 用于数学计算 
		 *    模拟一个商店收银小程序：
		 *        用户从控制台输入对应的商品数据，
		 *        程序计算找零多少钱，显示在控制台上
		 */
		/*
		 *  创建一个Scanner对象，
		 *  便于调用其Scanner提供的方法来从控制台获取数据
		 */
		Scanner sc=new Scanner(System.in);
		// sc.nextDouble() 表示从控制台获取一个double类型的数据
		System.out.println("请输入商品价格：");
		double price=sc.nextDouble();
		System.out.println("请输入商品数量：");
		// sc.nextInt()获取一个int类型的数据
		int num=sc.nextInt();
		System.out.println("请输入所给金额：");
		double totalMoney=sc.nextDouble();
		double rush=totalMoney-num*price;
		System.out.println("应找零："+rush);
	}
	
}
