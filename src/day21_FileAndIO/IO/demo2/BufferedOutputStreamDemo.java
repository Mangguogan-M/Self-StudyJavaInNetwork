package day21_FileAndIO.IO.demo2;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * ��������(��Ч��)
 * 
 * 		��ʾ�ֽ����������
 * 
 * 		���췽������ָ����������С����������һ�㲻�ã���ΪĬ�ϻ�������С�㹻�ˡ�
 */
public class BufferedOutputStreamDemo {
	public static void main(String[] args) throws Exception {
		// FileOutputStream fos = new FileOutputStream("���Ʋ��.txt");
		// BufferedOutputStream bos = new BufferedOutputStream(fos);
		// ��д��
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("���Ʋ��.txt"));

		bos.write("hello".getBytes());

		// �ͷ���Դ
		bos.close();

	}
}
