package by.grudnitsky.java.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static by.grudnitsky.java.dao.Dao.reset;

class CmndReset extends Cmnd {
    @Override
    Commands execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        reset();
        return Commands.ADMIN;
    }
}
