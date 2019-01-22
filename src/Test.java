import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		String[] order = { 
				"AArmut","AArmut",
				"Marble", "Marble", 
				"Coffee", "Coffee", "Coffee", "Coffee",
				 "Pear", "Pear",
				 "Apple",
				"Date",
				"Zort",
				 "Glass", "Glass", "Glass", "Glass", "Glass", "Glass", "Glass",
				"Wood", "Wood", 
				"Coffee",
				"Zort",
				"Zurt","Zurt",
		};

		Arrays.sort(order);

		System.out.println(Arrays.toString(order));

		int count = 0;

		int i = 0;
		int j = i + 1;

		while (i < order.length - 1) {
			
			while (order[i].equals(order[j])) {
				j++;

				if (j >= order.length) {
					break;
				}
			}
		
		if (j > i + 1) {
			 count++;
		}
		i = j;
		}
		System.out.println("number" + count);
	}
}