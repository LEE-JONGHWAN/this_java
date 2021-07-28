package sec05.exam03_supplier;

import java.util.function.Supplier;

class Employee {
	int i = 9;
}

public class EmpSupplyTest {

	
	public static void main(String[] args) {
		Supplier<Employee> empSupplier =  Employee::new;
//				() -> { return new Employee(); };
			
		Employee randomEmp = empSupplier.get();
			System.out.println(randomEmp);
	}

}
