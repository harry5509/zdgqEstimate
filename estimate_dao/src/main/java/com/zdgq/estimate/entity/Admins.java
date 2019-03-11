package com.zdgq.estimate.entity;

public class Admins {

    private String id;

    private String userName;

    private String password;

    private String power;

    private String role;

    public Admins(String id,String userName, String password, String power, String role) {

        this.userName = userName;
        this.password = password;
        this.power = power;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Admins{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", power='" + power + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
