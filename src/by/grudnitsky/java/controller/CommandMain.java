package by.grudnitsky.java.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CommandMain extends Cmnd {
    @Override
    void execute(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println(req.getParameter("appeal"));

    }
}
