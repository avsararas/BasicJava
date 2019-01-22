package day19_Loops;

public class slowlyPrintMyNumbers {
	public static void main(String[] args) throws InterruptedException {
		
		int num2 = 11;
		
		while (num2 > 1) {
			
			num2--;
			  
			System.out.print(+num2+" ");
			
			Thread.sleep(100);
			
		}	
	}
}
