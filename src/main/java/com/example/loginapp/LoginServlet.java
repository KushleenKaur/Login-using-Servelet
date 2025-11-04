package com.example.loginapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        String validUser = "admin";
        String validPass = "12345";

        if (username.equals(validUser) && password.equals(validPass)) {
            out.println("<html><body>");
            out.println("<h2>Welcome, " + username + "!</h2>");
            out.println("<p>Login successful. Enjoy your session.</p>");
            out.println("</body></html>");
        } else {
            out.println("<html><body>");
            out.println("<h3 style='color:red;'>Invalid username or password!</h3>");
            out.println("<a href='login.html'>Try again</a>");
            out.println("</body></html>");
        }
        out.close();
    }
}
