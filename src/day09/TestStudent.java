package day09;

/*
 * ��дʵ��Student��Ĳ���
 */
public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.show();

		System.out.println("--------------");
		Student s2 = new Student("�绨", 18, 1);
		// ��������û����дshow()����ʱ�����ôӸ����м̳е�show()����
		// ��������дshow()�����������������д���show()����
		s2.show();
	}
}
