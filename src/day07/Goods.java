package day07;

/*
 * ��Ʒ��
 */
public class Goods {

	// ����/��Ա�������£�
	String name;// ��Ʒ����
	double price;// ��Ʒ�۸�
	int number;// ��Ʒ����
	String tname;// ��Ʒ������

	// ��Ա������������Ʒ����
	String getName() {
		return "����";
	}

	double getPrice() {
		return 399.0;
	}

	int getNumber() {
		return 10;
	}

	// ����һ����Ա���� ����Ϊshow ��ʾ�û�����Ĳ���
	void show(String name, double price) {
		System.out.println("����Ĳ����ǣ�" + name + "  " + price);

	}

}
