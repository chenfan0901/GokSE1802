/**
 * <p>Title: BankUser.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day06;

public class BankUser {
	public String userName; // 用户名
	public String password; // 密码
	public double money;    // 钱
	public int age;         // 年龄
	public String phone;    //  电话
	
	public BankUser() {
		
	}
	public BankUser(String userName, String password, double money, int age, String phone) {
		this.userName = userName;
		this.password = password;
		this.money = money;
		this.age = age;
		this.phone = phone;
	}
	
	
	public String toString() {
		return "BankUser [userName=" + userName + ", password=" + password + ", money=" + money + ", age=" + age
				+ ", phone=" + phone + "]";
	}
	
	
	
	
	
}
