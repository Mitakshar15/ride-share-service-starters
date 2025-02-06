package com.rideshare.service.lib.dtos.api;


public enum ErrorType {

    REQUEST_ERROR("REQUEST_ERROR"), API_ERROR("GENERAL_ERROR");

    private String value;

    ErrorType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
