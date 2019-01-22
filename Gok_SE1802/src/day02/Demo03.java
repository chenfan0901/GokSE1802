/**
 * <p>Title: Demo03.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day02;

import java.util.Scanner;

public class Demo03 {
	public static void main(String[] args) {
		/*
		 *用户从控制台输入一个秒数，程序算出 时 分 秒
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个秒数：");
		int se=	sc.nextInt();
		// 定义3个变量来接收 时分秒的数值
		int h,m,s;
		//  整数相除得到还是整数，小数位被省略
		h=se/3600;// 算出时
		// se%3600 计算出不满足1个小时即3600秒的秒数，不满足的部分即为分钟
		// 用求余到的数据再除 60秒 就到分钟数
		m=se%3600/60;
		//秒数
		s=se%60;
		System.out.println(h+"时"+m+"分"+s+"秒");
		
	}

}
