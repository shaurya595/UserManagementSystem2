package com.Geekster.UserManagementSystem.Models;

public class User {
    private String UserId ;
    private String UserName;
    private String UserAddress;
    private int UserNumber;

    public int getUserNumber() {
        return UserNumber;
    }

    public void setUserNumber(int userNumber) {
        UserNumber = userNumber;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getUserAddress() {
        return UserAddress;
    }

    public void setUserAddress(String userAddress) {
        UserAddress = userAddress;
    }
}
