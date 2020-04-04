package day17.demo2;

import java.util.LinkedList;

/*
 * 存储多条狗狗的信息，获取第一条和最后一条，打印狗狗信息
 * 		通过List接口实现类LinkedList实现该需求
 * 		获取第一个元素
 * 		获取第二个元素
 * 		删除狗狗信息
 */
public class TestLinkedList {
	public static void main(String[] args) {

		LinkedList<Dog> list = new LinkedList<>();

		Dog d1 = new Dog("小小", "二哈");
		Dog d2 = new Dog("中中", "藏獒");
		Dog d3 = new Dog("大大", "哈巴狗");

		list.add(d1);
		list.add(d2);
		list.add(d3);

		for (int i = 0; i < list.size(); i++) {
			Dog dog = list.get(i);
			System.out.println(dog);
		}

		Dog dog = list.getFirst();
		System.out.println("第一条狗是：" + dog);

		Dog dog2 = list.get(1);
		System.out.println("第二条狗是：" + dog2);

		Dog remove = list.remove(2);
		System.out.println("被删除的狗是：" + remove);

		Dog dog3 = list.removeLast();
		System.out.println("被删除的最后一条狗是：" + dog3);

	}
}
