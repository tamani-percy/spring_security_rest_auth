package com.example.king_auth_spring_yamene.Payload.Request;

import jakarta.annotation.Nonnull;

import java.util.Set;

public class SignupRequest {

    @Nonnull
    private String username;

    @Nonnull
    private String email;

    @Nonnull
    private String password;

    private Set<String> roles;

    @Nonnull
    public String getUsername() {
        return username;
    }

    public void setUsername(@Nonnull String username) {
        this.username = username;
    }

    @Nonnull
    public String getEmail() {
        return email;
    }

    public void setEmail(@Nonnull String email) {
        this.email = email;
    }

    @Nonnull
    public String getPassword() {
        return password;
    }

    public void setPassword(@Nonnull String password) {
        this.password = password;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }


}
