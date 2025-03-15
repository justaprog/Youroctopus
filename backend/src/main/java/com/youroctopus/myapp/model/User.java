package com.youroctopus.myapp.model;

import java.time.LocalDateTime;

public class User {
    private Integer user_id;
    private String name;
    private String email;
    private String phone;
    private String password_hash;
    private String role;
    private LocalDateTime created_at;

    public User(Integer user_id, String name, String email, String phone, String password_hash, String role, LocalDateTime created_at) {
        this.user_id = user_id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password_hash = password_hash;
        this.role = role;
        this.created_at = created_at;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public String getRole() {
        return role;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }
}
