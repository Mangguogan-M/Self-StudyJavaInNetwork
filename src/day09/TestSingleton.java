package day09;

//�Զ���TestSingleton�࣬��main����������ֻ�ܵõ�Singleton���е�һ������
public class TestSingleton {
	public static void main(String[] args) {

		/*
		 * Singleton s1 = new Singleton(); Singleton s2 = new Singleton();
		 * System.out.println(s1); System.out.println(s2); System.out.println(s1 ==
		 * s2);//false �ȵ���singleton���е���������
		 */

		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);// true
	}
}
