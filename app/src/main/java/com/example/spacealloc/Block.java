package com.example.spacealloc;

import java.util.LinkedList;
import java.util.List;

public class Block {
    private int priority;   // priority =1 is Campus center, priority = 2 is second floor
    private int blockID;
    private List<Booth> boothList = new LinkedList<Booth>();

    private double length;
    private double width;

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getBlockID() {
        return blockID;
    }

    public void setBlockID(int blockID) {
        this.blockID = blockID;
    }

    public List<Booth> getBoothList() {
        return boothList;
    }

    public void setBoothList(List<Booth> boothList) {
        this.boothList = boothList;
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

    public Block(int priority, int blockID, double length, double width) {
        this.priority = priority;
        this.blockID = blockID;
        this.length = length;
        this.width = width;
    }
}
