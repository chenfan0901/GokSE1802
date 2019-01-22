/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day08;
import day07.Demo05;

//不能同时导入两个同名但是不同包的类
//import day02.Demo05;

public class Demo01 {
	/*
	 * java中的包： 包(package)是类的容器，用来保存划分类名空间。
	 * 	
	 * 		作用： 1、 用来解决不同类名的冲突问题
	 * 			  2 、 将功能相似的类的组织在同一个包中，方便查找和使用
	 * 			  3、 包用来限定访问权限
	 * 		包名在创建时，一般约定是公司域名反写+功能名+层次名
	 */
	public static void main(String[] args) {
		Demo05 demo=new Demo05();
		
		/*
		 * 1、 在同一个类中访问不同包的同名类： 通过全类名的方式继续访问
		 * 				即：  包名+类名
		 */
		
		day02.Demo05 demo1=new day02.Demo05();
		/*
		 * 2、有包名的类是不能访问无包名的类
		 * 	     但是无包名的类可以访问到有包名的类
		 * 
		 * 在搜寻类时，先从当包中找起，如果有则直接使用当前包中的类，
		 * 没有则继续去包外寻找
		 */
//		NoPackageClass npc=new NoPackageClass();
	}
	
	
}
