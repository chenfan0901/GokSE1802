/**
 * <p>Title: Demo08.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day03;

public class Demo08 {
	
	
	public static void main(String[] args) {
		/*
		 *  数组： 数组是有序数据的集合，
		 *  	数组中的每个元素具有相同的数据类型
		 */
		/*
		 * 数组的声明和初始化，有两种方式：
		 * 		1、 静态初始化
		 * 		2、动态初始化
		 */
		
		// 1、 静态初始化,  声明和赋值在同一行进行
		int[] arrInt={1,4,5,6,7};
		/*
		 *  数组在定义以后，  会在堆内存中开辟后
		 *  一个空间来存放{1,4,5,6,7}这种具体的数据，
		 *  然后再将该空间的地址值 赋值给    在 栈内存的数组变量
		 */
		System.out.println("arrInt:"+arrInt);//[I@7852e922
		
		/*
		 *  数组元素的访问：  通过访问数组的下标来实现
		 *  				对数组中具体元素的访问,下标从0开始
		 */
		System.out.println("arrInt[0]:"+arrInt[0]);
		/*
		 * 在访问数组中的元素时，需要注意，下标的最大值不能超过
		 * 数组长度-1 ,  否则抛出：数组下标越界异常
		 * 						ArrayIndexOutOfBoundsException
		 */
//		System.out.println("arrInt[5]:"+arrInt[5]);
		
		// 2、数组的动态创建方式：通过new 关键字来创建数组
		/*
		 *  2.1 动态创建方式1：
		 *  创建时需要确定数组的长度，  数组的长度一旦被确定便不可再该变
		 */
		int[] arrInt1=new int[10];
		System.out.println("arrInt1[7]:"+arrInt1[7]);
		arrInt1[7]=21;
		System.out.println("arrInt1[7]:"+arrInt1[7]);
		
		
		// 通过length属性来查看数组的长度
		System.out.println("arrInt1的长度："+arrInt1.length);
		/*
		 *  2.2动态创建方式2：
		 *  	创建时直接初始化元素的值和个数 ,此时不能在[]中指定数组长度值
		 */
		int[] arrInt2=new int[] {1,35,54,45345,35};
		
		
		/*
		 *3、 数组元素的迭代： 通过for循环实现对数组元素的遍历
		 */
//		for(int i=0;i<arrInt2.length;i++) {
//			System.out.print(arrInt2[i]+"	");
//		}
		/*
		 * 通过增强for循环实现数组遍历
		 * 	for(迭代出数据的类型    变量名 :待迭代的数组){
		 * 
		 * 	}
		 */
		for(int s:arrInt2) {
			System.out.print(s+" ");
		}
		
		/*
		 * 4、数组的比较
		 *    == 在对复合数据类型进行比较时，比较的是两个变量的地址  
		 */
		double[] d1=new double[10];
		double[] d2=new double[10];
		System.out.println(d1==d2);//比较的是数组的地址值 ，fasle  
		
		/*
		 * 5、null   表示什么都没有， 一般是复合数据类型的默认值,
		 *           当复合数据类型的值为null时，
		 *           去调用相应的方法和属性时会抛出空指针异常NullPointerException
		 */
		int[] arrx=null;
//		System.out.println(arrx.length);
	}
}
