package com.example.demo1;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String login = request.getParameter("login");
        String pass = request.getParameter("pass");
        if (login == null) login = "";
        if (pass == null) pass = "";

        HttpSession session = request.getSession(true);
        session.setAttribute("login", login);
        session.setAttribute("pass", pass);

        request.getRequestDispatcher("/Login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String pass = req.getParameter("pass");

        HttpSession session = req.getSession(true);
        session.setAttribute("login", login);
        session.setAttribute("pass", pass);

        if (login.equals("ghis") && pass.equals("pass")) {
            session.setAttribute("isConnected", true);
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        } else {
            session.setAttribute("isConnected", false);
            req.getRequestDispatcher("/Login.jsp").forward(req, resp);
        }
    }

    public void destroy() {
    }
}