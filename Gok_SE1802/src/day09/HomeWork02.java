/**
 * <p>Title: HomeWork02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day09;
public class HomeWork02 {
	public static void main(String[] args) {
		Animal1 animal1=new Animal1();
		Dog1 dog=new Dog1();
		dog.bark();
	}
}

class Animal1{
	public void bark() {
		System.out.println("Animal1.bark() ");
	}
}
class Dog1 extends Animal1{
	public void bark() {
		System.out.println("Dog1.bark() ");
		super.bark();
	}
}
class Serpent1{
	public final void bark() {
		System.out.println("Serpent.bark() ");
	}
}




