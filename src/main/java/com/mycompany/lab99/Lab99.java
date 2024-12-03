/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab99;

import static com.mycompany.lab99.User.login;
import static com.mycompany.lab99.User.hashPassword;
import static com.mycompany.lab99.User.loadUsers;
import static com.mycompany.lab99.User.saveUsers;
import static com.mycompany.lab99.User.signUp;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Victus
 */
public class Lab99 {
    public static void main(String[] args) throws ParseException, NoSuchAlgorithmException {

 User newUser = new User("55", "test1@example.com", "user0", "password0", "2000-01-01");
        signUp(newUser);
        signUp(newUser);
        // Sign up the user
        int signUpResult = User.signUp(newUser);      
            
            // Test login with plain password
          String   pass=hashPassword("password0");
            boolean isLoggedIn = User.login("user0",pass);
            if (isLoggedIn) {
                System.out.println("Login successful! Welcome, user5!");
            } else {
                System.out.println("Login failed! Invalid username or password.");
            }
        } 
    }

