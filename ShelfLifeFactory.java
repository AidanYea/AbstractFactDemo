
public class ShelfLifeFactory extends AbstractFactory {

	ShelfLife getShelfLife(String shelfType) {
		// TODO Auto-generated method stub
		if (shelfType == null) {
			return null;
		}
		
		if (shelfType.equalsIgnoreCase("LONG LIFE")) {
			return new LongShelfLife();
		}
		
		if (shelfType.equalsIgnoreCase("MID LIFE")) {
			return new MidShelfLife();
		}
		
		if (shelfType.equalsIgnoreCase("SHORT LIFE")) {
			return new ShortShelfLife();
		}
		return null;
	}

	Product getDescription(String productType) {
		// TODO Auto-generated method stub
		return null;
	}

}
