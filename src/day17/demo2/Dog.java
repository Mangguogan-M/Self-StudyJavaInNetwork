package day17.demo2;

public class Dog {
	private String name;
	private String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Dog(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", type=" + type + "]";
	}
}
