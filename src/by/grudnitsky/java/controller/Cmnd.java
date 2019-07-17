package by.grudnitsky.java.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract class Cmnd {
    abstract Commands execute(HttpServletRequest req, HttpServletResponse resp) throws Exception;
}
