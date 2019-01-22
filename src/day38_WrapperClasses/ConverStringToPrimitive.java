package day38_WrapperClasses;

import java.util.ArrayList;

public class ConverStringToPrimitive {
	public static void main(String[] args) {
		
		// parseint returns a primitive value
		// valueOf returns a wrapper class object
		
		String count = "34234";
		
		Integer con = Integer.parseInt(count)/2; // parse to convert it to in and make operations
		
		System.out.println(con); // print divided by 2
		
		
		
		// Converting a string array to nums
		String  snums[] = {"234","5656","745","45"}; // numbers as strings
		
		ArrayList<Integer> listNums = new ArrayList<>();
		
		for (String num : snums) {
			
			listNums.add(Integer.valueOf(num));	
		}
		
		System.out.println(listNums);
		
		
		
		
		String result = "wooden spoon (13,950 Results)";
		
		char part[] =  result.toCharArray();
		
		int sum=0;
		
		// Dingil's code to trim all but numbers
		
		String etsyResults = "wooden spoon (13,950 Results)";
		String etsyNum = etsyResults.replaceAll("[^x1-9]", "");
				
		System.out.println(Integer.parseInt(etsyNum));
		
		
		
	}

}
