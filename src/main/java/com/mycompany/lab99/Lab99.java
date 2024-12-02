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
      DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Constructing a new user
        String userId = "3"; // Unique identifier
        String email = "user3@example.com";
        String username = "UserThree";
        String hashedPassword = "112"; 
        Date dateOfBirth = dateFormat.parse("2002-03-03");
        String status = "Online";

        // Creating the user object
        User newUser = new User(userId, email, username, hashedPassword, dateOfBirth, status);
        System.out.println(newUser.toString());

    }
}
