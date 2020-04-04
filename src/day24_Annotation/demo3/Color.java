package day24_Annotation.demo3;

public class Color {

	@MyAnnotation("red")
	public void red() {
		System.out.println("执行red方法");
	}

	@MyAnnotation("blue")
	public void blue() {
		System.out.println("执行blue方法");
	}
}
