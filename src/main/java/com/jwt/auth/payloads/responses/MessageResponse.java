package com.jwt.auth.payloads.responses;

public class MessageResponse {
    public String message;

    public MessageResponse(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}