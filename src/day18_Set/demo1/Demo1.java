package day18_Set.demo1;

import java.util.*;

/*
 * ͨ��HashSet�洢Student���͵�Ԫ��
 */
public class Demo1 {
	public static void main(String[] args) {

		// 1.����Set�����޶�Ԫ������ΪStudent����
		Set<Student> set = new HashSet<>();

		// �򼯺������ѧ����Ϣ
		set.add(new Student("���", 18));
		set.add(new Student("����", 20));
		set.add(new Student("�Բ�", 28));
		set.add(new Student("���", 19));

		/*
		 * Ϊʲô֮ǰ�ظ��ַ���û�д��HashSet�����У� String�౾���Ѿ���дHashCode��equals����
		 * ��дhashCode���ڻ�ȡԪ�صĴ洢λ�� ��дequal����������Ԫ��λ����ͬ��ʱ��Ƚ�����Ԫ���Ƿ����
		 */
		for (Student student : set) {
			System.out.println(student);
		}

	}
}
