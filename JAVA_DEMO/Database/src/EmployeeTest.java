
public class EmployeeTest {
	public static void main(String[] args) {
		EmployeePojoImpl obj = new EmployeePojoImpl();
	
		//Add Employee
		Employee emp = new Employee();
		emp.setEmployeeId(1);
		emp.setEmployeeName("Raj");
		emp.setEmployeeSalary(20000);
		obj.addEmployee(emp);
	}
}
