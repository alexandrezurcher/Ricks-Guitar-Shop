import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

	public static void main(String[] args) {
	
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		GuitarSpec desired = new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.CEDAR, Wood.MAHOGANY, 6);
		
		List matchingGuitars = inventory.search(desired);
		if(!matchingGuitars.isEmpty()) {
			System.out.println("You might like these guitars: \n-----");

			for (Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext(); ) {
				Guitar guitar = (Guitar)i.next();
				GuitarSpec spec = guitar.getSpec();
				System.out.println(spec.getBuilder() + " " + 
						spec.getModel() + "\n" + 
						spec.getType()  + " guitar \n" + 
						"back wood: " +  spec.getBackWood() + " & " + 
						"top wood: " +	spec.getTopWood() + 
						"\nYou can have it for only " + guitar.getPrice() + "!\n-----");
			}

		}else {
			System.out.println("Sorry we have nothing for you.");
			}

	}

	

	private static void initializeInventory(Inventory inventory) {
		
		inventory.addGuitar("V95693",1500,new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.CEDAR, Wood.MAHOGANY, 6));
		inventory.addGuitar("V95670",1400,new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.CEDAR, Wood.MAHOGANY, 6));
		inventory.addGuitar("F95643",1400,new GuitarSpec(Builder.GIBSON, "Stratocastor",Type.ELECTRIC, Wood.INDIAN_ROSEWOOD, Wood.CEDAR, 6));
		inventory.addGuitar("F95623",1400,new GuitarSpec(Builder.MARTIN, "Academy", Type.ACOUSTIC,Wood.BRAZILIAN_ROSEWOOD, Wood.CEDAR, 6));
		inventory.addGuitar("S903142", 1300, Builder.MARTIN, "Strong", Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.MAHOGANY, 12);
	}
}
