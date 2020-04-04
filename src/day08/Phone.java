package day08;

/*
 * 手机：
		特征：
			名字、价格、颜色
		行为：
			打电话
			发送消息
			打游戏
 */
//手机类
public class Phone {// 类里面可以写成员变量和成员方法
	// 运行时，jvmPhone的信息放入到方法区
	// 成员变量
	String name;// 名字 //new Phone实例后， name引用放入栈区中， name对象放入到堆里
	int price;// 价格
	String color;// 颜色

	// 行为 / 方法
	void call(String name) {
		System.out.println("打电话给" + name);
	}

	// 发消息
	void sendMessage() {
		System.out.println("发消息....");
	}

	// 玩游戏
	void playGame() {
		System.out.println("玩游戏....");
	}

	/* 输出 */
	void show() {// show方法本身放入方法区里。
		System.out.println(name + " " + price + " " + color);
	}

}
