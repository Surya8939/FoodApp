package project;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Res1Servlet")
public class Res1Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve user input
        String food = request.getParameter("food");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        // Calculate total price (you can customize this based on your logic)
        double price = calculatePrice(food, quantity);

        // Display the order confirmation
        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h2>Order Confirmation</h2>");
        response.getWriter().println("<p>Food: " + food + "</p>");
        response.getWriter().println("<p>Quantity: " + quantity + "</p>");
        response.getWriter().println("<p>Total Price: $" + price + "</p>");
        response.getWriter().println("<br>");
        response.getWriter().println("<a href=\"Exitpagejsp.jsp\">Exit</a>");
        response.getWriter().println("</body></html>");
    }

    private double calculatePrice(String food, int quantity) {
        // You can implement your pricing logic here
        // This is a simple example; you may want to fetch prices from a database
        double unitPrice;
        switch (food) {
            case "burger":
                unitPrice = 125.99;
                break;
            case "pizza":
                unitPrice = 300.99;
                break;
            case "pasta":
                unitPrice = 130.99;
                break;
            default:
                unitPrice = 0.0;
        }
        return unitPrice * quantity;
    }
   
}
