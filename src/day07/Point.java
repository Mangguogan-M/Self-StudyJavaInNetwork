package day07;

/*
 * ���ʵ��Point��Ķ���
 */
public class Point {

	int x;// ��������������ĳ�Ա����
	int y;// ��������������ĳ�Ա����

	// �Զ����Ա������ӡ�����������ֵ
	void show() {
		System.out.println("(" + x + "  ,  " + y + ")");
	}

	// �Զ����Ա�����ú���������ϲ���ָ������ֵ���Ǻ�����
	void right(int i) {
		x = x + i;
	}

	public static void main(String[] args) {

		// ��ʾʹ��Point���͵�����ָ��Point���͵Ķ���
		Point p = new Point();
		// ���ó�Ա�������в���
		p.show();

		p.right(10);

		p.show();
	}

}
