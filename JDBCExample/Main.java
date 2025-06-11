package org.jedi_bachelor;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String dbURL = "jdbc:postgresql://localhost:5432/jdbcexample"; // URL базы данных
        String user = "postgres"; // имя пользователя
        String password = "postgres"; // пароль

        Connection connection = DriverManager.getConnection(dbURL, user, password);

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(
            "SELECT * FROM BOOKS"
        );

        while(resultSet.next()) {
            String book = resultSet.getString("nameOfBook");
            System.out.println(book);
        }

        connection.close();
    }
}