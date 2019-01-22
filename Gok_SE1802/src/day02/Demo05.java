package day02;
public class Demo05 {
	public static void main(String[] args) {
		/*
		 * 赋值运算：
		 * 		1、 “=”  将表达式右边的值赋值给左边的变量
		 * 		2、复合赋值运算
		 * 			+=X   += 5	  X = X + 5
		   			-=X   -= 5	  X = X - 5
					*=X   *= 5	  X = X * 5
					/=X   /= 5	  X = X / 5
					%=X   %= 5	  X = X % 5	
		 * 				
		 */
		int  a=10;
//		a=a+10;
		a+=10; // ==> a=a+10
		
		int z,b,c;
		a=b=c=10;  //可以同时对多个变量赋值
		
		int x;
//		x=10=30; // 不可以在同一行给一个变量同时赋多个值
		
	}
}
