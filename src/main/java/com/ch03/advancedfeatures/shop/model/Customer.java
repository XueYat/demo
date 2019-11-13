package com.ch03.advancedfeatures.shop.model;

/**
 * @author YatXue
 * @date 2019/4/5 17:50
 */
public class Customer {
    private String name;
    private String cardId;
    private String username;
    private String password;
    private double integral;

    public Customer(){}

    public Customer(String name, String cardId, String username, String password, double integral) {
        this.name = name;
        this.cardId = cardId;
        this.username = username;
        this.password = password;
        this.integral = integral;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getIntegral() {
        return integral;
    }

    public void setIntegral(double integral) {
        this.integral = integral;
    }
}
