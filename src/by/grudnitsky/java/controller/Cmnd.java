package by.grudnitsky.java.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract class Cmnd {
    abstract void execute(HttpServletRequest req, HttpServletResponse resp);
}
