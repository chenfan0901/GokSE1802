package day02;

import java.util.Scanner;


public class Demo10 {
	public static void main(String[] args) {
		/*
		 *  if 条件判断语句： 
		 *  	语法:  if(表达式){
		 *  				代码
		 *  			}
		 *  	根据表达式是否为true决定代码是否执行
		 *  分为3种类型：
		 */
		//1、单分支
		int i=10;
		if(i>9) {
			System.out.println("a>9");
		}
		
		/*
		 * 2、双分支
		 * 	判断某个数字是否为偶数
		 */
		int x=10;
		if(x%2==0) {
			System.out.println("是偶數");
		}else {
			System.out.println("是奇數");
		}
		
		/*
		 * 3、多分支
		 * 		if (逻辑表达式1){
					语句1;
				}else if (逻辑表达式2){
					语句2；
				}else if (逻辑表达式3){
					语句3;
				}else{
					语句4;
				} 
		 * 
		 */
		
		
		
		/*
		 * 嵌套if语句
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int a=sc.nextInt();
		System.out.println("请输入第二个数：");
		int b=sc.nextInt();
		System.out.println("请输入第三个数：");
		int c=sc.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println("最大值："+a);
			}else {
				System.out.println("最大值："+c);
			}
		}else {
			if(b>c) {
				System.out.println("最大值："+b);
			}else {
				System.out.println("最大值："+c);
			}
		}
	}

}
