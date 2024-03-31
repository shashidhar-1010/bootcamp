package com.example.demo;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

//@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {//server lifecycle method....automatically will get called
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        //service method to serve the method http request
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "from servelt"+"</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}