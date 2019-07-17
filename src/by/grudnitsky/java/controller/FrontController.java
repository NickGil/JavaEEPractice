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
    private void process(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException, ServletException {
        Commands command = Commands.define(req);
        Commands next = null;

        try {
            next = command.cmnd.execute(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
            toJsp(req,resp, Commands.NOTFOUND.getJspName());
        }

        if (next == null) {
            toJsp(req, resp, command.getJspName());
        } else {
            resp.sendRedirect("do?command=" + next.toString().toLowerCase());
        }
    }


    static void toJsp(HttpServletRequest req, HttpServletResponse resp, String jsp) throws ServletException, IOException {
        ServletContext servletContext = req.getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(jsp);
        requestDispatcher.forward(req, resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        try {
            process(req, resp);
        } catch (SQLException | IOException | ServletException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        try {
            process(req, resp);
        } catch (SQLException | ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
