package day18_Set.demo1;

public class Student implements Comparable<Student> {
	private String name;
	private int age;

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
		this.age = age;
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	// 这种排序被称为类的自然排序，类的compareTo方法被称为它的自然比较的方法。
	/*
	 * @Override public int compareTo(Student o) { // * 结果为负数，排在o对象之前 // *
	 * 结果为正数，排在o对象之后 // * 结果为0，说明两个对象相等
	 * 
	 * return this.age-o.age;//返回年龄差，说年龄小的排在前面 }
	 */
	@Override
	public int compareTo(Student o) {

		// 年龄相等则使用姓名排序

		if (this.age == o.age) {
			return this.name.compareTo(o.name);
		}
		return this.age - o.age;

	}

}
