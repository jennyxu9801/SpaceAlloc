package com.example.spacealloc;

public class Booth {
    private int boothID;            //each booth has a unique id
    private String projectName;
    private String boothType;
    private double length = 1.0;    //default length is 1.0 metre
    private double width = 1.0;     //default width is 1.0 metre
    private double height = 1.0;    //default height is 1.0 metre

    public int getBoothID() {
        return boothID;
    }

    public void setBoothID(int boothID) {
        this.boothID = boothID;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getBoothType() {
        return boothType;
    }

    public void setBoothType(String boothType) {
        this.boothType = boothType;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Booth(String projectName, String boothType, double length, double width, int boothID) {
        this.projectName = projectName;
        this.boothType = boothType;
        this.length = length;
        this.width = width;
        this.boothID = boothID;
    }
}
