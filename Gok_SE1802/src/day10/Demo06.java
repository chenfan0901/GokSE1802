/**
 * <p>Title: Demo06.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;

import java.util.Arrays;
import java.util.Scanner;

	/*
	 * 模拟一个银行相关的程序：
	 * 		用数组作数据库，存放用户相关的数据，可以事先存入几条用户数据。
	 * 		用户信息有： 用户名，用户密码，用户金额，用户年龄，用户电话号码，
	 * 
	 *  	完成功能：  用户输入指定数字，实现对应的操作
	 *  			  1、登录，用户所有的操作都在登录情况下完成，注册不用
	 *  			  2、用户信息查询
	 *  			  3、用户信息修改
	 *  			  4、查询余额
	 *  			  5、实现转账，转账成功后提示，并显示余额
	 *  			  6、实现取钱，取钱成功后提示，并打印余额
	 *  			  7、用户注册，注册完成后跳转到用户登录
	 *  			  8、退出账号
	 */
public class Demo06 {
	static Scanner sc=new Scanner(System.in);
	
	//此静态数组用来模拟 存放 用户信息的数据库
	static BankUser[] users=new BankUser[10];
	
	//初始化数据库用户数据
	static {
		for (int i = 0; i < users.length; i++) {
			users[i]=new BankUser("user"+i,"123456"+i,1000,20,"1332817660"+i);
		}
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("欢迎来到xx银行界面，请输入数字，进行对应的功能操作：");
			System.out.println("1、登录     2、注册 ");
			int selectNum=sc.nextInt();
			switch (selectNum) {
				case 1:login();break;
				case 2:break;
			}
		}
	}
	
	//用户登录的方法
	public static void login() {
		System.out.println("欢迎来到登录界面");
		System.out.println("请输入用户名：");
		String userName=sc.next();
		System.out.println("请输入用密码：");
		String password=sc.next();
		//去数据库中查找对应用户信息，进行用户名和密码 的验证
		for (int i = 0; i < users.length; i++) {
			if(users[i].userName.equals(userName) && users[i].password.equals(password)) {
				//跳转到主界面
				mainPage();
			}
		}
	}
	
	public static void mainPage() {
		System.out.println("欢迎来到xx银行主页面");
		boolean isLogout=false;
		while(true) {
			System.out.println("1、信息查询   2、信息修改   3、余额查询  4、转账  5、取现  6、退出登录");
			int selectNum=sc.nextInt();
			switch (selectNum) {
				case 1:break;
				case 2:break;
				case 3:break;
				case 4:break;
				case 5:break;
				case 6:isLogout=true;break;
			}
			if(isLogout) {
				break;
			}
		}
	}
}
