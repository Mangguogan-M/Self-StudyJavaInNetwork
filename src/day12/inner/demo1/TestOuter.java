package day12.inner.demo1;

import day12.inner.demo1.Outer.Inner;

public class TestOuter {
	public static void main(String[] args) {
		// ���Ҫ�����ڲ��࣬��ô�ڴ�֮ǰ��Ҫ�ȴ����ⲿ�����

		// �����ⲿ�����
		Outer o = new Outer();

		// �����ڲ���
		Inner inner = o.new Inner();
		inner.show();

	}
}
