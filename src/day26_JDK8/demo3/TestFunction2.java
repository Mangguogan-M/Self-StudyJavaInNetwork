package day26_JDK8.demo3;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
 * Java8的函数式编程主要的4类接口：
 * 	1.Predicate		(判断函数，有输入也有返回，返回true  or   false)
	2.Function		(有输入也有返回)
	3.Consumer		(类类似与消费者需要传入参数无返回值)
	4.Supplier		(类似与生产者不需要传参数，但是有返回值)
 */
public class TestFunction2 {
	public static void main(String[] args) {
		// Predicate (判断函数，有输入也有返回，返回true or false)
		Predicate<String> p = (e) -> e.equals("null");
		boolean b = p.test("aas");
		System.out.println(b);

		// Function (有输入也有返回)
		// 接收一个输入参数，返回一个结果
		// 参数类型
		// T -功能的输入类型
		// R -函数的结果类型
		Function<Integer, Boolean> f = (t) -> t > 3;
		System.out.println(f.apply(4));

		// Consumer (类类似与消费者需要传入参数无返回值)
		Consumer<String> c = (e) -> System.out.println(e);
		c.accept("你好Consumer");

		// Supplier (类似与生产者不需要传参数，但是有返回值)

		Supplier<String> s = () -> {
			return "www";
		};
		System.out.println(s.get());

		// bi = binary 二元的意思 有两个参数的消费者
		// 代表了接收两个输入参数的操作，并且返回任何结果
		BiConsumer<String, Integer> bc = (e, ee) -> System.out.println(e + ee);
		bc.accept("aaa", 20);
	}
}
