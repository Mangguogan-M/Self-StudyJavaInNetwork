package day21_FileAndIO.IO.demo7;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
 * ��ʾ�ڴ������
 * 		�ڴ������һ�����ڴ�����ʱ���ݣ���Ϊ��ʱ��Ϣ����Ҫ���֣�ʹ�ú�Ϳ���ɾ����
 */
public class TestByteArray {
	public static void main(String[] args) throws IOException {

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		bos.write("helloworld".getBytes());
		bos.close();

		byte[] bs = bos.toByteArray();
		ByteArrayInputStream bis = new ByteArrayInputStream(bs);

		int num = 0;
		while ((num = bis.read()) != -1) {
			System.out.println((char) num);
		}

		bis.close();
		bos.close();
		// ����close���Բ�д��ͨ����Դ�����֪������ʲô��û������

	}
}
