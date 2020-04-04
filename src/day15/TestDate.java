package day15;

import java.util.Date;

public class TestDate {
	public static void main(String[] args) {

		// 1.使用无参的方式构造对象
		Date d1 = new Date();
		System.out.println(d1); // 自动调用toString() 系统时间

		// 2.使用有参的方法构造对象
		Date d2 = new Date(1000);
		System.out.println("d2=" + d2);// Thu Jan 01 08:00:01 CST 1970

		System.out.println("--------------------");
		// 3.使用有参的构造方法
		/*
		 * year - 减 1900 的年份。 month - 0-11 之间的月份。 date - 一月中 1-31 之间的某一天。 hrs - 0-23
		 * 之间的小时数。 min - 0-59 之间的分钟数。 sec - 0-59 之间的秒数。
		 */
		Date d3 = new Date(2008 - 1900, 8 - 1, 8, 20, 8, 8);
		System.out.println(d3);

		System.out.println("---------------------");
		// 使用getTime()和setTime()方法
		long time = d1.getTime();
		System.out.println("当前系统时间距离1970 年 1 月 1 日0时0分0秒的毫秒数" + time);

		Date d4 = new Date(time);
		System.out.println(d4);

		d2.setTime(2000);
		System.out.println("d2=" + d2);

	}
}
