/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab99;

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

/**
 *
 * @author Victus
 */
public class Lab99 {

    public static void main(String[] args) throws ParseException, NoSuchAlgorithmException {
        /*ArrayList<Story> stories=new ArrayList<>();
        Story story1=new Story("bba","storycontenttest1",LocalDateTime.now(),"imagesrc1");
        Story story2=new Story("bba","storycontenttest2",LocalDateTime.now().plusHours(12),"imagesrc2");
        Story story3=new Story("bbc","storycontenttest3",LocalDateTime.now().plusHours(24),"imagesrc3");
        stories.add(story1);
        stories.add(story2);
        stories.add(story3);
        
        Story.saveStories(stories);
        for(int i=0;i<stories.size();i++){
            System.out.println(stories.get(i));
        }*/
        
        Story.deleteStories();
        /*ArrayList<Story>stories=Story.loadStories();
        for(int i=0;i<stories.size();i++){
            System.out.println(stories.get(i));
        }*/
}}
