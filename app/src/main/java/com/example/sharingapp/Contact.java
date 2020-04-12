package com.example.sharingapp;

import java.util.UUID;

public class Contact {
    private String id;
    private String email;
    private String userName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Contact(String username, String email, String id) {
        this.userName = username;
        this.email = email;

        if (id == null){
            setId();
        } else {
            updateId(id);
        }
    }

    public void setId() {
        this.id = UUID.randomUUID().toString();
    }

    public void updateId(String id){
        this.id = id;
    }



}
