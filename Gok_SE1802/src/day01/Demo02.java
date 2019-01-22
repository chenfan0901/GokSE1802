/**
 * <p>Title: Demo02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day01;

public class Demo02 {
	public static void main(String[] args) {
		 for(int i=0;i<4;i++){  // 倒直角
             for(int j=1;j<=4-i;j++) {
            	 System.out.print("*");
             }
             System.out.println(""); // 换行
         }
		 for(int i=1;i<=4;i++){  // 正直角
             for(int j=1;j<=i+1;j++) {
            	 System.out.print("*");
             }
             System.out.println(""); // 换行
         }
		
		 

	}
}
