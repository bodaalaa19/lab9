/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab99;

import java.time.LocalDate;

/**
 *
 * @author shams
 */
public class Story {
    private int authorId;
    private int contentId;
    private String content;
    private LocalDate timestamp;
    //private User user;
    
    public Story() {
    }

    public int getAuthorId() {
        return authorId;
    }

    public int getContentId() {
        return contentId;
    }

    public String getContent() {
        return content;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }
}
