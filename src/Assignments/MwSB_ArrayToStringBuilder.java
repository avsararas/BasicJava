package Assignments;

public class MwSB_ArrayToStringBuilder {
//Insert each element inside a string array into a StringBuilder object.

	public static StringBuilder  arrayToSb(String[] r) // r array is take from below
	  {
	    
		StringBuilder items = new StringBuilder();
		
		for (String part : r) { // r is declared on top in method body
			
			items.append(part);
		}
	  
		return items;
	   
	  }
	  
	  public static void main(String[] args){
	    
	    String[]  arr = new String[]{"a","1","2"};

	    StringBuilder recipt = arrayToSb(arr);
	    
	    System.out.print(recipt.toString());
	    
	  }//end main
	}