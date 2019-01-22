/**
 * <p>Title: Demo08.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day02;

public class Demo08 {
	public static void main(String[] args) {
		/*
		 * 数据类型转换 ：  
		 * 		算术运算时的数据转换：
		 * 			不同的数据在进行计算时，会先转换成相同类型，再进行计算
		 * 		
		 * 		1、自动转换：
		 * 			也称隐式类型转换，是指不需要书写代码，
		 *     		由编译器自动完成的类型转换
		 *         
		 *         自动转换一般发生不同 基本数据计算时， 
		 *         “小范围”的数据类型 自动提升成“大范围”的数据类型，最终再进行计算
		 *			范围关系：  byte, short, char > int > long >  float > double
		 */
		int x=10;
		double y=12.3;
		double z=x+y;
		 /*
		  *  String 和任何数据类型进行   +计算，  其他数据类型都会先转成字符串，
		  *  然后进行字符串拼接操作
		  */
		String str="10";
		int i=10;
		str=i+str;
		System.out.println("str:"+str);
		
		
		/*
		 *  复合赋值运算计算时也会进行自动转换：
		 */
//		short sh1=7;
//		sh1=sh1+1;  //编译报错
		short sh1=7;
		sh1+=1;  //编译器会自动转成int类型
		
		
		/*
		 * 2、强制转换：
		 *       将"大范围"数据强转成"小范围"数据
		 *    
		 *    注意： 1、转换前的数据类型与转换后的数据类型兼容
		 *    		2、可能会造成精度的丢失
		 *    		3、数据的溢出
		 */
		short s=10;
		byte b=13;
		short g=(short)(b+s);
		
		// 测试数据的精度的丢失
		double dou1=10.3;
		int in1=6;
		int in=(int)(dou1+in1);
		System.out.println("in:"+in);
		
		// 测试数据的溢出
		byte by1=125;
		byte by2=10;
		byte by3=(byte)(by1+by2);
		// 00000000 00000000 00000011 11111111
		System.out.println("by3:"+by3);
	}
}
