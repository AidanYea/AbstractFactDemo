
public class ProductFactory extends AbstractFactory {

	ShelfLife getShelfLife(String shelfType) {
		// TODO Auto-generated method stub
		return null;
	}

	Product getDescription(String productType) {
		// TODO Auto-generated method stub
		if (productType == null) {
			return null;
		}
		
		if (productType.equalsIgnoreCase("AMBIENT")) {
			return new Ambient();
		}
		
		if (productType.equalsIgnoreCase("CHILLED")) {
			return new Chilled();
		}
		
		if (productType.equalsIgnoreCase("NEWSPAPERS")) {
			return new Newspapers();
		}
		
		return null;
	}

}
