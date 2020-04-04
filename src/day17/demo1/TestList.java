package day17.demo1;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// ��ȡList/Collection���ϵ�����
		// List list = new List(); error �ӿڲ��ܹ������

		// �ӿ����͵�����ָ��ʵ����Ķ����γ��˶�̬
		List c1 = new ArrayList();

		// �򼯺�c1�����Ԫ��
		boolean b1 = c1.add(new Integer(1));
		System.out.println("b1 = " + b1);

		// �Զ�����toString(),�������Զ����
		// �ڱ���׶ε��ø���ķ����������н׶ε���������д�Ժ�ķ�����ArrayList��
		// toString()Ĭ�ϴ�ӡ�ĸ�ʽΰ��[Ԫ��1,Ԫ��2,.....]
		System.out.println(c1);

		b1 = c1.add(new String("two"));
		System.out.println(b1);
		System.out.println("c1 = " + c1);// [1,two]

		b1 = c1.add(new Student(1001, "zhangsan", 30));
		System.out.println(b1);
		System.out.println("c1 = " + c1);
		System.out.println("---------------------------");
		// addAll() ��ָ�������е�Ԫ����ӵ����ø÷����ļ�����
		// ׼����һ������
		List c2 = new ArrayList();
		c2.add(3);// �������Զ�װ�似�� int=>Integer
		System.out.println("c2 =" + c2);
		c2.add("four");
		System.out.println("c2 =" + c2);
		System.out.println("��ǰ���ϵ�Ԫ�ظ����ǣ�" + c2.size());// 2
		System.out.println("��ǰ���ϵ�Ԫ�ظ����ǣ�" + c1.size());// 3

		System.out.println("----------------------------");
		// ������c2�����е�Ԫ����ӵ�����c1�С�
		b1 = c1.addAll(c2);
		System.out.println("b1 =" + b1);
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);

		System.out.println("---------------------------");
		// 4. contains(Object o) �жϼ������Ƿ��������ָ���ĵ���Ԫ��
		// 5. containsAll(Collection<?> c) ��ʾ�жϼ������Ƿ����ָ��Ԫ�ص�����

		// �жϼ���c1���Ƿ��������ָ���ĵ���Ԫ��
		b1 = c1.contains(new Integer(1));
		System.out.println("b1 = " + b1);
		b1 = c1.contains(new Integer(2));
		System.out.println("b1 = " + b1);
		b1 = c1.contains(new String("two"));
		System.out.println("b1 = " + b1);

		// contains������ԭ�������������equals()�����뼯���е�Ԫ��һ��һ���Ƚ�
		// ��Student�࣬û����дequals()����ʱ����Ƚϵ��ǵ�ַ����˷��ؽ��false
		// ��Student�࣬��дequals()����ʱ����Ƚ϶�������ݣ����ؽ��true
		b1 = c1.contains(new Student(1001, "zhangsan", 30));
		System.out.println("b1 = " + b1);

		System.out.println("---------------------------");

		// ������c2�е�Ԫ��һ�����ó�����c1�н��бȽ�
		b1 = c1.containsAll(c2);
		System.out.println("b1 =" + b1);// true

		//// �жϼ���c1���Ƿ����c2�������
		b1 = c1.contains(c2);// false
		System.out.println("b1 =" + b1);

		System.out.println("---------------------------");
		/*
		 * 6. remove(int index) �Ƴ��б���ָ��λ�õ�Ԫ�� 7. removeAll(Collection<?> c) ���б����Ƴ�ָ��
		 * collection �а�����������Ԫ��
		 */

		// ʵ�ּ���c1�е���Ԫ�ص�ɾ��
		b1 = c1.remove(new String("2"));
		System.out.println("b1 =" + b1);

		b1 = c1.remove(new String("two"));
		System.out.println("b1 =" + b1);
		System.out.println("c1 =" + c1);
		System.out.println("---------------------------");
		// ʵ�ּ���c1�ж��Ԫ�ص�ɾ��
		// ��ʾ�Ӽ���c1�н�����c2��Ԫ��һ��һ��ɾ��
		b1 = c1.removeAll(c2);
		System.out.println(b1);

		b1 = c1.remove(c2);
		System.out.println(b1);
		System.out.println(c1);

		System.out.println("---------------------------");

		// ʵ�ּ���c1������Ԫ�ص�ɾ��
		/*
		 * c1.clear(); System.out.println("c1 ="+c1); System.out.println(c1.isEmpty());
		 * System.out.println(c1.size());
		 */

		System.out.println("---------------------------");
		// set(int index, E element)
		System.out.println("c1=" + c1);
		c1.set(0, "���");
		System.out.println("c1=" + c1);

		System.out.println("-----------------------------");
		// ������ת��Ϊ����
		Object[] array = c1.toArray();

		System.out.println("----------------------");
		System.out.println("c1=" + c1);

		// ����c1��c2�Ľ�����������c1�У���c1�����е����ݷ����˸ı䷵��true
		b1 = c1.retainAll(c2);
		System.out.println("b1=" + b1);
		System.out.println(c1);

		System.out.println("------------------");
		System.out.println(c2);

		// �����������ϵĽ�������������ǰ������
		// ����c2��c2�Ľ�����������c2�У�c2�е����ݲ������ı䣬��˷���false��
		b1 = c2.retainAll(c2);
		System.out.println("b1 =" + b1);// false
		System.out.println(c2);
	}
}
