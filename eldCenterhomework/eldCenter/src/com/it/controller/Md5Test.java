package com.it.controller;

import com.it.utils.Md5Utils;

public class Md5Test {
    public static void main(String[] args) {
        String password = "123456";
        String newPassword = Md5Utils.md5(password);
        System.out.println(newPassword);
    }
}
