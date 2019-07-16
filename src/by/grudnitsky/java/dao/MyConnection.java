package by.grudnitsky.java.dao;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class MyConnection {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/LizaProject?" +
            "useUnicode=true&characterEncoding=UTF-8";
    private static final String USER = "root";
    private static final String PASSWORD = "12345Qwe";
    private static volatile java.sql.Connection connection;

    static java.sql.Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return connection;
    }

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void reset() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (java.sql.Connection connection = MyConnection.getConnection()) {
            Statement statement = connection.createStatement();
            statement.executeUpdate("DROP SCHEMA IF EXISTS `LizaProject` ;");
            statement.executeUpdate("CREATE SCHEMA IF NOT EXISTS `LizaProject` DEFAULT CHARACTER SET utf8 ;");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS `LizaProject`.`complaints` (\n" +
                    "  `id` INT NOT NULL AUTO_INCREMENT,\n" +
                    "  `complaint` VARCHAR(100) NULL,\n" +
                    "  PRIMARY KEY (`id`))\n" +
                    "ENGINE = InnoDB;");
            statement.executeUpdate("INSERT INTO `LizaProject`.`complaints` (`id`, `complaint`) VALUES (DEFAULT, 'text test1');");
            statement.executeUpdate("INSERT INTO `LizaProject`.`complaints` (`id`, `complaint`) VALUES (DEFAULT, 'text test2');");
            System.out.println("reset complited");
        }
    }
}
