package day18_Set.demo1;

import java.util.Set;
import java.util.TreeSet;

/*
 * ʵ��ʹ��TreeSet���Ͻ��д洢���ݲ�����
 * 
 * 		����TreeSet���϶��������д洢180��169��157��169��185���ѧ����ߣ����������ѯ�����
 */
public class TestTreeSet {
	public static void main(String[] args) {

		// ����TreeSet����
		Set<Integer> set = new TreeSet<>();

		// ���Ԫ��
		set.add(180);
		set.add(169);
		set.add(157);
		set.add(169);
		set.add(185);

		for (Integer integer : set) {
			System.out.println(integer);
		}

	}
}
