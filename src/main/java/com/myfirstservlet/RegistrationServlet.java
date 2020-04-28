package com.myfirstservlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/Registration.html");
        PrintWriter out = resp.getWriter();
        rd.include(req, resp);
        String firstName = req.getParameter("fName");
        String lastName = req.getParameter("lName");
        String userName = req.getParameter("name");
        LoginServlet.setUserId(userName);
        String email = req.getParameter("email");
        String password = req.getParameter("pass");
        String phoneNo = req.getParameter("phone");
        LoginServlet.setPassword(password);
        if (ValidateForm.isValidName(userName,lastName,firstName)==false || ValidateForm.isValidEmail(email)==false || ValidateForm.isValidPhoneNo(phoneNo)
                ==false || ValidateForm.isValidPassword(password)==false )
            out.println("<p style=\"text-align:center;color:red;font-size:200%\">Invalid Input</p>");

        else {
            req.getRequestDispatcher("RegistrationSuccess.jsp").forward(req, resp);
        }
    }
}
