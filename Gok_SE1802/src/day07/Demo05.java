/**
 * <p>Title: Demo05.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day07;

public class Demo05 {
	String name;
	/*
	 *Object 父类提供的用来回收垃圾的方法
	 */
	public void finalize() {
		System.out.println(this+"被回收了");
	}
	public static void main(String[] args) {
		/*
		 *java垃圾回收机制：java会自动回收那些没有引用变量指向的对象
		 *					并且释放其所占的内存  
		 */
		Demo05 demo=new Demo05();
		System.out.println("当前对象为："+demo);
		demo=null;
		//调用此方法进行强制垃圾回收
		System.gc();
	}
}
