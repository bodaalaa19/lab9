/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab99;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

/**
 *
 * @author al-aqsa
 */
public class User {
        private String userId;
    private String email;
    private String username;
    private String hashedPassword;
    private Date dateOfBirth; 
    private String status; 

    // Date formatter
    private static final DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    // Constructor
    public User(String userId, String email, String username, String hashedPassword, Date dateOfBirth, String status) throws NoSuchAlgorithmException {
        this.userId = userId;
        this.email = email;
        this.username = username;
        this.hashedPassword = hashPassword(hashedPassword);
        this.dateOfBirth = dateOfBirth;
        this.status = status;
    }

    // Getters and Setters
    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) throws NoSuchAlgorithmException {
        this.hashedPassword = hashPassword(hashedPassword);
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) throws ParseException {
        this.dateOfBirth = formatter.parse(dateOfBirth);
    }

    public String getFormattedDateOfBirth() {
        return formatter.format(dateOfBirth);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
       public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ",password= "+hashedPassword+
                ", dateOfBirth='" + getFormattedDateOfBirth() + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
   public static String hashPassword(String password) throws NoSuchAlgorithmException {
       MessageDigest md=MessageDigest.getInstance("SHA-256");
       byte[]hashedBytes=md.digest(password.getBytes());
       return Base64.getEncoder().encodeToString(hashedBytes);
   }
    
}

