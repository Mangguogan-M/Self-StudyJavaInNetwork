package day12.inner.demo4;

import day12.inner.demo4.Outer.Inner;

public class TestOuter {
	public static void main(String[] args) {

		// ��������ڲ�����߾�̬Ƕ�������
		// ���ȴ����ⲿ��Ķ���
		Inner inner = new Outer.Inner();

		inner.show();

	}
}
