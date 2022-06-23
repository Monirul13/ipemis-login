package com.example.demo.dto;

/**
 * Description: $DESCRIPTION
 * Project: demo
 * Created by :monirul.islam822
 * Created on : 23-Jun-2022 , 3:52 PM
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */

public class LoginResponseDTO {

    private String meta;
    private DataDTO data;

    public LoginResponseDTO() {
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public DataDTO getData() {
        return data;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }
}
