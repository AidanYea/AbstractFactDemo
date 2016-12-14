
public abstract class AbstractFactory {
	abstract ShelfLife getShelfLife(String shelfType);
	abstract Product getDescription(String productType);
}
