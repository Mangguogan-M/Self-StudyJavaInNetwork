package day26_JDK8.demo4;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

/*
 * ��ʾClock���ʹ��
 * 
 * Clock���ṩ�˷��ʵ�ǰ���ں�ʱ��ķ�����Clockʹ��ʱ�������ʵ�ǰ��instant, date��time��Clock�������
		�� System.currentTimeMillis() �� TimeZone.getDefault()��
 */
public class TestClock {
	public static void main(String[] args) throws InterruptedException {
		// �൱��System.currentTimeMillis()
		/*
		 * Clock clock = Clock.systemDefaultZone();//��ȡϵͳĬ��ʱ�� while(true){
		 * System.out.println(clock.instant());//instant ��ȡʱ�ӵĵ�ǰʱ�� Thread.sleep(1000); }
		 */

		Clock clock = Clock.systemDefaultZone();// ��ȡϵͳĬ��ʱ��
		System.out.println("ϵͳʱ������" + clock.instant());
		System.out.println("ʱ�����:" + clock.millis());

		final Clock clock2 = Clock.systemUTC();// ��ȡϵͳʱ�ӣ�����ʱ��ת����ʹ��UTCʱ�������ں�ʱ��
		System.out.println("ϵͳʱ������" + clock2.instant());
		System.out.println("ʱ�����:" + clock2.millis());

		// ZoneId��ʱ����
		Set<String> set = ZoneId.getAvailableZoneIds();// ��ȡ���������ʶ���ļ���
		Iterator<String> iterator = set.iterator();
		iterator.forEachRemaining(System.out::println);

		Clock clock3 = Clock.system(ZoneId.of("Europe/Paris"));
		System.out.println("ϵͳʱ������" + clock3.instant());
		System.out.println("ʱ�����:" + clock3.millis());

		// now() ��ϵͳʱ���л�ȡ��ǰʱ��
		Clock clock4 = Clock.fixed(Instant.now(), ZoneId.of("Asia/Shanghai"));
		System.out.println("ʱ�����:" + clock4.millis());
		Thread.sleep(1000);
		System.out.println(clock4.millis());// ���� ʱ������һ���㲻��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sdf.format(clock4.millis());
		System.out.println(format);

		// Date������һ���µķ���toInstant(),���Խ�Dateת������ʵ���������Ϳ���������Date�л����µ�API��
		// Instant��Ҳ�������������ϵ�Date����
		Instant instant = clock4.instant();
		Date from = Date.from(instant);
		System.out.println(from);

	}
}
