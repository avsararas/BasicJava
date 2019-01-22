package day48_Inharitance2_Super;

public class testBin {
	public static void main(String[] args) {
	
		Bin basket = new Bin();
		
		basket.add("armut");
		basket.add("kabak");
		basket.add("kabob");
		basket.add("takoz");
		
		System.out.println(basket.toString());
		
		RecycleBin cheup = new RecycleBin();
		
		cheup.add("Karpuz");
		
		System.out.println(cheup); // using ToString method
		
		
		
}
}
