package org.melsif.dao;

import org.melsif.beans.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fliou on 21/09/17.
 */
public class EmployeeDaoImpl implements EmployeeDao {

    private DaoFactory daoFactory;

    public EmployeeDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    public void addEmployee(Employee employee) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = daoFactory.getConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO Employee VALUES(?,?,?,?);");

            preparedStatement.setString(1, employee.getMatriculeRegistration());
            preparedStatement.setString(2, employee.getFirstName());
            preparedStatement.setString(3, employee.getLastName());
            preparedStatement.setString(4, employee.getAddress());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteEmployee(Employee employee) {

    }

    public List<Employee> getAllEmployee() {
        List<Employee> employees = new ArrayList<Employee>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = daoFactory.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM Employee");

            while(resultSet.next()) {
                Employee employee = new Employee();
                employee.setMatriculeRegistration(resultSet.getString("matriculeRegistration"));
                employee.setLastName(resultSet.getString("lastName"));
                employee.setFirstName(resultSet.getString("firstName"));
                employee.setAddress(resultSet.getString("address"));

                employees.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }
}
