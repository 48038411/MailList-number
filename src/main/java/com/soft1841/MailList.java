package com.soft1841;

public class MailList {
    private String name;
    //封装头像
    private String avatar;
    //封装性别
    private String gender;
    //封装手机号
    private String phoneNumber;
    //封装民族
    private String nation;
    //封装宿舍号
    private String dormitoryId;
    //封装学号
    private String studentId;
    //封装家庭住址
    private String homeAddress;

    public MailList(String name, String avatar, String gender, String phoneNumber, String nation, String dormitoryId, String studentId, String homeAddress) {
        this.name = name;
        this.avatar = avatar;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.nation = nation;
        this.dormitoryId = dormitoryId;
        this.studentId = studentId;
        this.homeAddress = homeAddress;
    }

    public MailList() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getDormitoryId() {
        return dormitoryId;
    }

    public void setDormitoryId(String dormitoryId) {
        this.dormitoryId = dormitoryId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return this.avatar+","+this.name + "," + this.gender + "," + this.phoneNumber + "," + this.homeAddress + ","  + this.nation + "," + this.dormitoryId+","+this.studentId;
    }
}
