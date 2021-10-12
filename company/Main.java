package com.company;

public class Main extends MyString{
    public static void main(String[] args) {
        MyString str = new MyString("   He  llo   ");
        MyString str2 = new MyString("World");
        System.out.println(str.trim());
    }
}