package day16_ObjectClass.demo5;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 泛型通配符<?>
		任意类型，如果没有明确，那么就是Object以及任意的Java类了
	? extends E
		向下限定，E及其子类
	? super E
		向上限定，E及其父类
 */
public class Case {
	public static void main(String[] args) {
		// Collection<?> c = new ArrayList<?>();

		Collection<Object> c1 = new ArrayList<Object>();
		// 泛型如果明确写的时候，前后必须一致
		/*
		 * Collection<Object> c2 = new ArrayList<Animal>(); Collection<Object> c3 = new
		 * ArrayList<Dog>(); Collection<Object> c4 = new ArrayList<Cat>();
		 */

		Collection<?> c11 = new ArrayList<Object>();
		// ? 表示任意的类型都是可以的
		Collection<?> c22 = new ArrayList<Animal>();
		Collection<?> c33 = new ArrayList<Dog>();
		Collection<?> c44 = new ArrayList<Cat>();

		// Collection<? extends Animal> c111 = new ArrayList<Object>();
		// ？ extends E ：向下限定，E以及子类
		Collection<? extends Animal> c222 = new ArrayList<Animal>();
		Collection<? extends Animal> c333 = new ArrayList<Dog>();
		Collection<? extends Animal> c444 = new ArrayList<Cat>();

		Collection<? super Animal> c1111 = new ArrayList<Object>();
		// ？ super E ：向上限定，E以及父类
		Collection<? super Animal> c2222 = new ArrayList<Animal>();
		// Collection<? super Animal> c3333 = new ArrayList<Dog>();
		// Collection<? super Animal> c4444 = new ArrayList<Cat>();

	}
}

class Animal {

}

class Dog extends Animal {

}

class Cat extends Animal {

}
