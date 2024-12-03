/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab99;

import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Victus
 */
public class Lab99 {

    public static void main(String[] args) throws ParseException, NoSuchAlgorithmException {
       
        User user = new User(
            "1",
            "example@example.com",
            "exampleUser",
            "securePassword123",
            "2000-01-01",
            "Online"
        );
        System.out.println(user);
    }
}