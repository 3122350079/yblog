package com.boot.pojo;

public class user_authority {

    private int user_id;
    private int authority_id;


    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getAuthority_id() {
        return authority_id;
    }

    public void setAuthority_id(int authority_id) {
        this.authority_id = authority_id;
    }

    @Override
    public String toString() {
        return "user_authority{" +
                "user_id=" + user_id +
                ", authority_id=" + authority_id +
                '}';
    }
}
