package com.myfirstservlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static String userId;
    private  static String password;
    public static void setUserId(String name){
        userId = name;
    }
    public static void setPassword(String pass){
        password = pass;
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String pwd = req.getParameter("pwd");
        if (userId.equals(user) && password.equals(pwd) && userId!=null && password!=null)
        {
            req.setAttribute("user",user);req.getRequestDispatcher("LoginSuccess.jsp").forward(req,resp);
        }
        else
        {
            RequestDispatcher rd = req.getRequestDispatcher("/Login.html");
            PrintWriter out = resp.getWriter();
            out.println("<p style=\"text-align:center;color:red;font-size:200%\">Either user name or password is Wrong</p>");
            rd.include(req,resp);
        }
    }
}
