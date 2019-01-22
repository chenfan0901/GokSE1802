/**
 * <p>Title: Demo01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day09;

public class Demo01 {
	
//	public static void feedAnimal(Dog dog,String food) {
//		dog.eat(food);
//	}
//	public static void feedAnimal(Cat cat,String food) {
//		cat.eat(food);
//	}
	public static void feedAnimal(Animal animal,String food) {
		animal.eat(food);
	}
	
	
	public static void main(String[] args) {
//		Dog dog=new Dog();
//		feedAnimal(dog, "骨头"); 
//		Cat cat=new Cat();
//		feedAnimal(cat, "鱼");
		/*
		 * 向上造型：  父类型的引用变量指向子类型的实例，
		 * 			 调用方法时，是调用具体子类重写的父类的方法
		 * 
		 * 		注意： 1、向上造型后，就算子类定义了和父类相同的属性，
		 * 				 父类型引用变量调用的是父类中的属性。
		 * 			  2、向上造型以后，不能调用子类新增的属性
		 * 			  3、向上造型以后，不能调用子类新增的方法
		 * 			  4、向上造型以后。子类重写父类方法，
		 * 					                    调用的是被重写的方法。
		 * 			  5、 向上造型以后，调用静态方法时，还是调用的父类自己的
		 * 				    静态方法（静态方法不存在重写）
		 */
		Animal animal=new Dog();
		feedAnimal(animal, "骨头");
		System.out.println("animal.age:"+animal.age);
//		animal.color;
//		animal.bark();
		animal.staticMethod();
		Animal animal1=new Cat();
		feedAnimal(animal1, "鱼");
		
		/*
		 * 向下塑型： 将向上造型后的父类型变量 强转成子类型
		 * 			
		 * 		向下塑型条件： 1、必须先经过向上造型，不能直接将父类对象向下塑型
		 * 					 2、 向下塑型的类之间需要有继承关系
		 * 					 3、 向下塑型时，必须保证被强转的父类引用变量所代表的子类实例为
		 * 						 当前要强转的类型，否则会抛出 类造型异常ClassCastException	 
		 * 						此时需要用 instanceof关键字类实现类型的判断
		 */
//		Animal am=new Animal();
//		Dog dog=(Dog)am; // 不能直接强转父类
		
		// instanceof关键字用来判读当前 变量所代表对象的类型是否为指定类型
		if(animal instanceof Dog) {
			Dog dog=(Dog)animal;
			System.out.println("dog.age:"+dog.age);
		}
	}
}

class Animal{
	int age=20;
	public static void staticMethod() {
		System.out.println("Animal.staticMethod() ");
	}
	
	public void eat(String food ) {
		System.out.println("Animal.eat");
	}
	
}
class Dog extends Animal{
	int age=8;
	String color;
	public static void staticMethod() {
		System.out.println("Dog.staticMethod() ");
	}
	
	public void eat(String food ) {
		System.out.println("狗吃"+food);
	}
	
	public void bark( ) {
		System.out.println("Dog.bark()");
	}
}
class Serpent extends Animal{
	public void eat(String food) {
		System.out.println("蛇吃"+food);
	}
}
class Cat extends Animal{
	public void eat(String food) {
		System.out.println("猫吃"+food);
	}
}

