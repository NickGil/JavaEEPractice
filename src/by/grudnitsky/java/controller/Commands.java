package by.grudnitsky.java.controller;

import javax.servlet.http.HttpServletRequest;

@SuppressWarnings({"unused"})
public enum Commands {

    INDEX(new CmndIndex()),
    NOTFOUND(new CmndNotFound()),
    ADMIN(new CmndAdmin()),
    RESET(new CmndReset()),
    COMPLAINTS(new CmndComplaints());

    Cmnd cmnd;

    Commands(Cmnd cmnd) {
        this.cmnd = cmnd;
    }

    String getJspName() {
        return "/" + this.name().toLowerCase() + ".jsp";
    }

    static Commands define(HttpServletRequest req) {
        String commandName = req.getParameter("command");
        Commands command = Commands.INDEX;
        if (commandName != null && !commandName.isEmpty()) {
            try {
                command = Commands.valueOf(commandName.toUpperCase());
            } catch (IllegalArgumentException e) {
                return Commands.INDEX;
            }
        }
        return command;
    }
}
