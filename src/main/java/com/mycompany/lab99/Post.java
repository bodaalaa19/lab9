package com.mycompany.lab99;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;

public class Post extends Content{
    private DateTimeFormatter formatter;
    private static int postCounter=0;
    private ArrayList<Post> posts;
    
    public Post() {
        formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        posts=new ArrayList<>();
    }
    
    public void createPost(User user){
        Post post=new Post();
        Scanner sc=new Scanner(System.in);
        String userId=user.getUserId();
        LocalDateTime ldt=LocalDateTime.now();
        LocalDateTime formattedTime=LocalDateTime.parse(ldt.format(formatter), formatter);
        String content;
        content=sc.nextLine();
        post.setContentId("P"+postCounter++);
        post.setUserId(userId);
        post.setTimeStamp(formattedTime);
        post.setContent(content);
        posts.add(post);
    }
    
    public void savePosts(ArrayList<Post> posts){
        JSONArray postArray=new JSONArray();
        for(Post post : posts){
           JSONObject j=new JSONObject();
            j.put("postId",post.getContentId());
            j.put("userId",post.getUserId());
            j.put("content",post.getContent());
            j.put("timestamp",post.getTimeStamp());
            postArray.put(j);
        }
           try (FileWriter file = new FileWriter("posts.json")) {
            file.write(postArray.toString(4)); //  print with an indentation of 4 spaces
            file.close();
            System.out.println("Posts successfully saved to posts.json!");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
    
    
    
}
