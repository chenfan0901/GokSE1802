package day10;

public class Demo02 {
	
	public static void printTime(Time t) {
		System.out.println(t.getTime());
		
	}
	
	public static void main(String[] args) {
		Time t=new Computer();
		printTime(t);
	}
}
/*
 *接口： 一种特殊的抽象类，在接口中只允许有方法定义 和 常量
 *		不允许有成员变量和 普通方法。
 *		
 *
 *		1、在接口方法是默认abstract，常量是默认加static 和final
 *		2、在jdk1.8以后，允许出现static方法，和  default方法 ， 可以有方法体
 *		3、接口通过implements实现，一个子类可以实现多个接口，
 *		     继承了多个接口以后，就必须实现该接口中的所有方法
 *
 *		4、抽象类更多关注当前这些子类 是属于哪个类别的，
 *		      接口更多关注当前这些子类究竟具有哪些功能。
 */
interface Time{
//	final int i=10;
	int i=10;
//	public abstract int getTime();
	public int getTime();
}
interface Show{
	public void watchTV();
}


class Computer implements Time,Show{
	public int getTime() {
		return 2;
	}
	public void watchTV() {
		System.out.println("看电视");
	}
}

class BettyBycle implements Time{
	public int getTime() {
		return 6;
	}
}


