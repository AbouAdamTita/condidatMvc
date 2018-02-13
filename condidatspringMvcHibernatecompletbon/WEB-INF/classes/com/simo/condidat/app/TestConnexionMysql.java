package com.simo.condidat.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





/**
 * Servlet implementation class TestConnexionMysql
 */
@WebServlet("/TestConnexionMysql")
public class TestConnexionMysql extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
		String user="webecole";
		String pass="webecole";
		String urljdbc="jdbc:mysql://localhost:3306/webecole?useSSL=false";
		
		String driver="com.mysql.jdbc.Driver";
		
		PrintWriter out=response.getWriter();
		out.print("connexion en cours"+urljdbc);
		
		try {
			Class.forName(driver);
			
			
			
			Connection myCon=DriverManager.getConnection(urljdbc, user, pass);
			
			out.print("connexion reussi yahoooooo!");
			
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			out.print("connexion echoué!");
			e.printStackTrace();
		}
		
		
		
	}

}
