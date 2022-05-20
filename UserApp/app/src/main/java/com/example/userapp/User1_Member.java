package com.example.userapp;

//emailとpassを定義
public class User1_Member {
    private  String email;
    private String password;
    public User1_Member(){}

    public User1_Member(String email, String password){
        this.email = email;
        this.password = password;
    }
    public String get_Email(){
        return email;
    }

    public void set_Email(String email){
        this.email = email;
    }

    public String get_Password(){
        return password;
    }

    public void set_Password(String password){
        this.password = password;
    }
}
