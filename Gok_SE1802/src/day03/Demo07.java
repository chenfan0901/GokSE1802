/**
 * <p>Title: Demo07.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day03;

/**  
 * @ClassName: Demo07  
 * @Description: TODO 
 * @author: chenfan  
 * @date: 2018年7月17日  
 *  
 */
public class Demo07 {
	public static void main(String[] args) {
		/*
		 * 嵌套for循环
		 *    在for 循环中继续嵌套for
		 *    外层循环 执行一次，内层循环执行完整个循环
		 */
		for(int i=0;i<5;i++) {
			 for(int j=0;j<5;j++) {
				 System.out.println("i="+i+"||"+"j:"+j);
			 }
			 System.out.println("--------------");
		}
		
		/*
		 *  利用嵌套for循环打印99乘法表
		 *  1*1=1
		 *  1*2=2  2*2=4
		 *  1*3=3  2*3=6   3*3=9。。。。
		 */
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+i*j+"	");
			}
			System.out.println("");
		}
		/*
		 *利用嵌套for循环打印 直角三角形
		 *     ****
		 *     ***
		 *     **
		 *     *
		 */
		// 外层循环控制行数
		for(int i=0;i<4;i++) {
			// 内层循环控制打印* 的个数
			for(int j=0;j<4-i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
