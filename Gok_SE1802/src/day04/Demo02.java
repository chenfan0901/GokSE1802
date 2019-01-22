/**
 * <p>Title: Demo02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day04;

import java.util.Arrays;
import java.util.Random;

public class Demo02 {
	
	/*
		1、编写一个程序， 随机生成100个0~9之间的随机数，
	 *统计0~9出现的个数
	 */
	public static void test1() {
		Random ra=new Random();
		//定义长度为100的数组来存放100个随机数
		int[] arrInt=new int[100]; 		
		for(int i=0;i<arrInt.length;i++) {
			arrInt[i]=ra.nextInt(10);
		}
		/*
		 * 定义该数组用来统计0~9 的次数, 该数组的下标即0123456789 这几个数字， 
		 * 元素值为 每个数字出现的次数
		 */
		int[] count=new int[10];
		for(int i=0;i<arrInt.length;i++) {
			count[arrInt[i]]++;
		}
	}
	 /*2、有一队不重复的自然数0,1,2,3,4,5,6,7,8,9
	 *现将这些自然数随机取出7个存放进一个数组中， 
	 *请打印出没有被存放进数组的数字是哪些
	 **/
	public static void test2() {
		int[] arrInt= {0,1,2,3,4,5,6,7,8,9};
		//定义标记数组
		boolean[] isUsed=new boolean[10];
		Random ra=new Random();
		//用来存放随机取出的7个数字
		int[] arr=new int[7];
		// 该值为arr的下标，只要每成功存入一个数字进arr，则下标+1
		int index=0;   int num;
		while(true) {
			num=ra.nextInt(10);
			if(isUsed[num]) { //走if,说明对应标记位的数字已经被使用过
				continue;
			}
			arr[index]=arrInt[num];
			// 将对应的标记位改成true，表示该位置的数字已经被用过
			isUsed[num]=true;
			if(index==6) { // 下标为6，循环结束
				break;
			}
			index++;
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<isUsed.length;i++) {
			if(!isUsed[i]) {
				System.out.println(arrInt[i]+"未被存入");
			}
		}
	}
	
	/*
	 *3、现有英语一串英语字母，请写出程序找出该字符串中首选出现3次的字母;
	 *	提示： str.toCharArray() 字符串提供的该方法可以将字符串转成字符数组
	 *		  str.length()  该方法可以获取字符串的长度
	 */
	public static void test3() {
		String str="GhGhjsdGhfhsjg";
		//将字符串转成字符数组
		char[] ch=str.toCharArray();
//		int[] arrInt=new int[ch.length];
//		// 将字符转成int
//		for(int i=0;i<arrInt.length;i++) {
//			arrInt[i]=ch[i];
//		}
//		//定义长度为 26的数组，代表ABCD......abcd。。。。。。 52个字母
//		int[] arrInt1=new int[52];
//		for(int i=0;i<arrInt.length;i++) {
//			if(arrInt[i]>='A'&& arrInt[i]<='Z') {
//				arrInt1[arrInt[i]-65]++;
//				if(arrInt1[arrInt[i]-65]==3) {
//					System.out.println("首先出现3次的字符是:"+(char)(arrInt[i]));
//					break;
//				}
//			}else {
//				arrInt1[arrInt[i]-97+26]++;
//				if(arrInt1[arrInt[i]-97+26]==3) {
//					System.out.println("首先出现3次的字符是:"+(char)(arrInt[i]));
//					break;
//				}
//			}
//		}
		
//		//定义一个数组， 为了能将ch中字符取出来然候放置到当前数组中
//		char[] chx=new char[ch.length];
//		//定义count数组来存放次数
//		int[] count=new int[ch.length];
//		for(int i=0;i<ch.length;i++) { //外层循环控制取出 ch每个字符
//			//内层循环判断取出来的字符是否在chx已经存在，如果存在，则对应的count数组位置的值+1
//			int j=0;
//			for(;j<chx.length;j++) {
//				if(ch[i]==chx[j]) {
//					count[j]++;
//					break;
//				}
//			}
//			chx[j]=ch[i];
//			
//			//检查count数组中有无值为3的元素
//			for(int j=0;j< ) {
//				
//			}
//		}
		
		
		
	}
	
	
	public static void main(String[] args) {
//		test1();
//		test2();
		test3();
	}
}
