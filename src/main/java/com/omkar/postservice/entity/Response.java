package com.omkar.postservice.entity;

import lombok.Data;

@Data
public class Response {
    private int httpStatus;
    private String message;
    private Object payload;

    public Response(int httpStatus, String message, Object payload) {
        this.httpStatus = httpStatus;
        this.message = message;
        this.payload = payload;
    }
}
