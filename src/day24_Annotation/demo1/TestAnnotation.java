package day24_Annotation.demo1;

import java.util.Date;

public class TestAnnotation implements People {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int age() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void work() {
		Date d = new Date();
		d.toLocaleString();
	}

}
