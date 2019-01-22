/**
 * <p>Title: Demo05.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day03;

public class Demo05 {
	public static void main(String[] args) {
		/*
		 * break      :  表示结束当前整个循环，
		 * continue   :  表示忽略当前这一次循环，
		 */
//		for(int i=0;i<6;i++) {
//			if(i==3) {
//				break;
//			}
//			System.out.println("i:"+i);
//		}
//		System.out.println("-------------------------------------");
//		for(int i=0;i<6;i++) {
//			if(i==3) {
//				continue;
//			}
//			System.out.println("i:"+i);
//		}
		
		
		/*
		 * continue 使用在while 和for 中时的控制权问题
		 *   continue 在for循环中， 控制权是交给i++再求值部分的
		 *   continue 在while中时，交由条件判断部分
		 */
		for(int i=0;i<6;i++) {
			if(i==3) {
				continue;
			}
			System.out.println("i:"+i);
		}
		
		System.out.println("-------------------------------------");
		
		int i=0;
		while(i<6) {
			if(i==3) {
				continue;
			}
			System.out.println("i:"+i);
			i++;
		}
		
		
		
	}
}
