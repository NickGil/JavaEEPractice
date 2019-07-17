package by.grudnitsky.java.controller;

import by.grudnitsky.java.beans.Complaint;
import by.grudnitsky.java.dao.Dao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class CmndIndex extends Cmnd {
    @Override
    Commands execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        if (req.getMethod().equalsIgnoreCase("POST")) {
            String complaint = req.getParameter("complaint");
            Dao.getDao().complaint.create(new Complaint(complaint));
        }
        return null;
    }
}
