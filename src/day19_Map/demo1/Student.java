package day19_Map.demo1;

public class Student/* implements Comparable<Student> */ {
	private String name;
	private int age;
	private String hobby;

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

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Student(String name, int age, String hobby) {
		super();
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", hobby=" + hobby + "]";
	}
	/*
	 * @Override public int compareTo(Student o) { return this.age-o.age; }
	 */
}
