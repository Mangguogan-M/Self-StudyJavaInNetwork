package day26_JDK8.demo3;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
 * Java8�ĺ���ʽ�����Ҫ��4��ӿڣ�
 * 	1.Predicate		(�жϺ�����������Ҳ�з��أ�����true  or   false)
	2.Function		(������Ҳ�з���)
	3.Consumer		(����������������Ҫ��������޷���ֵ)
	4.Supplier		(�����������߲���Ҫ�������������з���ֵ)
 */
public class TestFunction2 {
	public static void main(String[] args) {
		// Predicate (�жϺ�����������Ҳ�з��أ�����true or false)
		Predicate<String> p = (e) -> e.equals("null");
		boolean b = p.test("aas");
		System.out.println(b);

		// Function (������Ҳ�з���)
		// ����һ���������������һ�����
		// ��������
		// T -���ܵ���������
		// R -�����Ľ������
		Function<Integer, Boolean> f = (t) -> t > 3;
		System.out.println(f.apply(4));

		// Consumer (����������������Ҫ��������޷���ֵ)
		Consumer<String> c = (e) -> System.out.println(e);
		c.accept("���Consumer");

		// Supplier (�����������߲���Ҫ�������������з���ֵ)

		Supplier<String> s = () -> {
			return "www";
		};
		System.out.println(s.get());

		// bi = binary ��Ԫ����˼ ������������������
		// �����˽���������������Ĳ��������ҷ����κν��
		BiConsumer<String, Integer> bc = (e, ee) -> System.out.println(e + ee);
		bc.accept("aaa", 20);
	}
}
