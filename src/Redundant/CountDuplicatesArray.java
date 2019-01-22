package Redundant;
import java.util.Arrays;


public class CountDuplicatesArray {
	
		public static void main(String[] args) {

			String[] order = { 
					"Marble", "Marble",
					"Coffee","Coffee","Coffee","Coffee",
					//"Pear", "Pear", 
					//"Apple",
					//"Date",
					//"Zort",
					//"Glass", "Glass", "Glass", "Glass", "Glass", "Glass", "Glass",
					"Wood","Wood",
					"Coffee",
					//"Zort"
					};

			Arrays.sort(order);

			System.out.println(Arrays.toString(order));

			int count = 0;
			int unique=0;
	// Loop for multiple occurrences		
			for (int i = 0; i < order.length-1; i++) {

				if (order[i].equals(order[i + 1])) {
					count++;
				}
			}
	// Loop for single occurrences		
			for (int i = 0; i < order.length; i++) {
				
				boolean duplicate  = false;

				for(int j = 0; j < order.length; j++) {
									
				if (order[i]==order[j] && i !=j) {
						duplicate  = true;
						break;
					}
				}
				
				if (duplicate == false) {
					unique++;
				}
			}
			
			System.out.println(order.length-count-unique);
		}
	}


