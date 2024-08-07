package com.example.king_auth_spring_yamene.Payload.Request;

import jakarta.annotation.Nonnull;

public class LoginRequest {
    @Nonnull
    private String username;
    @Nonnull
    private String password;

    @Nonnull
    public String getUsername() {
        return username;
    }

    public void setUsername(@Nonnull String username) {
        this.username = username;
    }

    @Nonnull
    public String getPassword() {
        return password;
    }

    public void setPassword(@Nonnull String password) {
        this.password = password;
    }


}
