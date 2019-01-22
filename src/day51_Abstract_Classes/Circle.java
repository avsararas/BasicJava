package day51_Abstract_Classes;

public class Circle extends Shape{

	int radius;
	
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	void calcA() {

		int result = (int) (3.14 *radius*radius);
		System.out.println(result);
	}

}
