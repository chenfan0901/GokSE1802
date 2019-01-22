/**
 * <p>Title: Demo04.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day03;

import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Demo04 {
	public static void main(String[] args) {
		/*
		 *	do{
		 *		循环体
		 *	}while(循环条件)
		 *  至少先执行一次循环体，然后再进行循环条件判断
		 */
		// 系统随机生成 1~100之间的整数，用户从控制台输入数字来猜测其值
		Scanner sc=new Scanner(System.in);
		//产生随机数的工具类
		Random ra=new Random();
		//ra.nextInt(100) 产生的是0~99之间的随机数
		int num=ra.nextInt(100)+1;
		int x=0; // 定义一个变量来存放用户输入的数据
		do{
			System.out.println("请输入数字：");
			x=sc.nextInt();
			if(x>num) {
				System.out.println("猜大了");
			}
			if(x<num) {
				System.out.println("猜小了");
			}
		}while(x!=num); 
		System.out.println("猜对，游戏结束");
	}
}
