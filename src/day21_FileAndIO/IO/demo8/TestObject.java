package day21_FileAndIO.IO.demo8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/*
 * 序列化与反序列化
 * 		
 * 		序列化：ObjectOutputStream
 * 		反序列化：ObjectInputStream
 * 
 * 
 * 		需求：
 * 			1.创建Goods实体类
 * 			2.创建序列化流，将Goods对象序列化到项目下object.txt文件中，做数据持久化
 * 			3.利用反序列化将对象读取并打印出来
 * 
 * 			
 * 			注意：使用序列化流被序列化的对象一定要实现序列化接口(Serializable)
 * 			
 */
public class TestObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Goods goods = new Goods(1, "葵花宝典", 12.0, 100);
		// 创建序列化流
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"));
		// 将Goods对象序列化到项目下object.txt中持久存储
		oos.writeObject(goods);// java.io.NotSerializableException: demo8.Goods 对象类序列化异常
		oos.close();

		System.out.println("---------利用反序列化读取文件中对象信息，并遍历-----------");

		// 创建反序列化流
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"));
		// 读取文件中对象信息
		Goods g = (Goods) ois.readObject();
		System.out.println(g);

		ois.close();

	}
}
