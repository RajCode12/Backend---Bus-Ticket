import java.util.List;

public interface EmployeePoji {
	void addEmployee(Employee obj);
	Employee readEmployee();
	List<Employee> readAllEmployee();
	void updateEmployee(Employee obj);
	void deleteEmployee(int id);
}
