package day08;

/*
 * ����һ��boy��
 */
public class Boy {
	String name;

	Boy() {
		// ��ʾ���ñ����е����вι���
		// this(); ���޲ι����в�Ҫ��ȥ���õ�ǰ���޲ι��죬��ȻҲ��һ��������ѭ������������ֱ����ʾ����
		this("������");
	}

	Boy(String name) {
		// this(); ��ʾ���ñ������޲ι��췽�� ��������޲��е����в� ����ô���вξͲ�Ҫ�����޲�
		// ����Ȼ������ѭ������Ϊ������֪���ᷢ�����������⣬������ʾ����
		this.name = name;
		this.show();
	}

	void show() {
		System.out.println(this.name);
	}

	public static void main(String[] args) {
		Boy b = new Boy();
		b.show();
		System.out.println("--------------");
		Boy b2 = new Boy();

		System.out.println();
		// ��ʾ����b3��ָ���κ���Ч�Ķ���
		Boy b3 = null;
		b3.show();// �����ʱ���ok���������е�ʱ��ܱ��� error
	}

}
