package day51_Abstract_Classes;

public class Rectangle extends Shape {
	
	int width;
	int heigth;
	
	public Rectangle() {
		super("Rect Super"); // cannot be a no args constuctor since there is one in Shape
	}

	public Rectangle(String name, int width, int height) {
		super(name);
		this.heigth=height;
		this.width=width;
		
	}
	
	@Override
	public void calcA() {
		
		int result = width*heigth;
		System.out.println(result);
		
	}
}
