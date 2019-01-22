/**
 * <p>Title: Demo02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day03;

/**  
 * @ClassName: Demo02  
 * @Description: TODO 
 * @author: chenfan  
 * @date: 2018年7月17日  
 *  
 */
public class Demo02 {
	public static void main(String[] args) {
		/*
		 * for(1 初始化计数器; 2 循环条件判断 ; 4 在求值参数){
		 * 		3 循环体
		 * }	
		 * 
		 *  第一次循环： 先执行1 初始化计数器，再执行2循环条件判断， 接着3 循环体
		 *  
		 *  第二次循环： 执行4 在求值参数，执行 2循环条件判断，接着3 循环体
		 *  
		 *  第三次： 执行4 在求值参数，执行 2循环条件判断，接着3 循环体
		 *  			。。。。。
		 *  循环结束
		 */
		 /*
		  *  利用循环计算 1+2+3+4+....+100
		  *  sum =0+1
		  *  sum=1+2
		  *  sum=3+3
		  */
		int sum=0; // 存放 每次循环 加后的值
		/*
		 *  for循环一般用来执行 知道循环次数的  循环
		 *  
		 *    其循环条件和再求职参数 都可以没有，不过这样会导致当前循环编程死循环  
		 */
		for(int i=1;i<=100;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		/*
		 * PI=4/1-4/3+4/5-4/7+4/9-4/11........
		 * 当前这个计算式会无线接近于 圆周率的值
		 * 要求编程计算最少经过多少次的上述加减计算，
		 * 得到的值在圆周率的范围 3.1415926 ~ 3.1415927 之间
		 */
		double pi=0;
		double x=1; // 定义分母
		double y=0.0;// 初始化整个分数的值
		for(int i=1;;i++) {
			y=4.0/x; 
			if(i%2==0) {
				pi=pi-y; //当循环的次数是偶数次， 进行-运算
				x=x+2; // 分母递增
			}else {
				pi=pi+y; //当循环的次数是奇数次， 进行+运算
				x=x+2;  // 分母递增
			}
			if(pi>=3.1415926 && pi<=3.1415927) {
				System.out.println("计算的次数："+i);
				break;
			}
		}
		
	}

}
