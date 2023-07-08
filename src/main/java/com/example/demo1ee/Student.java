package com.example.demo1ee;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Student extends HttpServlet {

    String name;
    String city;
    String email;

    StudentModel studentModel = new StudentModel();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.name = req.getParameter("name");
        this.city = req.getParameter("city");
        this.email = req.getParameter("email");

        StudentTo studentTo = new StudentTo(this.name, this.city, this.email);
        studentModel.save(studentTo);

    }

}
