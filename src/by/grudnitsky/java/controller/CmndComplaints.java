package by.grudnitsky.java.controller;

import by.grudnitsky.java.beans.Complaint;
import by.grudnitsky.java.dao.Dao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

class CmndComplaints extends Cmnd {

    @Override
    Commands execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        List<Complaint> complaints = Dao.getDao().complaint.getAll();
        req.setAttribute("complaints", complaints);
        return null;
    }
}
