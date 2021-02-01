package com.codeup.adlister.dao;

class Config {
    public String getUrl() {
        return "jdbc:mysql://localhost/database_name?serverTimezone=UTC&useSSL=false";
    }
    public String getUser() {
        return "user";
    }
    public String getPassword() {
        return "password";
    }
}
