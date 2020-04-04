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
 * ��ʾLocalTimeʹ�÷�ʽ
 */
public class TestLocalTime {
	public static void main(String[] args) {
		/*
		 * Set<String> set = ZoneId.getAvailableZoneIds(); Iterator<String> iterator =
		 * set.iterator(); iterator.forEachRemaining(System.out::println);
		 */

		// ��ȡ��ǰʱ��
		Clock clock = Clock.systemDefaultZone();

		LocalTime time = LocalTime.now();

		LocalTime time2 = LocalTime.now(clock);
		System.out.println(time);
		System.out.println(time2);

		// ����ʱ����ʾʱ��

		LocalTime localTime = LocalTime.now(ZoneId.of("Europe/Paris"));
		LocalTime localTime2 = LocalTime.now(ZoneId.of("Indian/Cocos"));
		System.out.println("ʱ����Europe/Paris��" + localTime);
		System.out.println("ʱ����Indian/Cocos��" + localTime2);

		// LocalTime�ṩ���ֹ����������򻯶���Ĵ�������������ʱ���ַ���
		LocalTime localTime3 = LocalTime.of(22, 12, 11);
		System.out.println(localTime3);
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.GERMAN);
		LocalTime parse = LocalTime.parse("15:39", formatter);
		System.out.println(parse);

	}
}
