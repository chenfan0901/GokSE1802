/**
 * <p>Title: Demo03.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day03;

public class Demo03 {
	public static void main(String[] args) {
		/*
		 * while(逻辑表达式){
		 * 		循环体
		 * }
		 * 逻辑表达式为true ，执行循环体， 为faslse时循环结束
		 */
		/*
		 * 利用while循环实现将123456789 进行倒置 ，即987654321
		 * 取出来最后一位数字：
		 * 		int x=i%10;  9
		 *      i=i/10; 将外层数字9去掉
		 *      temp=temp*10+x;  0*10+9  9
		 *      
		 *      x=i%10;      8
		 *      i=i/10;  将外层数字9去掉
		 *      temp=temp*10+x;  9*10+8  98
		 *      
		 *      x=i%10       7
		 *      i=i/10;  将外层数字9去掉
		 *      temp=temp*10+x;  98*10+7  987
		 */
		int i=123456789;
		int lastNum=0; //定义lastNum用来存放取出来的最后一个数字
		int temp=0; //用来存放倒置后的数据
		while(i>0) {
			lastNum=i%10;
			temp=temp*10+lastNum;
			i=i/10;
		}
		System.out.println("temp:"+temp);
	}
}
