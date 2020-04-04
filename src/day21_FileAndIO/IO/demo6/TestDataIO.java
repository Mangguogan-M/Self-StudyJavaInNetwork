package day21_FileAndIO.IO.demo6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ��������д����
 * 		ע�⣺������д��ʲô����˳�򣬶�ȡ����ʲô��˳��
 * 
 * 		���������һ����������������ֱ�ӽ�һ������д���ȥ
 */
public class TestDataIO {
	public static void main(String[] args) throws IOException {
		write();
		read();
	}

	private static void read() throws IOException {
		DataInputStream dis = new DataInputStream(new FileInputStream("dos.txt"));
		byte b = dis.readByte();
		System.out.println(b);
		short s = dis.readShort();
		System.out.println(s);
		int i = dis.readInt();
		System.out.println(i);
		long l = dis.readLong();
		System.out.println(l);
		float f = dis.readFloat();
		System.out.println(f);
		double d = dis.readDouble();
		System.out.println(d);
		char c = dis.readChar();
		System.out.println(c);
		boolean b1 = dis.readBoolean();
		System.out.println(b1);

		dis.close();

	}

	private static void write() throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("dos.txt"));
		dos.writeByte(1);
		dos.writeShort(20);
		dos.writeInt(200);
		dos.writeLong(4000);
		dos.writeFloat(12.3f);
		dos.writeDouble(12.12);
		dos.writeChar('a');
		dos.writeBoolean(true);

		dos.close();
	}

}
