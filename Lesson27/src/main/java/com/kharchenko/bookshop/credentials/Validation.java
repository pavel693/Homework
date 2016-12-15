package com.kharchenko.bookshop.credentials;

import com.kharchenko.bookshop.persistence.Connection;
import com.kharchenko.bookshop.persistence.User;

import java.util.List;

public class Validation {

    private String login;
    private String password;

    public Validation(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public boolean userValidation() {
        Connection connection = new Connection();
        String hql = "from User u where login='" + login + "'";

        List<User> usersList = connection.getFromDataBase(hql);

        for (User user : usersList) {
            return (user.getLogin().equals(login) && user.getPass().equals(password));
        }
        return false;
    }
}
