/**
 * <p>Title: Demo07.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day02;

public class Demo07 {
	public static void main(String[] args) {
		/*
		 * 逻辑运算符：
		 *    与  &       或 |     非 ！
		 *   
		 *   在程序中更多使用 短路逻辑运算：
		 *   &&  :   当&& 左边为false时，整个逻辑表达式
		 *           不管右边是true或则false，已经确定为false，
		 *            此时右边的表达式则没有执行的必要
		 *            
		 *   ||  :   当|| 左边为true时，整个逻辑表达式已经确定为true
		 *           此时右边没有执行的必要
		 */
		int a=10;
		int b=7;
		int c=20;
		if(b>a && b<c++){
			System.out.println("b>a & b<c");
		}
		System.out.println("c:"+c);
		
		if(a>b||a<c++) {
			System.out.println("a>b||a<c");
		}
		System.out.println("c:"+c);
	}

}
