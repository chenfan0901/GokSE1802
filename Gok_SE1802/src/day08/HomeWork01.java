/**
 * <p>Title: HomeWork01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day08;

public class HomeWork01 {
	public static int k=0;
	public static HomeWork01  d1=new HomeWork01("d1");
	public static HomeWork01  d2=new HomeWork01("d2");
	public static int i = print("i");
	public static int n = 99;
	
	public int j = print("j");
	
	static{  print("静态块");  }
	
	{   print("构造块");       }
	public HomeWork01(String str) {
		System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);
        ++n;
        ++i;
	}		
	public static int print(String str) {
        System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);
        ++i;
        return ++n;
	}
	
	public static void main(String[] args) {
		HomeWork01 demo=new HomeWork01("创建对象");
	}
}
