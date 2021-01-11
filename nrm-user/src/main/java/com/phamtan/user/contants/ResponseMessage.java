package com.phamtan.user.contants;

public enum ResponseMessage {
    USER_NOT_FOUND("Not found user");
    ;
    private String message;

    ResponseMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
