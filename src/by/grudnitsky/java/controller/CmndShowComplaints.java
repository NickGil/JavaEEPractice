package by.grudnitsky.java.controller;

import by.grudnitsky.java.beans.Complaint;
import by.grudnitsky.java.dao.Dao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

class CmndShowComplaints extends Cmnd{

    @Override
    void execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
        List<Complaint> complaints = Dao.getDao().complaint.getAll();
        req.setAttribute("complaints", complaints);
    }
}
