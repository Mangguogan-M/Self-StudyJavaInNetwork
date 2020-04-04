package day21_FileAndIO.IO.demo8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/*
 * ���л��뷴���л�
 * 		
 * 		���л���ObjectOutputStream
 * 		�����л���ObjectInputStream
 * 
 * 
 * 		����
 * 			1.����Goodsʵ����
 * 			2.�������л�������Goods�������л�����Ŀ��object.txt�ļ��У������ݳ־û�
 * 			3.���÷����л��������ȡ����ӡ����
 * 
 * 			
 * 			ע�⣺ʹ�����л��������л��Ķ���һ��Ҫʵ�����л��ӿ�(Serializable)
 * 			
 */
public class TestObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Goods goods = new Goods(1, "��������", 12.0, 100);
		// �������л���
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"));
		// ��Goods�������л�����Ŀ��object.txt�г־ô洢
		oos.writeObject(goods);// java.io.NotSerializableException: demo8.Goods ���������л��쳣
		oos.close();

		System.out.println("---------���÷����л���ȡ�ļ��ж�����Ϣ��������-----------");

		// ���������л���
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"));
		// ��ȡ�ļ��ж�����Ϣ
		Goods g = (Goods) ois.readObject();
		System.out.println(g);

		ois.close();

	}
}
