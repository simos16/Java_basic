package it.simo.dao.example;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws SQLException {
	
		Connection con = Database.getConnection();
		
		if (con != null) {
			System.out.println("Il db è connesso correttamente");
		}
		
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		
		List<Employee> tutti = employeeDAO.getAll();
		System.out.println(tutti);
		
		
		
		Employee employee = new Employee(43, "Marco", "Biagi", 7);
		
		int result = employeeDAO.insert(employee);
		
		System.out.println("Record creati: " + result);
		
		
		
		
		
		
		
		
		/*Employee employee1 = new Employee(1, 336861, "Sam", "Club", 5);
		
		employeeDAO.update(employee1);
		
		System.out.println(employee1);*/
		
		
		/*Employee employee = employeeDAO.get(1);
		
		System.out.println(employee);
		
		int result = employeeDAO.delete(employee);
		
		System.out.println(result);*/
	}

}
