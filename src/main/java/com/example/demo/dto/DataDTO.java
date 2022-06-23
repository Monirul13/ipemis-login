package com.example.demo.dto;

/**
 * Description: $DESCRIPTION
 * Project: demo
 * Created by :monirul.islam822
 * Created on : 23-Jun-2022 , 3:52 PM
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */

public class DataDTO {
    private String token;
    private String rememberMeNonce;

    public DataDTO() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRememberMeNonce() {
        return rememberMeNonce;
    }

    public void setRememberMeNonce(String rememberMeNonce) {
        this.rememberMeNonce = rememberMeNonce;
    }
}
