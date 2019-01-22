/**
 * <p>Title: BankUser.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day10;

//用户类
public class BankUser {
	public String userName; //用户名
	public String password; //密码
	public double money;    //账户金额
	public int age;         //年龄
	public String phoneNo;  //电话号码
	
	public BankUser() {
		
	}
	public BankUser(String userName, String password, double money, int age, String phoneNo) {
		super();
		this.userName = userName;
		this.password = password;
		this.money = money;
		this.age = age;
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "BankUser [userName=" + userName + ", password=" + password + ", money=" + money + ", age=" + age
				+ ", phoneNo=" + phoneNo + "]";
	}
}
