package day56_Exceptions;

public class NullException {
	
	public static void main(String[] args) {
		
		String a = null;
		
		System.out.println(a.length());
		
		//throw new NullPointerException(); //this code makes below unreachable
		
		// checked exception happens during copile time
		// unchecked exception happens durng run rime
		
		System.out.println("Program ended");
	}

}
