package day09;

/*
 * 自定义类，进行封装
 */
public class Girl {

	// 成员变量
	// 1.私有化成员变量
	private String name;// 姓名
	int age;// 年龄
	private boolean flg;// 是否有男朋友

	// 建议：有有参构造的时候，加上无参构造
	public Girl() {

	}

	// 一旦自己编写构造，那么系统将不会在给你生成构造
	public Girl(String name, int age, boolean flg) {
		// this.name = name;
		// this.age = age;
		// this.flg = flg;
		// 在构造方法体中调用set成员变量进行合理值得判断
		setAge(age);
		setName(name);
		setFlg(flg);
	}

	// 自定义成员方法实现年龄增长一岁的行为
	public void grow() {
		age = age + 1;
	}

	// 自定义成员方法实现年龄增长参数指定的数值的行为
	public void grow(int age) {
		this.age = this.age + age;
	}

	public void show() {
		System.out.println("我是" + name + ",今年" + age + "岁了，" + (flg ? "已经名花有主!" : "还没有男朋友!"));
	}

	// 2.提供公共的get和set方法，在方法体中进行合理的判断
	// public 表示共有的，可以在任意位置进行访问
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		// 在方法体中进行条件的判断
		if (age > 0 && age <= 18) {
			this.age = age;
		} else {
			System.out.println("年龄不合理！！");
		}
	}

	public boolean getFlg() {
		return flg;
	}

	public void setFlg(boolean flg) {
		this.flg = flg;
	}

}
