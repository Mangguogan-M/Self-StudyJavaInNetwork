package day21_FileAndIO.IO.demo7;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
 * 演示内存操作流
 * 		内存操作流一般用于处理临时数据，因为临时信息不需要保持，使用后就可以删除。
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
		// 最后的close可以不写，通过看源码可以知道这里什么都没有做。

	}
}
