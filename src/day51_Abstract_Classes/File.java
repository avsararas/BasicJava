package day51_Abstract_Classes;

public abstract class File { // abstract class as a general term
	
	private String name; // can have a instance variable
	public static int count;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public File() { // contructor 1
		System.out.println("Abstract File Constructor runs");
		name="unknown"; // default name if no params defined
		count++;
	}
	
	public File(String name) { // contructor 2
		System.out.println("Abstract File One Arg Constructor runs");
		this.name=name;
		count++;
	}
	
	public abstract void open(); // abstract method without a body {}
								 // will provide implementation in sub class(es)
	
	public void close() { System.out.println("File Closed"); } // concrete method is possible too but with a body now
	 
	
	
	
	
	

}
