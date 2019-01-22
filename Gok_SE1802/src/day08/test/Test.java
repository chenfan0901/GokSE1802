/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day08.test;

import day08.Demo02;

public class Test extends Demo02{
	
	public static void main(String[] args) {
		Demo02 demo=new Demo02();
//		demo.age;
//		demo.userName;
//		demo.money;
		demo.classNo="1802";
		
		Test test=new Test();
		test.money=10;
		test.classNo="1802";
	}
}
