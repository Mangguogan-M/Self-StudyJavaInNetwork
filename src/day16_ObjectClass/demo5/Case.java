package day16_ObjectClass.demo5;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ����ͨ���<?>
		�������ͣ����û����ȷ����ô����Object�Լ������Java����
	? extends E
		�����޶���E��������
	? super E
		�����޶���E���丸��
 */
public class Case {
	public static void main(String[] args) {
		// Collection<?> c = new ArrayList<?>();

		Collection<Object> c1 = new ArrayList<Object>();
		// ���������ȷд��ʱ��ǰ�����һ��
		/*
		 * Collection<Object> c2 = new ArrayList<Animal>(); Collection<Object> c3 = new
		 * ArrayList<Dog>(); Collection<Object> c4 = new ArrayList<Cat>();
		 */

		Collection<?> c11 = new ArrayList<Object>();
		// ? ��ʾ��������Ͷ��ǿ��Ե�
		Collection<?> c22 = new ArrayList<Animal>();
		Collection<?> c33 = new ArrayList<Dog>();
		Collection<?> c44 = new ArrayList<Cat>();

		// Collection<? extends Animal> c111 = new ArrayList<Object>();
		// �� extends E �������޶���E�Լ�����
		Collection<? extends Animal> c222 = new ArrayList<Animal>();
		Collection<? extends Animal> c333 = new ArrayList<Dog>();
		Collection<? extends Animal> c444 = new ArrayList<Cat>();

		Collection<? super Animal> c1111 = new ArrayList<Object>();
		// �� super E �������޶���E�Լ�����
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
