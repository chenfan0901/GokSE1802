/**
 * <p>Title: Demo09.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day02;

import java.util.Scanner;

public class Demo09 {
	
	/*
	 * 1、用户从控制台输入3个数，程序找出最大的数
	 */
	public static void  test01() {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int a=sc.nextInt();
		System.out.println("请输入第二个数：");
		int b=sc.nextInt();
		System.out.println("请输入第三个数：");
		int c=sc.nextInt();
//		int temp; // 用来存放a和b之间的最大值
//		if(a>b) {
//			temp=a;
//		}else {
//			temp=b;
//		}
//		if(temp>c) {
//			System.out.println("最大值："+temp);
//		}else {
//			System.out.println("最大值："+c);
//		}
		
		
		/*
		 * 三目运算符： 
		 *     语法： 逻辑表达式 ? 式子1 ： 式子2 
		 *           当逻辑表达式为true时，执行式1 ，为false执行式2
		 */
		int temp=a>b?a:b;
		int max=temp>c?temp:c;
		System.out.println("最大值："+max);
	}
	
	/*
	 * 2、用从控制台输入任意一个 大或小写字母， 
	 *  通过程序自动将其转成自身对应 小写 或 大写 的后 的第 4个字母
	 *  比如： A  输出  e
	 */
	public static void  test02() {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个字母：");
		String str=sc.next(); 
		char ch=str.charAt(0); 
		if(ch>=65 & ch<=90) {
			ch=(char)(ch+36);
			System.out.println(ch);
		}else {
			ch=(char)(ch-28);
			System.out.println(ch);
		}
	}

	/*
	 * 3、用户从控制台任意输入3个数字，程序判断是否能组成三角形
	 */
	public static void  test03() {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int a=sc.nextInt();
		System.out.println("请输入第二个数：");
		int b=sc.nextInt();
		System.out.println("请输入第三个数：");
		int c=sc.nextInt();
		if(a+b>c&& a+c>b && b+c>a) {
			System.out.println("能组成三角形");
		}else {
			System.out.println("不能组成三角形");
		}
	}

	/*  
	 * 4、用户从控制台输入 0~99999之间的数字，系统判断该数字有几位
	 */
	public static void test04() {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num=sc.nextInt();
		if(num>0 && num<=9) {
			System.out.println("1位");
		}else if(num>=10 && num<=99) {
			System.out.println("2位");
		}else if(num>=100 && num<=999) {
			System.out.println("3位");
		}else if(num>=1000 && num<=9999) {
			System.out.println("4位");
		}else if(num>=10000 && num<=99999) {
			System.out.println("5位");
		}
	}
	
	public static void main(String[] args) {
		test01();
		test02();
		test03();
		test04();
	}
	
	
	
}
