package day45_Blocks;

public class DefaultValues {
	
	// instance variables below can be used by creating objects
	
	public int intVal;
	public byte byteVal;
	public double doubleVal;
	public boolean booleanVal;
	public char charVal;
	public String stringVal;
	public Integer integerObjVal;
	
	// static cannot use non static
	public static void main(String[] args) {
		
		DefaultValues d = new DefaultValues(); // object created first
		
		System.out.println(d.intVal);
		System.out.println(d.byteVal);
		System.out.println(d.doubleVal);
		System.out.println(d.booleanVal);
		System.out.println(d.charVal);
		System.out.println(d.stringVal);     // null objects
		System.out.println(d.integerObjVal); // null objects
		
     // System.out.println(d.stringVal().toUpperCase()); will not work, no value in string
		
		System.out.println(d.intVal+101); // default 0 + 101
		
		d.stringVal="Leblebi"; // value assigned to object
	   
		System.out.println(d.stringVal.toUpperCase());

		
		
		
		
		
		
	}

}
