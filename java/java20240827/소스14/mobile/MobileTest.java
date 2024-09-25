package mobile;

public class MobileTest {
	public static void main(String args[]) {
		Mobile lt = new Ltab("Ltab", 500, "ABC-01");
		Mobile ot = new Otab("Otab", 1000, "XYZ-20");
		
		printTitle();
		printMobile(lt);
		printMobile(ot);
		
		System.out.println();
		System.out.println("[10분 충전]");

		lt.charge(10);
		ot.charge(10);
		
		printTitle();
		printMobile(lt);
		printMobile(ot);
		
		System.out.println();
		System.out.println("[5분 통화]");

		
		lt.operate(5);
		ot.operate(5);
		
		printTitle();
		printMobile(lt);
		printMobile(ot);
		System.out.println();

		
	}
	public static void printMobile(Mobile mobile) {
		System.out.printf("  %s\t\t %d\t\t %s\n", 
				mobile.getMobileName(), 
				mobile.getBatterySize(), 
				mobile.getOsType());
		
	}
	
	public static void printTitle() {
		System.out.println("  Mobile\t Battery\t OS");
		System.out.println("------------------------------------------");
	}
}
