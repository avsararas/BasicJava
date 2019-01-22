package day48_Inharitance2_Super;

public class Bin {
	
	private String contents;
	private String type;


	public void setType(String type) { // setter
		this.type = type;
	}

	public Bin() {
		this("General"); // constructor calls the other constructor
	}
	
	public Bin(String type) {
		contents="";
		this.type=type; // this. needs to be on the left side
		
	}
	
	public void add(String thing) { // method to add things
		
		if (contents.isEmpty()) {
			
			contents=thing;		
		}
		contents+=","+thing;
	}
	
	public boolean remove(String thing) { // method to remove things
		
		String temp = contents.toLowerCase();
		thing=thing.toLowerCase();		
		
		if (temp.startsWith(thing)) {
			
			temp= temp.replace(thing,""+thing.substring(thing.length()));
		}
		
		temp=temp.replaceAll(thing, "");
		
		return false;
	}
	
	public void empty() { // method to delete all
		
		contents="";
		
	}

	public String toString() { // method to convert all to String
		
		return "Bin ("+type+") contains: "+contents;
		
	}
}


