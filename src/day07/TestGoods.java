package day07;

public class TestGoods {
	public static void main(String[] args) {

		// ������Ʒ��Ķ���
		Goods goods = new Goods();

		System.out.println("��Ʒ���ƣ�" + goods.getName());
		System.out.println("��Ʒ�۸�" + goods.getPrice());
		System.out.println("��Ʒ������" + goods.getNumber());

		goods.show("������", 999);

	}
}
