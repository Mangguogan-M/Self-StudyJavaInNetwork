package day26_JDK8.demo4;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

/*
 * 演示Clock类的使用
 * 
 * Clock类提供了访问当前日期和时间的方法。Clock使用时区来访问当前的instant, date和time。Clock类可以替
		换 System.currentTimeMillis() 和 TimeZone.getDefault()。
 */
public class TestClock {
	public static void main(String[] args) throws InterruptedException {
		// 相当于System.currentTimeMillis()
		/*
		 * Clock clock = Clock.systemDefaultZone();//获取系统默认时区 while(true){
		 * System.out.println(clock.instant());//instant 获取时钟的当前时刻 Thread.sleep(1000); }
		 */

		Clock clock = Clock.systemDefaultZone();// 获取系统默认时区
		System.out.println("系统时间日期" + clock.instant());
		System.out.println("时间毫秒:" + clock.millis());

		final Clock clock2 = Clock.systemUTC();// 获取系统时钟，并将时间转换成使用UTC时区的日期和时间
		System.out.println("系统时间日期" + clock2.instant());
		System.out.println("时间毫秒:" + clock2.millis());

		// ZoneId（时区）
		Set<String> set = ZoneId.getAvailableZoneIds();// 获取可用区域标识集的集合
		Iterator<String> iterator = set.iterator();
		iterator.forEachRemaining(System.out::println);

		Clock clock3 = Clock.system(ZoneId.of("Europe/Paris"));
		System.out.println("系统时间日期" + clock3.instant());
		System.out.println("时间毫秒:" + clock3.millis());

		// now() 从系统时钟中获取当前时刻
		Clock clock4 = Clock.fixed(Instant.now(), ZoneId.of("Asia/Shanghai"));
		System.out.println("时间毫秒:" + clock4.millis());
		Thread.sleep(1000);
		System.out.println(clock4.millis());// 不变 时钟在哪一个点不动
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sdf.format(clock4.millis());
		System.out.println(format);

		// Date类增加一个新的方法toInstant(),可以将Date转化成新实例，这样就可以做到将Date切换到新的API。
		// Instant类也可以用来创建老的Date对象
		Instant instant = clock4.instant();
		Date from = Date.from(instant);
		System.out.println(from);

	}
}
