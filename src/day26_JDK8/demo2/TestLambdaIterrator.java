package day26_JDK8.demo2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
 * JDK8��������forEachRemaining(Consumer action)�������÷�������Ҫ��Consumer����ͬ���Ǻ���ʽ�ӿڡ�
 * ���������Iterator��forEachRemaining(Consumer action)��������Ԫ�ء�
 * �����һ�ν�����Ԫ�ش��ݸ�Consumer��accept(T t)����(�ýӿ���Ψһ�ĳ��󷽷�)
 */
public class TestLambdaIterrator {

	public static void main(String[] args) {

		Collection<String> c = new HashSet<>();
		c.add("������");
		c.add("�����");
		c.add("С��");
		Iterator<String> iterator = c.iterator();
		iterator.forEachRemaining(System.out::println);

	}

}
