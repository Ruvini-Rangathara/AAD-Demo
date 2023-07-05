package com.example.demo1ee;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Customer extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Dop get...");
    }

    @Override
    public void init() throws ServletException {
        String name = getServletConfig().getInitParameter("name");
        String city = getServletConfig().getInitParameter("city");
        System.out.println(name);
        System.out.println(city);
    }
}
