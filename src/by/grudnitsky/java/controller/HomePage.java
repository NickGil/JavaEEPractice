package by.grudnitsky.java.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomePage extends HttpServlet {

    private void process(HttpServletRequest req, HttpServletResponse resp) {
        try {
            new FrontController().toJsp(req, resp, "/mainPage.jsp");
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        process(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        process(req, resp);
    }
}
