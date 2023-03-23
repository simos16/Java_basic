package it.simo.dao.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

	// CRUD - Prendi per ID
	@Override
	public Employee get(int id) throws SQLException {
		Connection con = Database.getConnection();
		Employee employee = null;

		String sql = "SELECT id, employee_id, first_name, last_name, dept_id FROM employees WHERE id = ?";

		PreparedStatement ps = con.prepareStatement(sql);

		ps.setInt(1, id);

		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			int uid = rs.getInt("id");
			int employeeId = rs.getInt("employee_id");
			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");
			int deptId = rs.getInt("dept_id");

			employee = new Employee(uid, employeeId, firstName, lastName, deptId);
		}

		Database.closeResultSet(rs);
		Database.closePreparedStatement(ps);
		Database.closeConnection(con);

		return employee;
	}

	// CRUD - Leggi tutti
	@Override
	public List<Employee> getAll() throws SQLException {

		Connection con = Database.getConnection();
		
		String sql = "SELECT * FROM employees ";
		
		List<Employee> employees = new ArrayList<>();
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int id = rs.getInt("id");
			int employeeId = rs.getInt("employee_id");
			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");
			int deptId = rs.getInt("dept_id");
			
			Employee employee = new Employee(id,employeeId, firstName, lastName, deptId);
			
			employees.add(employee);
		}
		
		return employees;
	}

	// CRUD - metodo save per update e insert
	@Override
	public int save(Employee employee) throws SQLException {
		
		return 0;
	}

	// CRUD - Inserisci nuovi dati
	@Override
	public int insert(Employee employee) throws SQLException {
		Connection con = Database.getConnection();
		
		String sql = "INSERT INTO employees (employee_id, first_name, last_name, dept_id) VALUES (?, ?, ?, ?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, employee.getEmployeeId());
		ps.setString(2, employee.getFirstName());
		ps.setString(3, employee.getLastName());
		ps.setInt(4, employee.getDeptId());
		
		int result = ps.executeUpdate();
		
		Database.closePreparedStatement(ps);
		Database.closeConnection(con);
		
		return result;
	}

	// CRUD - Update
	@Override
	public int update(Employee employee) throws SQLException {
		Connection connection = Database.getConnection();

		String sql = "UPDATE employees set employee_id = ?, first_name = ?, last_name = ?, dept_id = ? where id = ?";
		
		PreparedStatement ps = connection.prepareStatement(sql);
		
		ps.setInt(1, employee.getEmployeeId());
		ps.setString(2, employee.getFirstName());
		ps.setString(3, employee.getLastName());
		ps.setInt(4, employee.getDeptId());
		ps.setInt(5, employee.getId());
		
		int result = ps.executeUpdate();
		
		Database.closePreparedStatement(ps);
		Database.closeConnection(connection);
		
		return result;
	}

	// CRUD - Cancella
	@Override
	public int delete(Employee employee) throws SQLException {
		Connection connection = Database.getConnection();
		
		String sql = "DELETE FROM employees WHERE id = ?";
		
		PreparedStatement ps = connection.prepareStatement(sql);
		
		ps.setInt(1, employee.getId());
		
		int result = ps.executeUpdate();
		
		Database.closePreparedStatement(ps);
		Database.closeConnection(connection);
		
		return result;
	}

}
