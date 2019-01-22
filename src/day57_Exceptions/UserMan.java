package day57_Exceptions;

public class UserMan {
	
	public static void main(String[] args) {
		
//		CreateUserName("6 Ibrahim CyberTek");
//		CreateUserName("Ib");
		String str = null ; 
		CreateUserName(str);

	}
	
	public  static void CreateUserName(String name) {
	
		try {
			System.out.println(name.charAt(0));
			System.out.println(name.charAt(9));
			
			char[] nameChars = name.toCharArray();
			System.out.println(nameChars[9]);
			
			String[] arrName=name.split("");
			Integer i = Integer.parseInt(arrName[0]);
			System.out.println(i);
			}
		
		//throw new Exception();
		
		catch(NullPointerException e) {
			System.out.println("caught NullPointerException");
		}
		
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("caught StringIndexOutOfBoundsException");
		}
		
		catch(NumberFormatException e) {
			System.out.println("caught NumberFormatException");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("caught ArrayIndexOutOfBoundsException");
		}
		
		 catch(Exception e) { // this will catch all exceptions
			System.out.println("caught ArrayIndexOutOfBoundsException");
		}
		
		finally {
			
			System.out.println("finally block");
		}
	}
}
