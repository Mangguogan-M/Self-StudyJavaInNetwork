package day08;

//����ʱ��JVM��PhoneDemo����Ϣ���뷽������
public class PhoneDemo {
	public static void main(String[] args) {// main����������뷽����

		// �����ֻ�����
		Phone p = new Phone();// p �����ã����Էŵ�ջ���У�Phone���Զ������Ӧ�÷ŵ�������

		p.name = "��Ϊ";
		p.price = 3999;
		p.color = "��ɫ";

		p.call("����");
		p.sendMessage();
		p.playGame();

		p.show();

	}
}
