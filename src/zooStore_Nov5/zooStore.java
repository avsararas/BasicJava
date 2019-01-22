package zooStore_Nov5;

public class zooStore {

	static Animal[] animalList = new Animal[3];

public static void main(String[] args) {
	
	Animal dog = new Animal();
	dog.setName("It");
	dog.setWeigth(120);
	dog.setColor("White");
	
	Animal cat = new Animal();
	cat.setName("Mendebur");
	cat.setWeigth(20);
	cat.setColor("Black");
	
	Animal horse = new Animal();
	horse.setName("Kuheylan");
	horse.setWeigth(300);
	horse.setColor("Brown");
	
	animalList[0]=dog;
	animalList[1]=cat;
	animalList[2]=horse;

	// from AnimalList print animal name with color starts with 'b'
	
	for (int i = 0; i < animalList.length; i++) {
			
		if (animalList[i].getColor().startsWith("B")) {

		System.out.println(animalList[i].getName());
		}
		
	}

	 //second element from the animalList -> weight
    	animalList[1].getWeigth();
}

}
