package day23_Net.demo1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {

	public static void main(String[] args) {

		// 1.��ȡ������������ַ��IP��ַ��Ϣ
		try {
			InetAddress ia = InetAddress.getLocalHost();
			// �Զ�����toString(); �ַ����ĸ�ʽ��������/IP��ַ
			System.out.println(ia);//DESKTOP-P118JNT/127.0.0.1
			// ��ֵ�ַ��Ϣ�ֱ��ȡ��������IP��ַ �ֱ��ӡ
			System.out.println(ia.getHostName());
			System.out.println(ia.getHostAddress());

			System.out.println("--------------------------------");

			// 2.��ȡָ���������еĵ�ַ��Ϣ
			InetAddress ia2 = InetAddress.getByName("DESKTOP-P118JNT");
			System.out.println(ia2);
			System.out.println(ia2.getHostName());
			System.out.println(ia2.getHostAddress());

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}