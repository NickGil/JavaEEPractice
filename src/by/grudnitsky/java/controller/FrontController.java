package by.grudnitsky.java.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class FrontController extends HttpServlet {
    private void process(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
        String command = req.getParameter("command");
        if (command != null && !command.isEmpty()) {
            if (command.equals("mainPage")) {
                new CmndMain().execute(req, resp);
                try {
                    toJsp(req, resp, "/mainPage.jsp");
                } catch (ServletException | IOException e) {
                    e.printStackTrace();
                }
            } else {
                if (command.equals("reset")){
                    new CmndReset().execute(req, resp);
                    try {
                        toJsp(req, resp, "/admin.jsp");
                    } catch (ServletException | IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    if (command.equals("showComplaints")){
                        new CmndShowComplaints().execute(req,resp);
                        try {
                            toJsp(req,resp,"/complaints.jsp");
                        } catch (ServletException | IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        try {
            toJsp(req, resp, "/notFound.jsp");
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    void toJsp(HttpServletRequest req, HttpServletResponse resp, String jsp) throws ServletException, IOException {
        ServletContext servletContext = req.getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(jsp);
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        try {
            process(req, resp);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        try {
            process(req, resp);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
