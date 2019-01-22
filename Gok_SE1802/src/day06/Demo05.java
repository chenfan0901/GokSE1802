/**
 * <p>Title: Demo05.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day06;

import java.util.Arrays;

public class Demo05 {
	public static void main(String[] args) {
		String[] str= {"1","2","3","4"};	
//		String[] s=Arrays.copyOf(str, 3);
		
		// 实现数组的伪扩容
		str=Arrays.copyOf(str, str.length+1);
		System.out.println(Arrays.toString(str));
	}
}
