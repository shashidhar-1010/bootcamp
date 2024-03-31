package com.example.demo1;

import com.example.demo1.model.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "registerServlet", value = "/registration")
public class RegisterServlet extends HelloServlet{

    User user = null;
    private final String userId = "shashi";
    private final String pass = "1234";

    public void init(){
        User  user = new User();
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String  password = request.getParameter("pwd");

        List<User> userlist = Arrays.asList(new User("abc","1234"),new User("def","123456"),new User("ghi","190874"));
        if (userId.equals(username) && pass.equals(password)){
            Cookie logincookie = new Cookie("user",username);
            logincookie.setMaxAge(15*60);
            response.addCookie(logincookie);
            request.setAttribute("userlist",userlist);
            RequestDispatcher rd = request.getRequestDispatcher("/register.jsp");
            rd.forward(request,response);

            //response.sendRedirect(request.getContextPath()+"/register.jsp");
        }
        else{
            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
            PrintWriter out = response.getWriter();
            System.out.println("<font color = red>username or password is incorrect</font>");
            rd.include(request,response);

        }

        //user.setUsername(username);
        //System.out.println("Username"+  username);
        //System.out.println("Password" + password);
        //String username = null;
        /*String greet = "hello"+ Username ;
        request.setAttribute("key",greet);
        RequestDispatcher rd = request.getRequestDispatcher("/register.jsp");
        rd.forward(request,response);*/




    }


}

//MVC Architecture
//session tracking
