package day26_JDK8.demo2;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Consumer;

/*
 * Lambda���ʽ��������
 * 
 * 
 * Java 8 ΪInterable�ӿ�������һ��forEachĬ�Ϸ������÷������������������һ������ʽ�ӿڣ���Iterable�ӿ���Collection�ӿڵĸ��ӿڣ�
 * ���Collection���Ͽ���ֱ�ӵ��ø÷���
 * 
 */
public class TestLambdaCollection {
	public static void main(String[] args) {

		// ����һ������
		Collection<String> c = new HashSet<>();
		c.add("123");
		c.add("456");
		c.add("789");

		for (String string : c) {
			System.out.println(string);
		}

		/*
		 * ���������Iterable��forEach(Consumer action)��������Ԫ�أ���������ν�����Ԫ�ش���Consumer
		 * accept(T)����*�ýӿ���Ψһ�ĳ��󷽷��� ����ΪConsumer�Ǻ���ʽ�ӿڣ���˿���ʹ��Lambda���ʽ����������
		 */
		c.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println("����Ԫ��:" + t);
			}
		});

		// ����forEach()������������
		c.forEach(t -> System.out.println("��������Ԫ��:" + t));

		/*
		 * JDK8����˫ð���÷������ǰѷ���������������stream�ڲ���ʹstream��ÿ��Ԫ�ض����뵽�÷�������ִ�С�
		 * 
		 * ����::������ ע�⣺�Ƿ����� ������û������"()"
		 * 
		 * ���磺 ���ʽ�� person -> person.getAge() �����滻�� Person::getAge
		 * 
		 * ���ʽ () -> new HashMap<>(); �����滻�� HashMap::new
		 * 
		 */
		c.forEach(System.out::println);

	}
}
