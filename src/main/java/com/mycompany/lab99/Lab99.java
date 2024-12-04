/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab99;

import static com.mycompany.lab99.FriendRequest.sendRequest;
import static com.mycompany.lab99.Post.loadPosts;
import static com.mycompany.lab99.Post.savePosts;
import static com.mycompany.lab99.Story.loadStories;
import static com.mycompany.lab99.Story.saveStories;
import static com.mycompany.lab99.User.loadUsers;
import static com.mycompany.lab99.User.saveUsers;
import static com.mycompany.lab99.User.signUp;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONObject;

/**
 *
 * @author Victus
 */
public class Lab99 {

    public static void main(String[] args) throws ParseException, NoSuchAlgorithmException {
        try {
    


       boolean x=sendRequest("oo","alii");

if(x){System.out.println("Saved");
       
    }else{
    
    System.out.println("error");
}
        }
        
        catch (Exception e) {
        e.printStackTrace();
        
        
        
}}
}
