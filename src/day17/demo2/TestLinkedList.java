package day17.demo2;

import java.util.LinkedList;

/*
 * �洢������������Ϣ����ȡ��һ�������һ������ӡ������Ϣ
 * 		ͨ��List�ӿ�ʵ����LinkedListʵ�ָ�����
 * 		��ȡ��һ��Ԫ��
 * 		��ȡ�ڶ���Ԫ��
 * 		ɾ��������Ϣ
 */
public class TestLinkedList {
	public static void main(String[] args) {

		LinkedList<Dog> list = new LinkedList<>();

		Dog d1 = new Dog("СС", "����");
		Dog d2 = new Dog("����", "����");
		Dog d3 = new Dog("���", "���͹�");

		list.add(d1);
		list.add(d2);
		list.add(d3);

		for (int i = 0; i < list.size(); i++) {
			Dog dog = list.get(i);
			System.out.println(dog);
		}

		Dog dog = list.getFirst();
		System.out.println("��һ�����ǣ�" + dog);

		Dog dog2 = list.get(1);
		System.out.println("�ڶ������ǣ�" + dog2);

		Dog remove = list.remove(2);
		System.out.println("��ɾ���Ĺ��ǣ�" + remove);

		Dog dog3 = list.removeLast();
		System.out.println("��ɾ�������һ�����ǣ�" + dog3);

	}
}
