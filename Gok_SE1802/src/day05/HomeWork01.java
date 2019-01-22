/**
 * <p>Title: HomeWork01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork01 {

	/*
	 *现有英语一串英语字母，请写出程序找出该字符串中首选出现3次的字母;
	 *	提示： str.toCharArray() 字符串提供的该方法可以将字符串转成字符数组
	 *		  str.length()  该方法可以获取字符串的长度
	 */
	public static void test01() {
		String str="hhGhjsdGhfhsjg";
		//将字符串转成字符数组
		char[] ch=str.toCharArray();
		int[] count=new int[128];
		
		//遍历字符数组
		for(int i=0;i<ch.length;i++) {
			if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z')) {
				count[ch[i]]++;
				if(count[ch[i]]==3) {
					System.out.println("首先出现3次的是："+ch[i]);
					break;
				}
			}
		}
	}
	
	//1、在歌唱比赛中，共有10位评委进行打分，在计算歌手得分时，
	//去掉一个最高分，去掉一个最低分， 然后剩余的8位评委的分数进行平均，
	//就是该选手的最终得分。输入每个评委的评分，求某选手的得分。 
	public static void  test02() {
		double[] arrScore= {9,7,10,5,8,8,4,7,7,6};
		// Arrays.sort(array) 将指定数组按照从小到大排列
		Arrays.sort(arrScore);
//		System.out.println(Arrays.toString(arrScore));
		double sum=0;
		for(int i=1;i<arrScore.length-1;i++) {
			sum+=arrScore[i];
		}
		System.out.println(sum/(arrScore.length-2));
	}
	
	/*
	 *  2、 随机生成 超级大乐透彩票号码,规则：“35选5加12选2” ，
	 *  即 01~35个红球选5个，01~12选篮球2个
     * 	其中生成的红球和蓝球的各种类型的数字不可重复
	 */
	public static void  test03() {
		Random ra=new Random();
		String[] pool={"01","02","03","04","05","06","07","08","09","10","11","12",
				"13","14","15","16","17","18","19","20","21","22","23","24",
				"25","26","27","28","29","30","31","32","33","34","35"};
		//定义一个getBalls数组来存放取出的红色球
		String[] getBalls=new String[5];
		//定义一个标记数组用来判断球是否被用过
		boolean[] isUsed=new boolean[pool.length];
		int raIndex;//定义此变量用来存放随机产生的球池数组pool的下标
		
		int index=0;// 定义getBalls数组的下标
		while(true) {
			raIndex=ra.nextInt(pool.length);
			if(isUsed[raIndex]) {
				continue;
			}
			getBalls[index]=pool[raIndex];
			isUsed[raIndex]=true;
			if(index==4) {
				break;
			}
			index++;
		}
		System.out.println(Arrays.toString(getBalls));
	}
	
	/*
	 *3、猜字母游戏：
	规则： 程序随机产生5个按照一定顺序排列的字符（不重复）为猜测的结果，  由玩家来猜测此字符串
			其中玩家可以猜测多次，每猜测一次，由系统提示结果，
			如果完全猜对（字符和字符的排列位置都要正确），则显示游戏结束，   
			没有全部猜对，则提示猜测的结果 ： 猜对的字符个数和 字符的位置信息，并提示玩家继续
			  比如：  用户输入 ABCDE，  提示  猜对了2个字符， 其中 第1号位置正确
	 */
	
	//定义一个方法用来产生一个不重复的随机的小写字符数组
	public static char[]  getChars() {
		Random ra=new Random();
		char[] ch=new char[26];
		for(int i=0;i<ch.length;i++) {
			ch[i]=(char)(i+97);
		}
		
		//从字母数组中随机取5个
		char[] getChars=new char[5];
		
		boolean[] isUsed=new boolean[ch.length];
		int index=0; //定义getChars数组的下标
		int raindex=0; //定义随机生成下标
		while(true) {
			raindex=ra.nextInt(ch.length);
			if(isUsed[raindex]) {
				continue;
			}
			getChars[index]=ch[raindex];
			isUsed[raindex]=true;
			if(index==4) {
				break;
			}
			index++;
		}
		System.out.println(Arrays.toString(getChars));
		return getChars;
	}
	
	//用户从控制输入字符，程序进行判断比较
	public static void  test04() {
		Scanner sc=new Scanner(System.in);
		//调用生成随机字母数组的方法获取随机字母数组
		char[] getChars=getChars();
		System.out.println("游戏开始请输入字符：");
		int count=0;// 定义count统计猜对了多少个
		while(true) {
			String getStr=sc.next();
			char[] userCh=getStr.toCharArray();
			// 将用户输入的字符和  程序产生的字符比对
			for(int i=0;i<getChars.length;i++) {
				if(userCh[i]==getChars[i]) {
					count++;
					System.out.println("第"+(i+1)+"猜对");
				}
			}
			if(count==5) {
				System.out.println("游戏结束");
				break;
			}
			System.out.println("请继续游戏：");
			count=0;//没有全部答对，count重置
		}
	}
	public static void main(String[] args) {
//		test01();
//		test02();
//		test03();
		test04();
	}

}
