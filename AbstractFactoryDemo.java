import java.util.Random;
public class AbstractFactoryDemo {

	public static void main(String[] args) {
		Random randomGen = new Random();
		
		int rand1 = 0;
		int rand2 = 0;
		
		rand1 = randomGen.nextInt(3);
		rand2 = randomGen.nextInt(3);
		
		AbstractFactory prodFactory = FactoryCreator.getFactory("PRODUCT");
		AbstractFactory lifeFactory = FactoryCreator.getFactory("SHELF LIFE");
		
		Product prod1 = null;
		ShelfLife life1 = null;
			
			if (rand1 == 0) {
				 prod1 = prodFactory.getDescription("AMBIENT");
			}
			else if (rand1 == 1) {
				 prod1 = prodFactory.getDescription("CHILLED");
			}
			else if (rand1 == 2) {
				 prod1 = prodFactory.getDescription("NEWSPAPERS");
			}
			
			if (rand2 == 0) {
				 life1 = lifeFactory.getShelfLife("SHORT LIFE");
			}
			else if (rand2 == 1) {
				 life1 = lifeFactory.getShelfLife("MID LIFE");
			}
			else if (rand2 == 2) {
				 life1 = lifeFactory.getShelfLife("LONG LIFE");
			}
			
			System.out.println(prod1.getDescription());
			System.out.println(life1.getDate());	
			
				
		

	}

}
