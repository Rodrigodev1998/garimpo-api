package com.dev.garimpo.domain.user;

public enum UserRole {

    CONTRIBUTOR("contributor"),
    CLIENT("client");

    private String role;

    UserRole(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }
}
