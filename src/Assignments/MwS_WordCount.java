package Assignments;

public class MwS_WordCount {

//This method gets a string and returns the word count of that string.

	public static void main(String[] args) {

		wordCount("hwhe hehe hehe");
		
	}

	public static int wordCount(String words) {
		
		String split[] = words.split(" ");
		
		return split.length;
	}
}
