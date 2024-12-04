/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.lab99;

import static com.mycompany.lab99.FriendRequest.loadRequests;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;

public class Friends {

    private static final String FRIENDS_FILE = "Friends.json";
    public static void saveFriends(ArrayList<JSONObject> friendsList) {
        JSONArray friendsArray = new JSONArray(friendsList);
        try (FileWriter file = new FileWriter(FRIENDS_FILE)) {
            file.write(friendsArray.toString(4));
            file.flush();
        } catch (IOException e) {
            System.err.println("Error saving friends: " + e.getMessage());
        }
    }
    public static ArrayList<JSONObject> loadFriends() {
        ArrayList<JSONObject> friendsList = new ArrayList<>();
        File file = new File(FRIENDS_FILE);

        if (!file.exists()) {
            try (FileWriter writer = new FileWriter(file)) {
                writer.write("[]");
                writer.flush();
            } catch (IOException e) {
                System.err.println("Error creating friends file: " + e.getMessage());
            }
        }
        try (FileReader reader = new FileReader(file)) {
            Scanner scanner = new Scanner(reader);
            StringBuilder jsonContent = new StringBuilder();

            while (scanner.hasNextLine()) {
                jsonContent.append(scanner.nextLine());
            }

            JSONArray friendsArray = new JSONArray(jsonContent.toString());
            for (int i = 0; i < friendsArray.length(); i++) {
                friendsList.add(friendsArray.getJSONObject(i));
            }
        } catch (IOException e) {
            System.err.println("Error reading friends file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error parsing JSON or loading friends: " + e.getMessage());
        }

        return friendsList;
    }

    public static boolean acceptRequest(String senderId, String receiverId) {
        ArrayList<JSONObject> requests = FriendRequest.loadRequests();
        ArrayList<JSONObject> friendsList = loadFriends();
        boolean requestFound = false;
        for (int i = 0; i < requests.size(); i++) {
            JSONObject request = requests.get(i);
            if (request.getString("sender").equals(senderId) && request.getString("receiver").equals(receiverId)) {
                JSONObject friendship1 = new JSONObject();
                friendship1.put("user1", senderId);
                friendship1.put("user2", receiverId);
                JSONObject friendship2 = new JSONObject();
                friendship2.put("user1", receiverId);
                friendship2.put("user2", senderId);
                friendsList.add(friendship1);
                friendsList.add(friendship2);
                requests.remove(i);
                requestFound = true;
                break;
            }
        }
        if (requestFound) {
            saveFriends(friendsList);
            FriendRequest.saveRequests(requests);
        }

        return requestFound;
    }

    // Decline a friend request
    public static boolean declineRequest(String senderId, String receiverId) {
        ArrayList<JSONObject> requests = FriendRequest.loadRequests();
        boolean requestFound = false;
        for (int i = 0; i < requests.size(); i++) {
            JSONObject request = requests.get(i);
            if (request.getString("sender").equals(senderId) && request.getString("receiver").equals(receiverId)) {
                requests.remove(i);
                requestFound = true;
                break;
            }
        }
        if (requestFound) {
            FriendRequest.saveRequests(requests);
        }

        return requestFound;
    }
    public static boolean removeFriendship(String userId1, String userId2) {
        ArrayList<JSONObject> friendsList = loadFriends();
        boolean friendshipFound = false;
        for (int i = 0; i < friendsList.size(); i++) {
            JSONObject friendship = friendsList.get(i);
            if ((friendship.getString("user1").equals(userId1) && friendship.getString("user2").equals(userId2)) ||
                (friendship.getString("user1").equals(userId2) && friendship.getString("user2").equals(userId1))) {
                friendsList.remove(i);
                friendshipFound = true;
                i--; 
            }
        }
        if (friendshipFound) {
            saveFriends(friendsList);
        }
        return friendshipFound;
    }
    // Function to view friend request  for a specific user ID
public static ArrayList<String> viewRequestSenders(String userId) {
    ArrayList<JSONObject> requests = loadRequests();
    ArrayList<String> senderIds = new ArrayList<>();

    for (JSONObject request : requests) {
        if (request.getString("receiver").equals(userId)) {
            senderIds.add(request.getString("sender"));
        }
    }

    return senderIds; // Return the list of sender IDs
}

}