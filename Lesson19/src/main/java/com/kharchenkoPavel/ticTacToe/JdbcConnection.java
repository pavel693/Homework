package com.kharchenkoPavel.ticTacToe;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.LinkedList;
import java.util.Properties;

public class JdbcConnection {

    public Connection jdbcConnection() throws IOException, SQLException {
        JdbcConnection jdbcConnection = new JdbcConnection();

        Properties properties = jdbcConnection.loadProperties();
        Connection connection = DriverManager.getConnection(
                properties.getProperty("url"),
                properties.getProperty("username"),
                properties.getProperty("password"));
        return connection;
    }

    private Properties loadProperties() throws IOException {
        InputStream stream = this.getClass().getResourceAsStream("db.properties");

        Properties properties = new Properties();
        properties.load(stream);
        return properties;
    }

    public void addPlayer(Connection connection, String name, int age) throws SQLException {
        String sql = "insert into users(name, age) values(?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, age);
        preparedStatement.execute();
    }

    public LinkedList<User> getPlayers(Connection connection) throws SQLException {
        LinkedList<User> usersLinkedList = new LinkedList<>();
        User user;
        String sql = "select * from users";

        Statement statement = connection.createStatement();
        statement.executeQuery(sql);

        ResultSet resultSet = statement.getResultSet();
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            user = new User(name, age);
            usersLinkedList.add(user);
        }
        return usersLinkedList;
    }
}
