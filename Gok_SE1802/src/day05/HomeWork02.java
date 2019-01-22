/**
 * <p>Title: HomeWork02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day05;

import java.util.Arrays;

public class HomeWork02 {
	public static void printStudentInfos(Student[] student) {
		for(int i=0;i<student.length;i++) {
			System.out.println("名字："+student[i].name);
		}
	}
	
	public static void main(String[] args) {
		/*
		 * 创建学生对象：  
		 * 		new Student() 创建对象
		 * 		Student student  声明一个Student类型的引用变量
		 */
		Student student=new Student();
		System.out.println(student);
		student.speak("汉语");
		
		Student[] stduents=new Student[2];
		
		// 定义一个学生对象
		Student student1=new Student();
		// 对当前学对象的属性进行初始化赋值
		student1.name="cf";
		student1.age=20;
		student1.studentNo="0001";
		student1.classNo="1802";
		//将该学生对象存入数组
		stduents[0]=student1;
		
		// 定义一个学生对象
		Student student2=new Student();
		// 对当前学对象的属性进行初始化赋值
		student2.name="cf1";
		student2.age=2;
		student2.studentNo="0002";
		student2.classNo="1802";
		//将该学生对象存入数组
		stduents[1]=student2;
		
		printStudentInfos(stduents);
	}
}

/*
 * 4、定义学生类Student，有属性姓名，年龄，学号，班级号，
 * 	且含有方法speak，能根据传入字符串参数打印此学生说的语言
	在测试类中书写方法 打印一个和多个学生信息，并调用学生对应的speak方法；
 */
class Student{
	String name;
	int age;
	String studentNo;
	String classNo;
	public void speak(String lunange) {
		System.out.println("当前学生会说："+lunange);
	}
}