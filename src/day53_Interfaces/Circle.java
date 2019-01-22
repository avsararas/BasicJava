package day53_Interfaces;

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
	
	
	// Below methods come from the interface
	@Override
	public void draw() { // must be always public to override othwerwise will become default; less visible
		// TODO Auto-generated method stub
		
	}

	@Override
	public int drawLine(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void drawSquare() {
		// TODO Auto-generated method stub
		
	}

}
