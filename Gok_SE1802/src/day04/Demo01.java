/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day04;

public class Demo01 {
	
	public static void main(String[] args) {
		/*
		 * 二维数组：  
		 *      本质上来说就一维数组中再存放数据，
		 *      需要注意的是 外层一维数组的每个元素值 为  内层数组的地址
		 */
		//静态方式创建
		int[][] arrInt= {{1,35,4},{101,45},{0}};
		System.out.println("arrInt[1]:"+arrInt[1]);//I@7852e922
		System.out.println("arrInt[1]:"+arrInt[1][1]); //45
		/*
		 *  动态方式创建:
		 *      创建了一个二维数组，外层数组长度为2，即含有两个一维数组
		 *      内层数组的长度为 3
		 */
		int[][] arrInt1=new int[2][3];
		System.out.println("arrInt1[1]:"+arrInt1[1]);
		
		/*
		 * 动态创建了一个二维数组， 外层数组长度为 2， 但是此时内层数组还未被创建，
		 * 所以此时arrInt2[1]的默认值为null
		 */
		int[][] arrInt2=new int[2][];
		System.out.println("arrInt2[1]:"+arrInt2[1]);// null
		
		arrInt2[1]=new int[10];// 对外层数组中的第2个元素进行初始化赋值
		System.out.println("arrInt2[1]:"+arrInt2[1]);// [I@4e25154f
	}
	
}
