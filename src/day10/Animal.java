package day10;

/*
 * 
 * ���
 * 		����������������
 * 		��Ϊ����
 * 
 * Сè
 * 		����������������
 * 		��Ϊ����
 * С��
 * 		����������������
 * 		��Ϊ����
 * �ϻ�
 * 		����������������
 * 		��Ϊ����
 * ʨ��
 * 		����������������
 * 		��Ϊ����
 */
public class Animal {

	private String name;
	private int age;

	public Animal() {

	}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

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

		if (age > 0 && age < 120) {
			this.age = age;
		} else {
			System.out.println("���䲻������");
		}

	}

	public void eat() {

	}

	public void show() {
		System.out.println(this.name + " " + this.age);
	}

}