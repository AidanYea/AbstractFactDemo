
public class FactoryCreator {

	public static AbstractFactory getFactory(String choice) {
		
		if (choice.equalsIgnoreCase("PRODUCT")) {
			return new ProductFactory();
		}
		
		if (choice.equalsIgnoreCase("SHELF LIFE")) {
			return new ShelfLifeFactory();
		}
		
		return null;
	}
}
