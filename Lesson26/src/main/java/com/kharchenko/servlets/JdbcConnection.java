package com.kharchenko.servlets;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
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

    public String getStatistic(Connection connection) throws SQLException {
        String sql = "select  s.lname, s.fname, sub.name, g.grade\n" +
                "from grades g inner join students s on g.student_id=s.id\n" +
                "inner join subjects sub on g.subject_id=sub.id\n" +
                "order by s.lname, sub.name";

        Statement statement = connection.createStatement();
        statement.executeQuery(sql);

        ResultSet resultSet = statement.getResultSet();
        StringBuilder builder = new StringBuilder();

        while (resultSet.next()) {
            String lname = resultSet.getString("fname");
            String fname = resultSet.getString("lname");
            String name = resultSet.getString("name");
            int grade = Integer.valueOf(resultSet.getString("grade"));

            builder.append(fname + " " + lname + " " + name + " - " + grade + "\n");
        }
        return builder.toString();
    }
}
