package day18_Set.demo1;

import java.util.LinkedHashSet;

/*
 * ��ʾ LinkedHashSet
 */
public class LinkedHashSetTest {
	public static void main(String[] args) {

		// 1.����Set�����޶��洢Ԫ�ص�����ΪString����
		LinkedHashSet<String> set = new LinkedHashSet<>();

		set.add("��������");
		set.add("�������ս");
		set.add("�����ȷ�");
		set.add("����������");
		set.add("�������ս");

		for (String string : set) {
			System.out.println(string);
		}

	}
}
