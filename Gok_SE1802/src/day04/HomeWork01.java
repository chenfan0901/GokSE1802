/**
 * <p>Title: Demo10.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day04;

import java.util.Random;
import java.util.Scanner;

public class HomeWork01 {
	static Scanner sc=new Scanner(System.in);
	
	/**
	 *  1、 程序随机生成10道 100以内的加法题， 
	 *    用户从控制台输入每道题的值， 程序提示答错或者答对，
	 *	    并且统计答对的题数，算分值（每道题10分），还要统计答题的所用时间  
	 */
	public  static void test01() {
		Random ra=new Random();
		// 定义a和b来存放程序产生的数字
		int a=0;
		int b=0;
		// 定义c来存放用户输入的数字
		int c=0;
		//定义一个计数器来统计答对题的次数
		int count=0;
		System.out.println("答题开始");
		long startTime=System.currentTimeMillis();	
		
		for(int i=1;i<=10;i++) {
			a=ra.nextInt(100)+1;
			b=ra.nextInt(100)+1;
			System.out.println(a+"+"+b+"=");
			c=sc.nextInt();
			if(c==(a+b)) {
				System.out.println("答对");
				count++;
			}else {
				System.out.println("答错");
			}
		}
		long endTime=System.currentTimeMillis();
		long useTime=(endTime-startTime)/1000;
		System.out.println("答题结束，共答对"+count+"道题,用时"+useTime+"秒");	
	}
	
	
	/**
 	 *	2、 打印出 100~ 999之间的水仙花数
	 *    水仙花数指的是 一个3位数， 其每个位数数值  的立方和 等于这个数本身
	 */
	public  static void test02() {
		int a,b,c; //定义abc来存放个十百位数字
		for(int i=100;i<=999;i++) {
			a=i%10;// 各位
			b=i/10%10;// 十位
			c=i/100;
			//Math是java官方提供的数学函数工具类，Math.pow(a, 3)求a的3次方
			if((Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3))==i) {
				System.out.println(i+"是水仙花数");
			}
		}
	}
	
	// 3、计算出 9+99+999+。。。。+999999999 的和
	public  static void test03() {
		// 定义一个基数
		int a=9;
		int sum=0;// 存放累加值
		for(int i=0;i<9;i++) {
			sum=sum+a;
			a=a*10+a;
		}
		System.out.println(sum);
	}
	/*
	 * 4、有一个分数序列 ：2/1， 3/2, 5/3, 8/5 ..... ,求出其前20项的和
	 */
	public  static void test04() {
		double a=2;// 分子
		double b=1;// 分母
		double temp=0;// 定义一个中间变量 来存放b的值
		double sum=0;
		for(int i=0;i<20;i++) {
			sum+=a/b;
			temp=b; // 将分母的值取出
			b=a; // 后一个数的分母等于前一个数的分子
			a=temp+a; //后一个数的子等于前一个数 的分子 + 分母
		}
		System.out.println(sum);
	}
	
	//5、利用 嵌套for实现  打印等腰三角形
	public  static void test05() {
		System.out.println("请输入打印的行数：");
		int n=sc.nextInt();
		//外层循环控制行数
		for(int i=1;i<=n;i++) {
			//控制打印空格
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			//控制打印* ,每行的* 个数为 :  行数i*2-1
			for(int j=0;j<i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println("");//换行
		}
	}
	
	//4的倍数，但不是100倍数，或者400的倍数
	public  static void test06() {
		System.out.println("请输入一个年份");
		int year=sc.nextInt();
		if(year%4==0) {
			if(year%100!=0) {
				System.out.println("是闰年");
			}else {
				if(year%400==0) {
					System.out.println("是闰年");
				}else {
					System.out.println("不是闰年");
				}
			}
		}else {
			System.out.println("不是闰年");
		}	
	}
	public  static void test07() {
		//倒三角
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		// 正三角
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i+1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
	
	public static void main(String[] args) {
//		test01();
//		test02();
//		test03();
//		test04();
//		test05();
		test07();
	}

}
