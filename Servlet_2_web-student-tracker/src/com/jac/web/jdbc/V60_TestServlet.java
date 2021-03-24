package com.jac.web.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


/**
 * Servlet implementation class V60_TestServlet
 */
@WebServlet("/V60_TestServlet")
public class V60_TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	// Define datasource(connection pool) for Resource Injection
	@Resource(name="jdbc/web_student_tracker")
	private DataSource dataSource;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Step 1. Set up the printwriter
		PrintWriter out = response.getWriter();
		response.setContentType("text/plain");
		
		// Step 2. Get a connection to the database
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			myConn = dataSource.getConnection();
					
		// Step 3. Create a SQL statement
			String sql = "SELECT * FROM STUDENT";
			myStmt = myConn.createStatement();
		
		// Step 4. Execute SQL query
			myRs = myStmt.executeQuery(sql);
		
		// Step 5. Process the result set
			while(myRs.next()) {
				String email = myRs.getString("email");
				out.println(email);
			}
			
		} catch(Exception exc) {
			exc.printStackTrace();
		}
	}
}
