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
import java.util.List;

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
    private Profile profile;
    private List<User> friends;
    private List<Post> posts;
    private List<Story> stories;

    // Date formatter
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    // Constructor
    public User(String userId, String email, String username, String password, String dateOfBirth, String status) throws NoSuchAlgorithmException, ParseException {
        this.userId = userId;
        this.email = email;
        this.username = username;
        this.hashedPassword = hashPassword(password); // Hash the password
        this.dateOfBirth = dateFormat.parse(dateOfBirth); // Parse the date
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

    public void setHashedPassword(String password) throws NoSuchAlgorithmException {
        this.hashedPassword = hashPassword(password); // Hash the password
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) throws ParseException {
        this.dateOfBirth = dateFormat.parse(dateOfBirth);
    }

    public String getFormattedDateOfBirth() {
        return dateFormat.format(dateOfBirth);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", hashedPassword='" + hashedPassword + '\'' +
                ", dateOfBirth='" + getFormattedDateOfBirth() + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    // Static method to hash passwords
    public static String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashedBytes = md.digest(password.getBytes());
        return Base64.getEncoder().encodeToString(hashedBytes);
    }

    public Profile getProfile() {
        return profile;
    }

    public List<User> getFriends() {
        return friends;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public List<Story> getStories() {
        return stories;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public void setStories(List<Story> stories) {
        this.stories = stories;
    }
    
    
}
    


