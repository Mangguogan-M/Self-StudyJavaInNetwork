package day18_Set.demo1;

import java.util.*;

/*
 * HashSetʹ��
 */
public class HashSetTest {
	public static void main(String[] args) {

		// 1.����Set����
		Set<String> set = new HashSet<String>();

		// 2.�򼯺�����ӳ�Ʊ��Ϣ
		set.add("����---����");
		set.add("�ӱ�---����");
		set.add("ɽ��---��ͬ");
		set.add("�ӱ�---����");

		System.out.println("--------��һ�ֱ������� ��ǿforѭ��-------");
		for (String string : set) {
			System.out.println(string);
		}

		System.out.println("--------�ڶ��ֱ������� ����������-------");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}

		System.out.println("--------�����ֱ������� toString-------");
		System.out.println(set);

		System.out.println("--------�����ֱ������� ��ͨforѭ��-------");

		// set����������ģ���Ϊû���±�
		for (int i = 0; i < set.size(); i++) {

		}

	}
}
