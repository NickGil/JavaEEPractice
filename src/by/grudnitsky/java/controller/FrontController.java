package by.grudnitsky.java.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FrontController extends HttpServlet {
    private void process(HttpServletRequest req, HttpServletResponse resp) {
        String command = req.getParameter("command");
        if (command != null && !command.isEmpty()) {
            if (command.equals("mainPage")) {
                new CommandMain().execute(req, resp);
                try {
                    toJsp(req, resp, "/mainPage.jsp");
                } catch (ServletException | IOException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            toJsp(req, resp, "/notFound.jsp");
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void toJsp(HttpServletRequest req, HttpServletResponse resp, String jsp) throws ServletException, IOException {
        ServletContext servletContext = req.getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(jsp);
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req, resp);
    }
}
