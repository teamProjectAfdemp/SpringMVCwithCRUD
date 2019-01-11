package com.candidjava.spring.bean;


import java.util.Date;

public class User{
    private int id;
    private String username;
    private String fname;
    private String lname;
    private Date regDate;
    private boolean active;

    
    //CONSTRUCTORS
    public User() { }

    public User(int id) {
        this.id = id;
    }

    public int getID(){
        return id;
    }

    public void setID(int id){
        this.id = id;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getFname(){
        return fname;
    }

    public void setFname(String fname){
        this.fname = fname;
    }

    public String getLname(){
        return lname;
    }

    public void setLname(String lname){
        this.lname = lname;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active){
        this.active = active;
    }


    public void accessError(){
        System.out.println("Not allowed!");
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
}
