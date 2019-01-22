package day23_LoopsReview;

public class StringReplace {
	public static void main(String[] args) {
		
		String sentence= "We are learning Java";
		
		sentence = sentence.replace("Java"," C#");
			System.out.println(sentence);
		
		sentence = sentence.replace("learning"," practicing");
			System.out.println(sentence);
		
		sentence = sentence.replace("a","A");
			System.out.println(sentence);
		
		String word = "abcdefedfd java phyton cobol";
				System.out.println(word.replace("ava", "newChar"));
				
		
		// replace in chains for multiple expressions
		String result = "123,456,789,002 results";
		System.out.println(result.replace(",", "").replace("results", ""));



	}

}
