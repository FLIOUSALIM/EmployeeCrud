package org.melsif.dao;

import org.melsif.beans.Employee;

import java.util.List;

/**
 * Created by fliou on 21/09/17.
 */
public interface EmployeeDao {

    void addEmployee(Employee employee);

    void deleteEmployee(Employee employee);

    List<Employee> getAllEmployee();
}
