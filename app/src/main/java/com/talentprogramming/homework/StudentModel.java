package com.talentprogramming.homework;

public class StudentModel {
    private String sName;
    private String sAddress;
    private String sGender;
    private String sDOB;
    private int sAge;
    private String sPhNo;
    private String sFatherName;
    private String sGrade;

    public StudentModel() {
    }

    public StudentModel(String sName, String sAddress, String sGender, String sDOB,
                        int sAge, String sPhNo, String sFatherName, String sGrade) {
        this.sName = sName;
        this.sAddress = sAddress;
        this.sGender = sGender;
        this.sDOB = sDOB;
        this.sAge = sAge;
        this.sPhNo = sPhNo;
        this.sFatherName = sFatherName;
        this.sGrade = sGrade;
    }


    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public String getsGender() {
        return sGender;
    }

    public void setsGender(String sGender) {
        this.sGender = sGender;
    }

    public String getsDOB() {
        return sDOB;
    }

    public void setsDOB(String sDOB) {
        this.sDOB = sDOB;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    public String getsPhNo() {
        return sPhNo;
    }

    public void setsPhNo(String sPhNo) {
        this.sPhNo = sPhNo;
    }

    public String getsFatherName() {
        return sFatherName;
    }

    public void setsFatherName(String sFatherName) {
        this.sFatherName = sFatherName;
    }

    public String getsGrade() {
        return sGrade;
    }

    public void setsGrade(String sGrade) {
        this.sGrade = sGrade;
    }
}

