package day27_Arrays4;

public class SplitMethod {
	public static void main(String[] args) {
		
	String words = "tava-selenium-cucumber-testng-junit-eclipse-maven-git-github"; 
	
	words.split("-");
	
	String parted [] = words.split("-"); // split with delimiter "-"
	
	System.out.println("ff"+parted[parted.length-1]);
	
	System.out.println(parted.length);
	
	for (String list : parted) {
		System.out.println(list);
		}
	
	// Find how many words in the statement
	
	String searchResults = "All categories “wooden spoon” 13,623 Results";
	
	String items[] = searchResults.split(" ");

	System.out.println(items.length);
	
	System.out.println("Wooden Spoons are "+items[4]); // showing split array position

	}
}
