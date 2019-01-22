/**
 * <p>Title: Demo04.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day06;
import java.util.Arrays;
import java.util.Scanner;

public class Demo04 {
	static Scanner sc=new Scanner(System.in);
	// 利用BankUser数组模拟数据库存多个用户数据
	static BankUser[] bankUsers=new BankUser[10];
	static BankUser bankUser;
	
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
	 *  			  8、退出
	 */
	public static void main(String[] args) {
		for(int i=0;i<10;i++ ) {
			BankUser bankUser=new BankUser("user"+i,"xxx"+i,1000,18,"1336333177"+i);
			bankUsers[i]=bankUser;
		}
//		for(BankUser bankUser:bankUsers) {
//			System.out.println(bankUser);
//		}
		System.out.println("欢迎来到XXX银行系统：");
		System.out.println("请选择对应的数字，实现操作");
		int num;
		while(true) {
			System.out.println("1、登录，2、 用户信息查询，3、用户信息修改，"
					+ "4、查询余额，5、转账，6、取钱，7、用户注册，8、退出");
			num=sc.nextInt();
			switch(num) {
				case 1:login();break;
				case 2:getUserInfo();break;
				case 3:updateUserInfo();break;
				case 4:System.out.println("您当前的余额为：￥"+getUserMoney());;break;
				case 5:transMoney();break;
				case 6:takeMoney();break;
				case 7:addUser();break;
				case 8:exit();
			}
		}
	}
	// 登录方法
	public static void login() {
		System.out.println("-------------欢迎来到登录界面----------");
		while(true) {
			System.out.println("请输入账号：");
			String userName=sc.next();
			System.out.println("请输入密码：");
			String password=sc.next();
			//遍历数据库
			for(int i=0;i<bankUsers.length;i++){
				if(bankUsers[i].userName.equals(userName)&&bankUsers[i].password.equals(password)) {
					bankUser=bankUsers[i];
					System.out.println("登录成功");
					break;
				}
			}
			if(bankUser!=null) {
				break;
			}else {
				System.out.println("用户名或者密码错误。。");
			}
		}
	}
	
	// 查询用户信息的方法
	public static void getUserInfo() {
		System.out.println("-------------欢迎来到查询信息界面----------");
		if(bankUser==null) {
			System.out.println("对不起您还未登录，请先登录");
			login();
		}
		for(int i=0;i<bankUsers.length;i++) {
			if(bankUser.userName.equals(bankUsers[i].userName)) {
				bankUser=bankUsers[i];
			}
		}
		System.out.println("当用户信息为："+bankUser);
	}
	
	//修改用户基本信息
	public static void updateUserInfo() {
		System.out.println("-------------欢迎来到修改信息界面----------");
		if(bankUser==null) {
			System.out.println("对不起您还未登录，请先登录");
			login();
		}
		System.out.println("请输入年龄：");
		int age=sc.nextInt();
		System.out.println("请输入电话：");
		String phone=sc.next();
		
		bankUser.age=age;
		bankUser.phone=phone;
		
		for(int i=0;i<bankUsers.length;i++) {
			if(bankUser.userName.equals(bankUsers[i].userName)) {
				bankUsers[i]=bankUser;
			}
		}
		System.out.println("修改成功,你的新信息为："+bankUser);
	}
	
	//获取当前用户余额
	public static double getUserMoney() {
		double money=0.0;
		if(bankUser==null) {
			System.out.println("对不起您还未登录，请先登录");
			login();
		}
		for(int i=0;i<bankUsers.length;i++) {
			if(bankUser.userName.equals(bankUsers[i].userName)) {
				money=bankUsers[i].money;
			}
		}
		return money;
	}
	
	//实现用户转帐
	public static void transMoney() {
		System.out.println("-------------欢迎来到转账界面----------");
		if(bankUser==null) {
			System.out.println("对不起您还未登录，请先登录");
			login();
		}
		
		System.out.println("请输入您要转账的账号");
		String transUserName=sc.next();
		double transMoney=0.0;
		while(true) {
			System.out.println("请输入转账金额");
			transMoney=sc.nextDouble();
			if(transMoney>getUserMoney()) {
				System.out.println("余额不足，请重新输入");
			}else {
				break;
			}
		}
		// 通过外层for循环找出被转账的用户的信息
		for(int i=0;i<bankUsers.length;i++) {
			// bankUsers[i] 就是我们要转账的那个人的信息
			if(transUserName.equals(bankUsers[i].userName)) {
				//该for循环是为了是时时获取当前用户的信息
				for(int j=0;j<bankUsers.length;j++) {
					if(bankUser.userName.equals(bankUsers[j].userName)) {
						bankUsers[j].money-=transMoney;//当前用户减钱
						bankUsers[i].money+=transMoney;//被转账用户加钱
						System.out.println("转账成功");
						break;
					}
				}
				break;
			}
		}
	}
	
	//实现用户转帐
	public static void takeMoney() {
		System.out.println("-------------欢迎来到取钱界面----------");
		if(bankUser==null) {
			System.out.println("对不起您还未登录，请先登录");
			login();
		}
		double takeMoney=0.0;
		while(true) {
			System.out.println("请输入取钱金额");
			takeMoney=sc.nextDouble();
			if(takeMoney>getUserMoney()) {
				System.out.println("余额不足，请重新输入");
			}else {
				break;
			}
		}
		for(int j=0;j<bankUsers.length;j++) {
			if(bankUser.userName.equals(bankUsers[j].userName)) {
				bankUsers[j].money-=takeMoney;//当前用户减钱
				System.out.println("取钱成功");
				break;
			}
		}
	}
	
	// 注册新用户
	public static void addUser() {
		// 将当用户数组扩容
		bankUsers=Arrays.copyOf(bankUsers, bankUsers.length+1);
		System.out.println("请输入用户名：");
		String userName;
		
		// 重名检查
		while(true) {
			userName=sc.next();
			boolean flag=false;
			for(int j=0;j<bankUsers.length;j++) {
				if(userName.equals(bankUsers[j].userName)) {
					flag=true;
				}
			}
			if(flag) {
				System.out.println("用户已存在");
			}else {
				break;
			}
		}
		String passwprd1;
		String passwprd2;
		while(true) {
			System.out.println("请输入用密码：");
			passwprd1=sc.next();
			System.out.println("请再次输入密码：");
			passwprd2=sc.next();
			if(!passwprd1.equals(passwprd2)) {
				System.out.println("两次密码不一致，请重新输入");
			}else {
				break;
			}
		}
		System.out.println("请输入用年龄：");
		int age=sc.nextInt();
		System.out.println("请输入用电话号码：");
		String phone=sc.next();
		BankUser banuser=new BankUser(userName,passwprd1,10,age,phone);
		
		// 用户数据存入数据库
		bankUsers[bankUsers.length-1]=banuser;
		System.out.println("注册成功");
		login();
	}
	
	public static void exit() {
		if(bankUser==null) {
			System.out.println("对不起您还未登录，请先登录");
			login();
		}
		bankUser=null;
	}
}
