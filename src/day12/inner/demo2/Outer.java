package day12.inner.demo2;

//��ʾ�ֲ��ڲ���
public class Outer {// �ⲿ��

	private String str1 = "Outer���е�str1";
	private String str2 = "Outer���е�str2";

	// ����һ���ⲿ�෽��
	public void print() {
		System.out.println("Outer���е�print����");
	}

	static {
		class d {
		} // �ֲ��ڲ���
	}

	public void method() {

		// ������ʹ��֮ǰ����
		class Inner {
			private String str1 = "Inner���е�str1";

			// �ڲ����Ա�������ⲿ���Ա
			public void visitOuter() {
				System.out.println(str1);
				System.out.println(str2);
				print();// ֱ�������ⲿ�෽��
			}

		}

		// �ֲ��ڲ���ֻ���ڶ������ķ�����������ʹ��
		// ֻ��ʹ��abstract\final���� �������ⲿ������
		Inner in = new Inner();
		in.visitOuter();
	}

}
