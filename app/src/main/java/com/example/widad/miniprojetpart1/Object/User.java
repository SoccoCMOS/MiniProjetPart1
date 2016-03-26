package com.example.widad.miniprojetpart1.Object;

/**
 * Created by widad on 23/03/2016.
 */
public class User {
    private String username ;
    private int  ID ;
    private String password ;

    public User(String username, int ID, String password) {
        this.username = username;
        this.ID = ID;
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
