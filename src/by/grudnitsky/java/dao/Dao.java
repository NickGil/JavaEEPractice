package by.grudnitsky.java.dao;

import by.grudnitsky.java.beans.Complaint;

import java.sql.SQLException;


public class Dao {
    private static Dao dao;

    public InterfaceDao<Complaint> complaint;

    public static void reset() throws SQLException {
        MyConnection.reset();
    }

    private Dao() {
        complaint = new UniversalDAO<>(new Complaint());
    }

    public static Dao getDao() {
        if (dao == null) {
            synchronized (Dao.class) {
                if (dao == null) {
                    dao = new Dao();
                }
            }
        }
        return dao;
    }
}
