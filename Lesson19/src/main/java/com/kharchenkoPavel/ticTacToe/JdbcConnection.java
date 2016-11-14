package com.kharchenkoPavel.ticTacToe;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.Properties;
import java.util.Date;

import static com.kharchenkoPavel.ticTacToe.Result.*;

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

        String sql2 = "insert into statistic (player_id, won, draw, lost) " +
                "values ((select users.id from users where name='" + name + "'), 0, 0, 0)";
        preparedStatement = connection.prepareStatement(sql2);
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

    public String getStatistic(Connection connection) throws SQLException {
        String sql = "select u.name, s.won, s.draw, s.lost from users u inner join statistic s on u.id=s.player_id";

        Statement statement = connection.createStatement();
        statement.executeQuery(sql);

        ResultSet resultSet = statement.getResultSet();
        StringBuilder builder = new StringBuilder();
        builder.append("name, won, draw, lost " + "\n");
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            int won = Integer.valueOf(resultSet.getString("won"));
            int draw = Integer.valueOf(resultSet.getString("draw"));
            int lost = Integer.valueOf(resultSet.getString("lost"));

            builder.append(name + ", " + won + ", " + draw + ", " + lost + "\n");
        }
        return builder.toString();
    }

    public void addResultToStatistic(Connection connection, String winnerName, int winnerAge, String lostName, int lostAge, Result result) throws SQLException {
        String sql;
        if (result == DRAW) {
            sql = "update statistic set draw=draw+1 " +
                    "where player_id=(select id from users where name='" + winnerName + "' and age='" + winnerAge + "') " +
                    "or player_id=(select id from users where name='" + lostName + "' and age='" + lostAge + "');";
        } else {
            sql = "update statistic set won=won+1 where player_id=(select id from users where name='" + winnerName + "' and age='" + winnerAge + "');";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();
            sql = "update statistic set lost=lost+1 where player_id=(select id from users where name='" + lostName + "' and age='" + lostAge + "');";
        }
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.execute();
    }

    public void addResultToGameData(Connection connection, String firstPLayer, int firstPLayerAge, String secondPLayer, int secondPLayerAge, Result result) throws SQLException {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = format.format(date);
        int intResult = 0;
        if (result == FIRST_PLAYER) intResult = 1;
        if (result == SECOND_PLAYER) intResult = 2;

        String sql = "insert into game_data(first_player_id, second_player_id, result, date_time) " +
                "values((select users.id from users where name='" + firstPLayer + "' and age='" + firstPLayerAge + "')," +
                "(select users.id from users where name='" + secondPLayer + "' and age='" + secondPLayerAge + "')," + intResult + ",'" + dateTime + "')";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.execute();
    }
}
