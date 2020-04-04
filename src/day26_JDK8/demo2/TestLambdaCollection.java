package day26_JDK8.demo2;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Consumer;

/*
 * Lambda表达式操作集合
 * 
 * 
 * Java 8 为Interable接口新增了一个forEach默认方法，该方法所需参数的类型是一个函数式接口，而Iterable接口是Collection接口的父接口，
 * 因此Collection集合可以直接调用该方法
 * 
 */
public class TestLambdaCollection {
	public static void main(String[] args) {

		// 创建一个集合
		Collection<String> c = new HashSet<>();
		c.add("123");
		c.add("456");
		c.add("789");

		for (String string : c) {
			System.out.println(string);
		}

		/*
		 * 当程序调用Iterable的forEach(Consumer action)遍历集合元素，程序会依次将集合元素传给Consumer
		 * accept(T)方法*该接口中唯一的抽象方法。 正因为Consumer是函数式接口，因此可以使用Lambda表达式来遍历集合
		 */
		c.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println("集合元素:" + t);
			}
		});

		// 调用forEach()方法遍历集合
		c.forEach(t -> System.out.println("迭代集合元素:" + t));

		/*
		 * JDK8中有双冒号用法，就是把方法当作参数传到stream内部，使stream的每个元素都传入到该方法里面执行。
		 * 
		 * 类名::方法名 注意：是方法名 ，后面没有括号"()"
		 * 
		 * 例如： 表达式： person -> person.getAge() 可以替换成 Person::getAge
		 * 
		 * 表达式 () -> new HashMap<>(); 可以替换成 HashMap::new
		 * 
		 */
		c.forEach(System.out::println);

	}
}
