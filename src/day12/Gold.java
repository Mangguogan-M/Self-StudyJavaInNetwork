package day12;

//�ƽ�
public class Gold implements Money, Metal {

	@Override
	public void shine() {
		System.out.println("�����˽��ɫ�Ĺ�â.....");
	}

	@Override
	public void buy() {
		System.out.println("���˺ö�óԵ�.....");
	}

}
