package emp;

public class Company {
	// Employee 배열에 객체들을 생성하여 저장한다.
	// printEmployee() 메서드를 호출하여 Employee 배열의 객체들 정보를 출력한다.
	// 이 때는 세금을 출력하지 않는다.
	// 모든 직원에게 인센티브로 100씩 지급한다.(직원에 따라 적용되는 인센티브 금액은
	// 다르다.
	// printEmployee() 메서드를 호출하여 Employee 배열의 객체들 정보
	// 와 세금을 출력한다.
	public static void main(String args[]) {
		Employee[] emp = new Employee[2];
		emp[0] = new Secretary("Duke", 1, "secretary", 800);
		emp[1] = new Sales("Tuxi", 2, "salse", 1200);
		
		printEmployee(emp, false);
		
		System.out.println();
		
		for(Employee e : emp) {
			if(e instanceof Sales) {
				Sales tmp = (Sales) e;
				tmp.incentive(100);
			}
			else {
				Secretary tmp = (Secretary) e;
				tmp.incentive(100);
			}		
		}
		printEmployee(emp, true);
	}

	// 객체의 정보를 출력한다.(실행 결과를 참조)
	// isTax 의 참/거짓 여부에 따라서 텍스 출력 여부를 결정하여 처리한다.
	public static void printEmployee(Employee[] emps, boolean isTax) {
		if(isTax) {
			System.out.println("name \t department \t salary \t tax \t\t extra pay");
			System.out.println("--------------------------------------------------------------------");
			
			for(Employee emp : emps) {
				System.out.printf("%s \t %-10s \t %d \t\t %.1f \t\t", 
						emp.getName(),
						emp.getDepartment(),
						emp.getSalay(),
						emp.tax());
				
				if(emp instanceof Sales) {
					Sales tmp = (Sales) emp;
					System.out.printf(" %.1f\n", tmp.getExtraPay());
				}
				else
					System.out.print("\n");
			}
		}
		else {
			System.out.println("name \t department \t salary \t extra pay");
			System.out.println("---------------------------------------------------");
			
			for(Employee emp : emps) {
				System.out.printf("%s \t %-10s \t %d \t\t", 
						emp.getName(),
						emp.getDepartment(),
						emp.getSalay());
				if(emp instanceof Sales) {
					Sales tmp = (Sales) emp;
					System.out.printf(" %.1f\n", tmp.getExtraPay());
				}
				else
					System.out.print("\n");
			}
		}
		System.out.println();
	}
}	
