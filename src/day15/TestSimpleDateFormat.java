package day15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {
	public static void main(String[] args) throws ParseException {

		// 1.����Ĭ�Ϸ�ʽ��ӡ����
		Date d1 = new Date();
		System.out.println(d1);// Ĭ�ϸ�ʽ��ӡ

		// 2.����ָ���ĸ�ʽ����ӡ����

		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��  HHʱmm��ss��");
		// ʵ�ֽ�d1����ֵ����sdf�еĸ�ʽ��ת��ΪString����
		String format = sdf.format(d1);
		System.out.println(format);

		// ʵ�ֽ�str����ֵ����sdf�ĸ�ʽת��ΪDate����
		Date d2 = sdf.parse(format);
		System.out.println(d2);

	}
}
