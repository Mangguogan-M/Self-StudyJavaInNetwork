package day12.inner.demo3;

public class Outer {// �ⲿ��

	private String str1 = "Outer���е�str1";
	private String str2 = "Outer���е�str2";

	// �����ڲ���
	InterDemo id = new InterDemo() {

		private String str1 = "�����ڲ����str1";

		@Override
		public void print() {
			System.out.println(str1);
			System.out.println(str2);

			// �����Ҫȥ�����ⲿ��ı��� �ⲿ��.this.������
			System.out.println(Outer.this.str1);

		}
	};

	public void show() {
		id.print();
	}

}
