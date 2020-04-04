package day15;

/*
 *  1.��֤�û��� ��ĸ��ͷ4-6Ϊ������ĸ�»���
	2.�ֻ���11λ
	3.��֤QQ����	  5-13λ
	4.��֤����
	5.��֤���֤
	6.��֤�û�2-4λ����
	7.��֤�û���	������ĸ ���붼����
 */
public class Regex2 {
	public static void main(String[] args) {

		// 1.��֤�û��� ��ĸ��ͷ4-6Ϊ������ĸ�»���
		String reg = "^[a-zA-Z]\\w{3,5}";
		boolean matches = "s6_a".matches(reg);
		System.out.println(matches);

		// 4.��֤����
		// wanghd@126.com 91282345@qq.com
		String reg2 = "^[1-9a-zA-Z]+@\\w+(.com|.cn|.com.cn)$";
		boolean matches2 = "wanghd@126.com".matches(reg2);
		System.out.println(matches2);

		// 6.��֤�û�2-4λ����
		String reg3 = "[\u4e00-\u9fa5]{2,4}";
		boolean matches3 = "����Ե�".matches(reg3);
		System.out.println(matches3);

		// 7.��֤�û��� ������ĸ ���붼����
		// ?![0-9]$ ?![a-zA-Z]$
		String reg4 = "(?![0-9]+$)(?![a-zA-Z]+$)[0-9a-zA-Z]*";
		boolean matches4 = "dsdsa1dasa".matches(reg4);
		System.out.println(matches4);

		// ������� ���� ��ĸ �»���
		String reg5 = "(?![0-9]+$)(?![a-zA-Z]+$)(?![0-9a-zA-Z]+$)[0-9a-zA-Z_]*";
		boolean matches5 = "dsdsa_1dasa".matches(reg5);
		System.out.println(matches5);
	}
}
