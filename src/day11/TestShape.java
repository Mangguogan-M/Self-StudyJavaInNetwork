package day11;

/*
 * ������
		��״�������ꡢ������
		���Σ����ȡ����
		Բ�Σ��뾶

		дһ������Ҫ����ܴ�ӡ�������ܴ�ӡԲ�Ρ�
 */
public class TestShape {

	// �Զ����Ա��������ӡ����ָ�����εĳ�Ա����ֵ
	// Rect r = new Rect(1, 2, 3, 4);
	/*
	 * public static void draw(Rect r){
	 * 
	 * //����Rect�����Լ���show()���� r.show(); }
	 */

	// �Զ����Ա������ӡ����ָ����Բ�εĳ�Ա����ֵ
	/*
	 * public static void draw2(Circle c){ //����Circle���Լ���show()���� c.show(); }
	 */

	// ���β�����ΪShapeʱ�������Խ��վ��εĶ���ͬʱ�ֿ��Խ���Բ�εĶ���
	public static void draw(Shape s) {
		// �ڱ���׶ε���Shape���show()�����������н׶ε���������д��show()����
		// ��Ȼ���Ƶ���ͬһ��show()���������Ǹ���ʵ�εĲ�ͬ���յ��ò�ͬ�İ汾
		// ������ͬ�Ľ��
		s.show();
	}

	public static void main(String[] args) {
		// ����
		Rect r = new Rect(1, 2, 3, 4);
		TestShape.draw(r);
		// TestShape.draw(r);
		System.out.println("------------------------");
		// Բ��
		Circle c = new Circle(5, 6, 7);
		// TestShape.draw2(c);
		TestShape.draw(c);

	}
}
