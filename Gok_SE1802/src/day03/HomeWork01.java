/**
 * <p>Title: HomeWork01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day03;
public class HomeWork01 {
	public static void main(String[] args) {
		/*
		 * 1、编写程序 输出  char c1=’你’, c2=’a’; char 是=’ぁ’;  
		 * 三个字符变量中字符对应的unicode码;
		 */
		 char c1='你';
		 char c2='a'; 
		 char 是='ぁ'; 
		 int i1=c1;
		 int i2=c2;
		 int i3=是;
		 System.out.println("i1:"+i1);
		 System.out.println("i2:"+i2);
		 System.out.println("i3:"+i3);
		
		 /*
		  * 2、用三目运算符实现  商品页数的显示
			用户从控制台输入  商品的总数量 ，以及每页显示的商品数量
			程序计算出要用多少页来显示这些商品
		  */
		 int tp=10002;  // 商品的数量
		 int ps=100;    // 每页显示的商品个数
		 int pn=tp%ps==0?tp/ps:tp/ps+1;
		 
		 /*
		  * 3、根据性别和体重计算输血量。
		  * 女性体重不超过50kg的输血量为200毫升，否则250毫升；
		  * 男性不超过60kg的输血量为250毫升，否则300毫升。
		  */
		 char gender='男';
		 double weigth=66.6;
		 if(gender=='男') {
			 if(weigth>=60) {
				 System.out.println("输血量为300毫升");
			 }else {
				 System.out.println("输血量为250毫升");
			 }
		 }else {
			 if(weigth>=50) {
				 System.out.println("输血量为250毫升");
			 }else {
				 System.out.println("输血量为200毫升");
			 }
		 }
		 
		 /*
		  * 4、定义两个整数并初始化，
		  * 把两个数字输出，然后交换两个数字并且输出结果
		  */
		 int x=10;
		 int y=11;
		 int temp;
		 temp=y;
		 y=x;
		 x=temp;
	}

}
