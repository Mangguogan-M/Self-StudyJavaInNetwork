package day21_FileAndIO.IO.demo5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��ʹ��PrintStream��BufferedReader�������������¼
			//Ҫ�󲻶ϵ���ʾ�û�����Ҫ���͵����ݣ��ж��Ƿ�Ϊ"bye"�����������
			//���룬��������д���ļ�H:\\a.txt��
 */
public class TestChatMsg {
	public static void main(String[] args) {
		try {
			// System.in ��InputStream���͵ģ������������
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintStream ps = new PrintStream(new FileOutputStream("H:\\a.txt"));
			boolean flg = true;
			while (true) {
				// 1.��ʾ�û�����Ҫ���͵����ݲ���¼��������
				System.out.println("��" + (flg ? "����" : "����") + "����Ҫ���͵�����");
				String str = br.readLine();
				// 2.�ж��û�����������Ƿ�Ϊ"bye",�������������
				if ("bye".equalsIgnoreCase(str)) {
					System.out.println("�������!");
					break;
				}
				// ��ȡ��ǰ��ϵͳʱ��
				Date d = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String format = sdf.format(d);

				// 3.���������û����������д�뵽�ļ�a.txt��
				ps.println(format + (flg ? "������" : "���ģ�") + str);
				flg = !flg;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
