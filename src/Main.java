
public class Main {

	public static void main(String[] args) {
		
		Motorcycle Brand1 = new Motorcycle();
		Brand1.printMotorcycle("Yamaha", "250cc", "Blue", "Superbike");
		Brand1.behavior("Turn, Start, Brake, Accelerate");
		Brand1.printSpeed(90, 110, 150, 180);
		Brand1.printPrice(20000);
		
		
		System.out.println();
		
		Motorcycle Brand2 = new Motorcycle(); 
		Brand2.printMotorcycle("Honda", "150cc", "Orange", "Scooters");
		Brand2.behavior("Turn, Start, Brake, Accelerate");
		Brand2.printSpeed(80, 110, 120, 140);
		Brand2.printPrice(14000);
		


	}

}
