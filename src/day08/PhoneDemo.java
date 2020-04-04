package day08;

//运行时，JVM把PhoneDemo的信息放入方法区中
public class PhoneDemo {
	public static void main(String[] args) {// main方法本身放入方法区

		// 创建手机对象
		Phone p = new Phone();// p 是引用，所以放到栈区中，Phone是自定义对象应该放到堆里面

		p.name = "华为";
		p.price = 3999;
		p.color = "红色";

		p.call("马云");
		p.sendMessage();
		p.playGame();

		p.show();

	}
}
