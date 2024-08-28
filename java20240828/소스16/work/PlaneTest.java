package work;

public class PlaneTest {

	public static void main(String[] args) {
		Plane ap = new Airplane("L747", 1000);
		Plane cp = new Cargoplane("C40", 1000);
		
		Plane[] p = {ap, cp};
		
		printInfo(p);
		
		System.out.println("[100 운항]");
		ap.filght(100);
		cp.filght(100);
		
		printInfo(p);
		
		System.out.println("[200 주유]");
		ap.refuel(200);
		cp.refuel(200);
		
		printInfo(p);
		
	}
	
	public static void printInfo(Plane[] list) {
		System.out.println("Plane \t fuelSize");
		System.out.println("-------------------------");
		
		for(Plane l: list) {
			System.out.printf("%s \t %d\n",l.getPlaneName(), l.getFuelSize() );
			
		}
		System.out.println();
	}

}
