package com.mybatis.flower.servlet;

import com.mybatis.flower.bean.Flower;
import com.mybatis.flower.service.FlowerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddServlet", urlPatterns = "/AddServlet")
public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String production = request.getParameter("production");
        Flower flower = new Flower(name, price, production);
        if(new FlowerService().insert(flower)){
            request.getRequestDispatcher("ShowServlet").forward(request, response);
        }else {
            response.sendRedirect("add.jsp");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
