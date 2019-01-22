/**
  * <p>Title: Demo04.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day02;

public class Demo04 {
	public static void main(String[] args) {
		/*
		 *  算术运算符： 
		 *     一元运算符 ：  
		 *     		++（自增1） 
		 *     
		 *     		--（自减1）
		 */
		int i=10;
		System.out.println("i:"+i);
		/*
		 *前++ ： i值本身+1 ，同时整个表达式 ++i也 +1
		 */
		int x1=++i;
		System.out.println("x1:"+x1); //11 
		System.out.println("i:"+i);   //11
		/*
		 *后++：  i值本身+1 ； 但是整个表达式 i++也 不变
		 */
		int x2=i++;
		System.out.println("x2:"+x2);  //11
		System.out.println("i:"+i);    //12
		
		/*
		 * 前-- ： i值本身-1 ，同时整个表达式 --i也 -1
		 */
		int  y1=--i;
		System.out.println("y1:"+y1); // 11 
		System.out.println("i:"+i);    //11
		
		/*
		 * 后-- ： i值本身-1 ，同时整个表达式 不变
		 */
		int  y2=i--;
		System.out.println("y2:"+y2);  //11
		System.out.println("i:"+i);    //10
	}

}
