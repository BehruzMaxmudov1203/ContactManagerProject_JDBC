package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseUtil {

    public static void createTable() {

        String sql = "CREATE TABLE IF NOT EXISTS contact ( " +
                " id SERIAL PRIMARY KEY, " +
                " name VARCHAR(25) NOT NULL, " +
                " surname VARCHAR(25) NOT NULL, " +
                " phone VARCHAR(12) NOT NULL UNIQUE" +
                " )";

        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/db_lesson_jon",
                    "db_user_jon", "1234");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}