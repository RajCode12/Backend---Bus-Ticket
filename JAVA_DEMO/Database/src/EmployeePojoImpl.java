import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class EmployeePojoImpl implements EmployeePoji {
	Connection conn = null;
	
	public EmployeePojoImpl() {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			conn = DriverManager.getConnection("","","");
			System.out.println("Connection successfully established...");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void addEmployee(Employee obj) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pst = conn.prepareStatement("INSERT INTO Employee VALUES (?,??)");
			pst.setInt(1,obj.getEmployeeId());
			pst.setString(2,obj.getEmployeeName());
			pst.setDouble(3,obj.getEmployeeSalary());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Employee readEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> readAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEmployee(Employee obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

}
