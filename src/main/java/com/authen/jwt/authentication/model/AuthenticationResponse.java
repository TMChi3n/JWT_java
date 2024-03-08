package com.authen.jwt.authentication.model;

public class AuthenticationResponse {
    private String token;
    private String message;
    
    public String getToken() {
        return token;
    }

    public String getMessage() {
        return message;
    }

    public AuthenticationResponse(String token, String message) {
        this.token = token;
        this.message = message;
    }

    
}
