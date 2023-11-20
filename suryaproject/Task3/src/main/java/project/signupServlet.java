package project;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
@WebServlet("/signupServlet")
public class signupServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodorder", "root", "root");
            String query = "INSERT INTO foodorder_table (username,email, password) VALUES (?, ?,?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, username);
            pstmt.setString(2, email);
            pstmt.setString(3, password);
            pstmt.executeUpdate();

            pstmt.close();
            conn.close();

            response.sendRedirect("loginpage.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

