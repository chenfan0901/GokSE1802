/**
 * <p>Title: UserBean.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day08;

import java.io.Serializable;

public class UserBean implements Serializable{
	private static final long serialVersionUID = -1604453089238032398L;
	/*
	 *javaBean:  满足一定规范的java类，
	 *			 作用作为java不同类之间传输数据的一个通用组件
	 *
	 *	javaBean规范： 1、含有公共的无参构造器
	 *				  2、所有属性私有
	 *				  3、所有的私有属性都通过对应的公共setXX()
	 *					  和getXX()进行赋值和取值
	 *				  4、实现Serializable接口	
	 *
	 *		java的三大特性： 封装，继承，多态
	 */
	private String userName;
	private String password;
	private int age;
	private String phone;
	private double money;
	
	
	public UserBean() {
		super();
	}
	//通过set方法对私有属性赋值
	public void setUserName(String userName) {
		this.userName=userName;
	}
	//通过get方法对私有属性取值
	public String getUserName() {
		return userName;
	}
	
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) throws Exception{
		if(age>150||age<0) {
			throw new Exception();
		}
		this.age = age;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
}
