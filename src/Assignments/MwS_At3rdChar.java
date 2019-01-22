package Assignments;

public class MwS_At3rdChar {
	
	public static void main(String[] args) {
		
		System.out.println(at3("longword","foo"));
		
	}
	
	public static String at3(String target,String word)
	  {
	    
		target=target.substring(0, 3)+""+word+""+target.substring(3, target.length());
		
		return target;
	  }
}
