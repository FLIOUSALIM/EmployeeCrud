package org.melsif.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by fliou on 21/09/17.
 */
public class DaoFactory {

    private String url;
    private String username;
    private String password;

    private static DaoFactory instance = null;

    private DaoFactory(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public static DaoFactory getInstance() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (instance == null) {
            instance = new DaoFactory("jdbc:mysql://localhost:3306/EmployeeCRUD","salim", "salim");
        }

        return instance;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    public EmployeeDao getEmployeeDao() {
        return new EmployeeDaoImpl(this);
    }



}
