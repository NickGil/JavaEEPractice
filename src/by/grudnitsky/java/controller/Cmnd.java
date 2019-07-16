package by.grudnitsky.java.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

abstract class Cmnd {
    abstract void execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException;
}
