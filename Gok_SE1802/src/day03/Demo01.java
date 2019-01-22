/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day03;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		/*
		 * switch(表达式){
		 * 		case 值1： 执行语句1; break;
		 * 		case 值2： 执行语句2; break;
		 * 		case 值3： 执行语句3; break;
		 * 		case 值4： 执行语句4; break;
		 * 		default: 最终执行语句
		 * }
		 * 表达式 得到一个整数值，和 下面的case  的值匹配；
		 * 如果匹配想等则执行当前语句
		 * 
		 * 1、在jdk1.8版本以后， 
		 * 		switch()中的值可以为String字符串数值
		 *  
		 * 2、使用时，需要注意case渗透问题，当 当前case语句没有break时
		 *    程序将当前case执行完毕以后，会继续向下执行，直到遇到break为止
		 */
		//从控制台输入成绩，打等级， ABCDE
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入成绩：");
		int score=sc.nextInt();
		switch(score/10) {
			case 10:
			case 9: System.out.println("A");break;
			case 8: System.out.println("B");break;
			case 7: System.out.println("C");break;
			case 6: System.out.println("D");break;
			default: System.out.println("E");
		}
		
		// 从控制台输入月份，打印当前月的季度
		System.out.println("请输入月份：");
		int month=sc.nextInt();
		switch(month) {
		case 1:
		case 2:
		case 3: System.out.println("春");break;
		case 4:
		case 5:
		case 6:System.out.println("夏");break;
		case 7:
		case 8:
		case 9:System.out.println("秋");break;
		case 10:
		case 11:
		case 12:System.out.println("冬");break;
		}
			
	}
}
