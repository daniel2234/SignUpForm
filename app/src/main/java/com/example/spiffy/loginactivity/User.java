package com.example.spiffy.loginactivity;

import java.io.Serializable;

/**
 * Created by Spiffy on 3/27/2016.
 */
public class User implements Serializable {
    private String mUsername;
    private String mPassword;

    User(String username , String password){
        this.mUsername = username;
        this.mPassword = password;
    }

     public String getUsername(){
        return mUsername;
    }

}
