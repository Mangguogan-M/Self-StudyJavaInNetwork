package day26_JDK8.demo4;

import java.time.Clock;
import java.time.LocalDate;

public class TestLocalDate {
	public static void main(String[] args) {

		Clock clock = Clock.systemDefaultZone();
		LocalDate now = LocalDate.now();
		LocalDate now2 = LocalDate.now(clock);
		System.out.println(now);
		System.out.println(now2);
	}
}
