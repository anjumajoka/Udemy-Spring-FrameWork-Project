package com.springdemo.testdb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException
    {
        // set connection variables
        String user = "hbstudent";
        String pass = "hbstudent";

        String jdbcUrl = "jdbc:mysql:// localhost:3306/web-customer-tracker";
        String drier = "com.mysql.jdbc.Driver";

            // get connection to data base
        try {
            PrintWriter out = resp.getWriter();

            out.println("connecting to jdbc " +jdbcUrl);

            Class.forName(drier);

            Connection conn = DriverManager.getConnection(jdbcUrl, user, pass);

            System.out.println("connection successful");

        }catch (Exception exc){
            exc.printStackTrace();
            throw new ServletException();
        }
    }

}
