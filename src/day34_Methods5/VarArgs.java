package day34_Methods5;

public class VarArgs {

	public static void main(String[] args) {

		sumAll(5, 5, 6, 7, 4, 5, 334); // ints for the varargs entered here
		
		shoppingList("armut","elma","dingil"); // strings to be sent method below
	}

	public static void sumAll(int... nums) { // varargs here can pass any number of ints

		System.out.println(nums[1]); // print one number from the array

		int sum = 0;

		for (int i : nums) {
			sum = sum + i;
		}
		System.out.println(sum); // print sum of the array

	}
	
	public static void shoppingList(String... items) { // can take any number of items in ""
		
		for (String item : items) {
			
			System.out.print(item+" "); // prints all items in the array entered
		}
				
		System.out.println(); // blank line
	}
}
