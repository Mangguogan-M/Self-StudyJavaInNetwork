package day22_Threadd.demo9;

/*
 * ͼ����
 */
public class Book {
	private String name;
	private String rmb;
	// ���Ϊtrue˵�ֿ����飬���Ϊfalse˵�ֿ�û�����
	// ������������߾�ȥ����
	// ���û���飬��ô��������Ҫ֪ͨ������ȥ����ͼ�顣
	boolean flag;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRmb() {
		return rmb;
	}

	public void setRmb(String rmb) {
		this.rmb = rmb;
	}

}
