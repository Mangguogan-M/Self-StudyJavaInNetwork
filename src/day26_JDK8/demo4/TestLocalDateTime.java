package day26_JDK8.demo4;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
 * zonedDateTime ���� ISO 8601��ʽ
 * 		���磺01/05/12 ������ζ��2012��1��5��
 */
public class TestLocalDateTime {
	public static void main(String[] args) {

		Clock clock = Clock.systemDefaultZone();

		LocalDateTime dateTime = LocalDateTime.now();
		LocalDateTime dateTime2 = LocalDateTime.now(clock);
		System.out.println(dateTime);
		System.out.println(dateTime2);

		// �����Ҫ��ȡ�ض�ʱ��date/time��Ϣ����ʹ��zonedDateTime
		ZonedDateTime dateTime3 = ZonedDateTime.now();
		ZonedDateTime dateTime4 = ZonedDateTime.now(clock);
		ZonedDateTime dateTime5 = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(dateTime3);
		System.out.println(dateTime4);
		System.out.println(dateTime5);

		// Duration�� ��ȡʱ���
		LocalDateTime from = LocalDateTime.of(2014, Month.APRIL, 16, 0, 0, 0);
		LocalDateTime to = LocalDateTime.of(2015, Month.APRIL, 16, 23, 59, 59);

		Duration between = Duration.between(from, to);
		System.out.println(between.toDays());
		System.out.println(between.toHours());
		// ����������ڼ���2014��4��16�ú�2015��4��16��֮���������Сʱ��
	}

}
