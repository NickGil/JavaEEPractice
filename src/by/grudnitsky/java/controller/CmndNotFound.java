package by.grudnitsky.java.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class CmndNotFound extends Cmnd {
    @Override
    Commands execute(HttpServletRequest req, HttpServletResponse resp) {
        return null;
    }
}
