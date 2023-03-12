package com.me.kirilltrosnickii;

public class User {
    private String login;
    private String password;

    public User(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        // валідація логіну
        if (!login.matches("^[a-zA-Z]{1,20}$")) {
            throw new WrongLoginException("Wrong login! Login should contain only letters of the English alphabet and its length should be no more than 20 characters.");
        }
        this.login = login;

        // валідація паролю
        if (!password.matches("^(?=.*[a-zA-Z])(?=.*\\d).{6,25}$") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Wrong password! Password should contain at least one letter and one digit, and its length should be between 6 and 25 characters. Password and confirm password should be equal.");
        }
        this.password = password;
    }

    // геттери і сеттери
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
