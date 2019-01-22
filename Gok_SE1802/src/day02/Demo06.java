/**
 * <p>Title: Demo06.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day02;

import java.util.Scanner;

/**  
 * @ClassName: Demo06  
 * @Description: TODO 
 * @author: chenfan  
 * @date: 2018年7月15日  
 *  
 */
public class Demo06 {
	public static void main(String[] args) {
		/*
		 * 关系运算符： 
		 * 		>   <  >=   <=  == !=
		 * 
		 * 用户从控制台输入一个字母，程序判断是大写或者小写
		 * 如果是大写字母，将其转换成对应小写字母
		 * 如果是 小写字母，将其转成对应的大写字母
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个字母：");	
		String str=sc.next(); //从控制台获取一个字符串
		char ch=str.charAt(0); //从字符串中的指定位置获取 字符数据
//		boolean b=ch>='A' & ch<='Z'; // 此处写法和下一句等同
		boolean b=ch>=65 & ch<=90;
		if(b) {
			ch=(char)(ch+32);
			System.out.println("输入为大写字母");
			System.out.println("ch:"+ch);
		}else {
			ch=(char)(ch-32);
			System.out.println("输入为小写字母");
			System.out.println("ch:"+ch);
		}
	}
}
