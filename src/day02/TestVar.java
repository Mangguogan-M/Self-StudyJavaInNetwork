package day02;

/*
	编程实现变量的声明和使用
*/
public class TestVar {

	// 主方法 程序的入口
	public static void main(String[] args) {

		// 声明一个用于记录年龄的变量，变量名设置成age

		// 1.Java中的变量必须声明后才能进行使用。否则编译报错。
		int age;

		// 给age赋值为“30”
		// 2.变量在使用之前必须要进行初始化才能使用变量，否则编译报错。
		age = 30;

		// 打印变量中的数值
		// 双引号中写什么就打印什么
		// +号在这里表示连接符，如果是数字代表运算符 加法运算
		System.out.println("年龄是:" + age);

		System.out.println("-------------------------------");

		// 声明一个String类型的变量存储字符串元素
		// .不允许在同一段代码区域中声明相同名称的变量，否则编译报错。
		// String age = "张三";
		// 输出 age
		// System.out.println(age);

		String name = "张飞";
		System.out.println("姓名:" + name);

		/*
		 * 不建议使用中文命令 int 年龄; 年龄 = 30; System.out.println(年龄);
		 */
	}

}