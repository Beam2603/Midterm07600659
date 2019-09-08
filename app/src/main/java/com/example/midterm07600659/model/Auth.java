package com.example.midterm07600659.model;

public class Auth {

    private static final String USERNAME = "bbb";
    private static final String PASSWORD = "222";
    private String mus;
    private String mpassword;

    //กด code > Gennarate
    public Auth(String usname, String password) {
        this.mus = usname;
        this.mpassword = password;
    }

    public boolean check() {
        if (mus.equals(USERNAME) && mpassword.equals(PASSWORD)) {
            return true;
        } else {
            return false;
        }
    }
}