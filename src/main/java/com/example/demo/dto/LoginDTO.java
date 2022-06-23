package com.example.demo.dto;

/**
 * Description: $DESCRIPTION
 * Project: demo
 * Created by :monirul.islam822
 * Created on : 23-Jun-2022 , 3:38 PM
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */

public class LoginDTO {
    private String username;
    private String password;
    private boolean rememberMe;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }
}
