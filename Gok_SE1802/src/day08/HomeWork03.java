/**
 * <p>Title: HomeWork03.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day08;

public class HomeWork03 {
	public static void main(String[] args) {
		Score score=new Score(88,77,99);
		Student student=new Student("cc",18,score);
		System.out.println(student);
		student.socre.getTotalScore();
		student.socre.average();
	}
}

class Score{
	double china;
	double math;
	double english;
	public Score(int china, int math, int english) {
		super();
		this.china = china;
		this.math = math;
		this.english = english;
	}
	public void getTotalScore() {
		System.out.println("总成绩为："+(this.china+this.math+this.english));
	}
	public void average() {
		System.out.println("平均成绩为："+(this.china+this.math+this.english)/3);
	}
	public String toString() {
		return "Score [china=" + china + ", math=" + math + ", english=" + english + "]";
	}
	
}

class Student{
	String userName;
	int age;
	Score socre;
	public Student(String userName, int age, Score socre) {
		super();
		this.userName = userName;
		this.age = age;
		this.socre = socre;
	}
	
	public String toString() {
		return "Student [userName=" + userName + ", age=" + age + ", socre=" + socre + "]";
	}
	
	
}
