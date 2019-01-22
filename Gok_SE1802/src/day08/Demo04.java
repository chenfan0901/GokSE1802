/**
 * <p>Title: Demo04.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day08;
public class Demo04 {
	public void test(UserBean user) {
		
		
	}
	public void test1(UserBean user) {
		
	}
	public void test2(UserBean user) {
		
	}
	public void test3(UserBean user) {
		
	}
	public static void main(String[] args) {
		UserBean user=new UserBean();
		user.setUserName("cc");
		try {
			user.setAge(19999);
			
			System.out.println("用户名："+user.getUserName());
			System.out.println("年龄："+user.getAge());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
