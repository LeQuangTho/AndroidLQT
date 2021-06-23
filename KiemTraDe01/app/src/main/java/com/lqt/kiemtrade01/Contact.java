package com.lqt.kiemtrade01;

public class Contact {
    private int Id;
    private String Name;
    private String PhoneNumber;
    private boolean Status;
    public Contact(int id, String name, String phoneNumber, boolean status) {
        Id = id;
        Name = name;
        PhoneNumber = phoneNumber;
        Status = status;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
    public boolean isStatus() {
        return Status;
    }
    public void setStatus(boolean status) {
        Status = status;
    }
}