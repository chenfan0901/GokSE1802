/**
 * <p>Title: Demo03.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day04;

public class Demo03 {
	/*
	 *面向对象：   它是一种编程思想，是我们审视问题解决问题的一种角度
	 */
	//打印一个员工的信息
//	public static void printEmpInfo(String userName,int age,String phoneNo,String address) {
//		System.out.println("姓名："+userName);
//		System.out.println("年龄："+age);
//		System.out.println("电话号码："+phoneNo);
//		System.out.println("地址："+address);
//	}
	//采用面向对象的思想       打印一个员工的信息， 需要一个员工，我们就给你一个员工对象
	public static void printEmpInfo(Emp emp) {
		System.out.println("姓名："+emp.userName);
		System.out.println("年龄："+emp.age);
		System.out.println("电话号码："+emp.phoneNo);
		System.out.println("地址："+emp.address);
	}
	
	//打印多个员工
	public static void printEmpInfos(Emp[] emps) {
		for(int i=0;i<emps.length;i++) {
			System.out.println("姓名："+emps[i].userName+", 年龄："+emps[i].age+",电话号码："+emps[i].phoneNo+",地址："+emps[i].address);
		}
	}
	
	public static void main(String[] args) {
// 面向过程		
//		String userName="陈凡";
//		int age=18;
//		String phoneNo="1232132131";
//		String address="成都";
//		printEmpInfo(userName, age, phoneNo, address);

			
// 面向对象		
		//根据员工类，  将员工这个个体创建
//		Emp emp=new Emp();
//		emp.userName="陈凡";
//		emp.age=19;
//		emp.phoneNo="1232132131";
//		emp.address="成都";
//		printEmpInfo(emp);
//		
		
		// 模拟从数据库中取出了3条员工的数据
		String userName1="陈凡";
		int age1=18;
		String phoneNo1="1232136731";
		String address1="成都";
		
		String userName2="李四";
		int age2=18;
		String phoneNo2="1232132131";
		String address2="厦门";
		
		String userName3="张三";
		int age3=18;
		String phoneNo3="1232132131";
		String address3="福州";
		
		// 创建 3个员工对象（个体）
		Emp emp1=new Emp(); 
		emp1.userName=userName1;
		emp1.age=age1;
		emp1.phoneNo=phoneNo1;
		emp1.address=address1;
		
		Emp emp2=new Emp();
		emp2.userName=userName2;
		emp2.age=age2;
		emp2.phoneNo=phoneNo2;
		emp2.address=address2;
		
		Emp emp3=new Emp();
		emp3.userName=userName3;
		emp3.age=age3;
		emp3.phoneNo=phoneNo3;
		emp3.address=address3;
		
		Emp[] emps=new Emp[3];
		emps[0]=emp1;
		emps[1]=emp2;
		emps[2]=emp3;
		
		printEmpInfos(emps);
	}

}
