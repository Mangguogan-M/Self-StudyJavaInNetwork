package day08;

/*
 * �ֻ���
		������
			���֡��۸���ɫ
		��Ϊ��
			��绰
			������Ϣ
			����Ϸ
 */
//�ֻ���
public class Phone {// ���������д��Ա�����ͳ�Ա����
	// ����ʱ��jvmPhone����Ϣ���뵽������
	// ��Ա����
	String name;// ���� //new Phoneʵ���� name���÷���ջ���У� name������뵽����
	int price;// �۸�
	String color;// ��ɫ

	// ��Ϊ / ����
	void call(String name) {
		System.out.println("��绰��" + name);
	}

	// ����Ϣ
	void sendMessage() {
		System.out.println("����Ϣ....");
	}

	// ����Ϸ
	void playGame() {
		System.out.println("����Ϸ....");
	}

	/* ��� */
	void show() {// show����������뷽�����
		System.out.println(name + " " + price + " " + color);
	}

}
