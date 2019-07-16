package by.grudnitsky.java.controller;

import by.grudnitsky.java.beans.Complaint;
import by.grudnitsky.java.dao.Dao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;


class CmndMain extends Cmnd {
    @Override
    void execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
        if (req.getMethod().equalsIgnoreCase("POST")) {
            String complaint = req.getParameter("complaint");
            Dao.getDao().complaint.create(new Complaint(complaint));
        }
    }
}
