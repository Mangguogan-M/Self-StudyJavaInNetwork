package day26_JDK8.demo4;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/*
 * 演示LocalTime使用方式
 */
public class TestLocalTime {
	public static void main(String[] args) {
		/*
		 * Set<String> set = ZoneId.getAvailableZoneIds(); Iterator<String> iterator =
		 * set.iterator(); iterator.forEachRemaining(System.out::println);
		 */

		// 获取当前时间
		Clock clock = Clock.systemDefaultZone();

		LocalTime time = LocalTime.now();

		LocalTime time2 = LocalTime.now(clock);
		System.out.println(time);
		System.out.println(time2);

		// 按照时区显示时间

		LocalTime localTime = LocalTime.now(ZoneId.of("Europe/Paris"));
		LocalTime localTime2 = LocalTime.now(ZoneId.of("Indian/Cocos"));
		System.out.println("时区：Europe/Paris：" + localTime);
		System.out.println("时区：Indian/Cocos：" + localTime2);

		// LocalTime提供多种工厂方法来简化对象的创建，包括解析时间字符串
		LocalTime localTime3 = LocalTime.of(22, 12, 11);
		System.out.println(localTime3);
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.GERMAN);
		LocalTime parse = LocalTime.parse("15:39", formatter);
		System.out.println(parse);

	}
}
