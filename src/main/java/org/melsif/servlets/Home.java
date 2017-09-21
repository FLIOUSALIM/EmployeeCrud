package org.melsif.servlets;

import org.melsif.dao.DaoFactory;
import org.melsif.dao.EmployeeDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by fliou on 20/09/17.
 */
public class Home extends HttpServlet {
    private EmployeeDao employeeDao;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DaoFactory daoFactory = DaoFactory.getInstance();
        employeeDao = daoFactory.getEmployeeDao();
        request.setAttribute("employees", employeeDao.getAllEmployee());
        this.getServletContext().getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request,response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
    }
}
