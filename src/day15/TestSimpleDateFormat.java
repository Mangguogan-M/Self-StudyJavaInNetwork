package day15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {
	public static void main(String[] args) throws ParseException {

		// 1.按照默认方式打印日期
		Date d1 = new Date();
		System.out.println(d1);// 默认格式打印

		// 2.按照指定的格式来打印日期

		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH时mm分ss秒");
		// 实现将d1的数值按照sdf中的格式来转换为String类型
		String format = sdf.format(d1);
		System.out.println(format);

		// 实现将str的数值按照sdf的格式转换为Date类型
		Date d2 = sdf.parse(format);
		System.out.println(d2);

	}
}
