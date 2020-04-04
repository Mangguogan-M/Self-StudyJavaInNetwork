package day26_JDK8.demo4;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
 * zonedDateTime 保留 ISO 8601格式
 * 		例如：01/05/12 可能意味着2012年1月5日
 */
public class TestLocalDateTime {
	public static void main(String[] args) {

		Clock clock = Clock.systemDefaultZone();

		LocalDateTime dateTime = LocalDateTime.now();
		LocalDateTime dateTime2 = LocalDateTime.now(clock);
		System.out.println(dateTime);
		System.out.println(dateTime2);

		// 如果想要获取特定时区date/time信息可以使用zonedDateTime
		ZonedDateTime dateTime3 = ZonedDateTime.now();
		ZonedDateTime dateTime4 = ZonedDateTime.now(clock);
		ZonedDateTime dateTime5 = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(dateTime3);
		System.out.println(dateTime4);
		System.out.println(dateTime5);

		// Duration类 获取时间差
		LocalDateTime from = LocalDateTime.of(2014, Month.APRIL, 16, 0, 0, 0);
		LocalDateTime to = LocalDateTime.of(2015, Month.APRIL, 16, 23, 59, 59);

		Duration between = Duration.between(from, to);
		System.out.println(between.toDays());
		System.out.println(between.toHours());
		// 这个例子用于计算2014年4月16好和2015年4月16日之间的天数和小时数
	}

}
