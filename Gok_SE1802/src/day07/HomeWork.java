/**
 * <p>Title: HomeWork.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day07;

public class HomeWork {
	public static void main(String[] args) {
		
		Score score=new Score();
		score.setChina(100);
		System.out.println("语文成绩："+score.getChina());
		
		Student student=new Student();
		
		student.setName("cf");
		student.setAge(17);
		student.setScore(new Score(100,99,98));
		System.out.println(student);
	}
}

/*
 * Score 类，用于描述成绩；
 * 有三门成绩：语文，外语，数学；
 */
class Score{
	private double china;
	private double english;
	private double math;
	
	
	/**
	 * 
	 */
	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Score(double china, double english, double math) {
		super();
		this.china = china;
		this.english = english;
		this.math = math;
	}


	public void setChina(double china) {
		this.china=china;
	}
	public double getChina() {
		return china;
	}
	/**
	 * @return the english
	 */
	public double getEnglish() {
		return english;
	}
	/**
	 * @param english the english to set
	 */
	public void setEnglish(double english) {
		this.english = english;
	}
	/**
	 * @return the math
	 */
	public double getMath() {
		return math;
	}
	/**
	 * @param math the math to set
	 */
	public void setMath(double math) {
		this.math = math;
	}

	public String toString() {
		return "Score [china=" + china + ", english=" + english + ", math=" + math + "]";
	}
	
	
}

class Student {
	private String name;
	private int age;
	private Score score;
	private static String classNo="1802";
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age, Score score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the classNo
	 */
	public static String getClassNo() {
		return classNo;
	}
	/**
	 * @param classNo the classNo to set
	 */
	public static void setClassNo(String classNo) {
		Student.classNo = classNo;
	}
	/**
	 * @return the score
	 */
	public Score getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(Score score) {
		this.score = score;
	}

	
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	
}



