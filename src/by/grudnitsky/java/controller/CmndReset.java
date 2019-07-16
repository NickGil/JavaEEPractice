package by.grudnitsky.java.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

import static by.grudnitsky.java.dao.Dao.reset;


class CmndReset extends Cmnd{

    @Override
    void execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
            reset();
    }
}
