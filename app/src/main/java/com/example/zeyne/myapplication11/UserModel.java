package com.example.zeyne.myapplication11;

/**
 * Created by zeyne on 14.03.2018.
 */

public class UserModel {

    boolean isSelected;
    String userName;

    //now create constructor and getter setter method using shortcut like command+n for mac & Alt+Insert for window.


    public UserModel(boolean isSelected, String userName) {
        this.isSelected = isSelected;
        this.userName = userName;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}