package day27_Arrays4;

public class CopyCertainValues {
	public static void main(String[] args) {

// Create another array fewValues and copy words that have letter "e" in them

		String[] arr = { "zero", "one", "two", "three", "four" };

		// count how many words have 'e' in the arr
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i].contains("e")) {
				counter++;
			}

		}

		//		System.out.println(counter);
		
		// create array fewValues, with size of counter
		String[] fewValues = new String[counter];

		// go over arr one more time and add the words with 'e' into fewValues
		int i = 0;

		for (int j = 0; j < arr.length; j++) {
			if (arr[j].contains("e")) {
				fewValues[i] = arr[j];
				i++;
			}
		}

		for (String val : fewValues) {
			System.out.print(""+val+", ");
		}
	}
}