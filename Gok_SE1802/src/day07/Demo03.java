package day07;
public class Demo03 {
	public static void main(String[] args) {
		Singleton singleton=Singleton.returnSingleton();
//		Singleton singleton=new Singleton();
		System.out.println(singleton.a); 
		System.out.println(singleton.b); 
	}
}
class Singleton{
	public static int a;
	public static int b=0;
	private static Singleton singleton=new Singleton();
	public Singleton() {
		a++;
		b++;
	}
	public static Singleton returnSingleton() {
		return singleton;
	}
}