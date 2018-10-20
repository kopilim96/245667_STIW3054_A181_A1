package com.assignment1;

import  java.util.*;

public class Data {

    private int num;
    private String column1, column2;

    public Data(){
        super();
    }

    public Data(int num, String column1, String column2) {
        super();
        this.num = num;
        this.column1 = column1;
        this.column2 = column2;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2;
    }
}
