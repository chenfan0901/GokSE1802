/**
 * <p>Title: HomeWork01.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day09;

public class HomeWork01 {
	public static void main(String[] args) {
		MyTime mytime=new MyTime(1, 20, 34);
		System.out.println(mytime.toString());
	}
}
class MyTime{
	int hour;
	int minute;
	int second;
	
	public MyTime(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	/**
	 * @return the hour
	 */
	public int getHour() {
		return hour;
	}

	/**
	 * @param hour the hour to set
	 */
	public void setHour(int hour) {
		this.hour = hour;
	}

	/**
	 * @return the minute
	 */
	public int getMinute() {
		return minute;
	}

	/**
	 * @param minute the minute to set
	 */
	public void setMinute(int minute) {
		this.minute = minute;
	}

	/**
	 * @return the second
	 */
	public int getSecond() {
		return second;
	}

	/**
	 * @param second the second to set
	 */
	public void setSecond(int second) {
		this.second = second;
	}
	
	public String toString() {
		return "HomeWork01[hour:"+hour+",minute:"+minute+"second:"+second+"]";
	}
}
