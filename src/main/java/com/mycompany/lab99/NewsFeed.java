/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.lab99;

import static com.mycompany.lab99.BlockedFriends.blockFriend;
import static com.mycompany.lab99.BlockedFriends.unblockFriend;
import static com.mycompany.lab99.FriendContent.getFriendPosts;
import static com.mycompany.lab99.FriendContent.getFriendStories;
import static com.mycompany.lab99.FriendRequest.sendRequest;
import static com.mycompany.lab99.Friends.search;
import static com.mycompany.lab99.Friends.suggestFriends;
import static com.mycompany.lab99.Friends.viewRequestSenders;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Victus
 */
public class NewsFeed extends javax.swing.JFrame {

    /**
     * Creates new form NewsFeed
     */
    public NewsFeed() {
        initComponents();
                        DefaultListModel<String> listModel = new DefaultListModel<>();
ArrayList<String> s=viewRequestSenders(LoginScreen.activeUser.getUserId());
        for (String string : s) {
            listModel.addElement(string);
        }
FriendReqList.setModel(listModel);
                        DefaultListModel<String> listModel2 = new DefaultListModel<>();
                        ArrayList<Post> posts=getFriendPosts(LoginScreen.activeUser.getUserId());
                       for (Post post : posts) {
                           listModel2.addElement(post.getContent());
            
        }
FriendsPostsList.setModel(listModel2);
                        DefaultListModel<String> listModel3 = new DefaultListModel<>();
                                            Story.deleteStories();

                        ArrayList<Story> stories=getFriendStories(LoginScreen.activeUser.getUserId());
        for (Story story : stories) {
         listModel3.addElement(story.getContent());
        }
        FriendsStoriesList.setModel(listModel3);
                                DefaultListModel<String> listModel4 = new DefaultListModel<>();
                                ArrayList<User> suggests=suggestFriends(LoginScreen.activeUser.getUserId());
                                for (User suggest : suggests) {
            listModel4.addElement(suggest.getUserId());
        }
                                SuggestList.setModel(listModel4);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackToProfileBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        FriendReqList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        FriendsPostsList = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        FriendsStoriesList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ApproveBtn = new javax.swing.JButton();
        DeclineBtn = new javax.swing.JButton();
        ViewPostBtn = new javax.swing.JButton();
        ViewStoryBtn1 = new javax.swing.JButton();
        idText = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        searchList = new javax.swing.JList<>();
        AddFriendBtn = new javax.swing.JButton();
        refresh2 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        SuggestList = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        AddSuggest = new javax.swing.JButton();
        UnblockBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackToProfileBtn.setBackground(new java.awt.Color(102, 255, 153));
        BackToProfileBtn.setText("Back to profile page");
        BackToProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToProfileBtnActionPerformed(evt);
            }
        });

        FriendReqList.setBackground(new java.awt.Color(255, 51, 204));
        FriendReqList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(FriendReqList);

        jLabel1.setText("Friends request:");

        FriendsPostsList.setBackground(new java.awt.Color(255, 51, 204));
        FriendsPostsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(FriendsPostsList);

        FriendsStoriesList.setBackground(new java.awt.Color(255, 51, 204));
        FriendsStoriesList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(FriendsStoriesList);

        jLabel2.setText("Friends posts");

        jLabel3.setText("Friends stories");

        ApproveBtn.setBackground(new java.awt.Color(255, 204, 204));
        ApproveBtn.setText("Approve");
        ApproveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApproveBtnActionPerformed(evt);
            }
        });

        DeclineBtn.setBackground(new java.awt.Color(255, 204, 255));
        DeclineBtn.setText("Decline");
        DeclineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeclineBtnActionPerformed(evt);
            }
        });

        ViewPostBtn.setBackground(new java.awt.Color(255, 204, 204));
        ViewPostBtn.setText("Veiw Post");
        ViewPostBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPostBtnActionPerformed(evt);
            }
        });

        ViewStoryBtn1.setBackground(new java.awt.Color(255, 204, 204));
        ViewStoryBtn1.setText("Veiw Story");
        ViewStoryBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewStoryBtn1ActionPerformed(evt);
            }
        });

        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        searchList.setBackground(new java.awt.Color(255, 51, 204));
        jScrollPane6.setViewportView(searchList);

        AddFriendBtn.setBackground(new java.awt.Color(255, 204, 204));
        AddFriendBtn.setText("Add friend");
        AddFriendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddFriendBtnActionPerformed(evt);
            }
        });

        refresh2.setText("refresh");
        refresh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh2ActionPerformed(evt);
            }
        });

        SuggestList.setBackground(new java.awt.Color(255, 51, 204));
        jScrollPane7.setViewportView(SuggestList);

        jLabel4.setText("Suggest Friends:");

        AddSuggest.setBackground(new java.awt.Color(255, 204, 204));
        AddSuggest.setText("Add friend");
        AddSuggest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSuggestActionPerformed(evt);
            }
        });

        UnblockBtn.setBackground(new java.awt.Color(255, 204, 204));
        UnblockBtn.setText("Unblock");
        UnblockBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnblockBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ApproveBtn)
                                    .addComponent(DeclineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(refresh2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AddSuggest, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AddFriendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UnblockBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SearchBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ViewPostBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ViewStoryBtn1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackToProfileBtn)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BackToProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchBtn))
                        .addComponent(idText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UnblockBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddFriendBtn)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(refresh2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddSuggest)
                        .addGap(42, 42, 42)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(112, 112, 112)
                                        .addComponent(DeclineBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(ApproveBtn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(136, 136, 136)
                                        .addComponent(ViewPostBtn)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ViewStoryBtn1)
                                .addGap(65, 65, 65))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane5)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackToProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToProfileBtnActionPerformed
        // TODO add your handling code here:'
        ProfilePage profilePage=new ProfilePage(LoginScreen.activeUser);
        profilePage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackToProfileBtnActionPerformed

    private void ApproveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApproveBtnActionPerformed
        // TODO add your handling code here:
        String ss=FriendReqList.getSelectedValue();
//        int index=FriendReqList.getSelectedIndex();
//        ArrayList<String> s=viewRequestSenders("best");
//        Friends.acceptRequest(s.get(index), LoginScreen.activeUser.getUserId());
        Friends.acceptRequest(ss, LoginScreen.activeUser.getUserId());
           JOptionPane.showMessageDialog(this, " approved", "approved", JOptionPane.INFORMATION_MESSAGE);

//this.dispose();
//this.setVisible(true);
    }//GEN-LAST:event_ApproveBtnActionPerformed

    private void DeclineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeclineBtnActionPerformed
        // TODO add your handling code here:
//                int index=FriendReqList.getSelectedIndex();
//        ArrayList<String> s=viewRequestSenders("best");
//        Friends.declineRequest(s.get(index), LoginScreen.activeUser.getUserId
String sss=FriendReqList.getSelectedValue();
Friends.declineRequest(sss, LoginScreen.activeUser.getUserId());
           JOptionPane.showMessageDialog(this, " Declined", "Declined", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_DeclineBtnActionPerformed

    private void ViewPostBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPostBtnActionPerformed
        // TODO add your handling code here:
        ArrayList<Post> posts2=getFriendPosts(LoginScreen.activeUser.getUserId());
        int index=FriendsPostsList.getSelectedIndex();
        Post p=posts2.get(index);
         ViewPost viewPost=new ViewPost(p);
        viewPost.setVisible(true);
    }//GEN-LAST:event_ViewPostBtnActionPerformed

    private void ViewStoryBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewStoryBtn1ActionPerformed
        // TODO add your handling code here:
        ArrayList<Story> story2=getFriendStories(LoginScreen.activeUser.getUserId());
        int index=FriendsStoriesList.getSelectedIndex();
        Story s=story2.get(index);
        ViewStory viewStory=new ViewStory(s);
                    viewStory.setVisible(true);
    }//GEN-LAST:event_ViewStoryBtn1ActionPerformed

    private void AddFriendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddFriendBtnActionPerformed
        // TODO add your handling code here:
        User l=null;
        String s=searchList.getSelectedValue();
        ArrayList<User> A=User.loadUsers();
        for (User user : A) {
            if(s.equals(user.getUsername())){
                 l=user;
            break;}
        }
        sendRequest(LoginScreen.activeUser.getUserId(),l.getUserId() );
//           JOptionPane.showMessageDialog(this, "request sent", "request", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_AddFriendBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
        ArrayList<User> a=search(idText.getText());
                                DefaultListModel<String> listModel2 = new DefaultListModel<>();
                                for (User user : a) {
            listModel2.addElement(user.getUsername());
        }
searchList.setModel(listModel2);
    
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void refresh2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh2ActionPerformed
        // TODO add your handling code here:
         DefaultListModel<String> friendReqModel = new DefaultListModel<>();
    ArrayList<String> friendRequests = viewRequestSenders(LoginScreen.activeUser.getUserId());
    for (String request : friendRequests) {
        friendReqModel.addElement(request);
    }
    FriendReqList.setModel(friendReqModel);

    // Refresh Friend Posts
    DefaultListModel<String> postsModel = new DefaultListModel<>();
    ArrayList<Post> friendPosts = getFriendPosts(LoginScreen.activeUser.getUserId());
    for (Post post : friendPosts) {
        postsModel.addElement(post.getContent());
    }
    FriendsPostsList.setModel(postsModel);

    // Refresh Friend Stories
    DefaultListModel<String> storiesModel = new DefaultListModel<>();
    Story.deleteStories(); // Ensure expired stories are removed
    ArrayList<Story> friendStories = getFriendStories(LoginScreen.activeUser.getUserId());
    for (Story story : friendStories) {
        storiesModel.addElement(story.getContent());
    }
    FriendsStoriesList.setModel(storiesModel);

    }//GEN-LAST:event_refresh2ActionPerformed

    private void AddSuggestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSuggestActionPerformed
        // TODO add your handling code here:
        String s=SuggestList.getSelectedValue();

        sendRequest(LoginScreen.activeUser.getUserId(),s );
    }//GEN-LAST:event_AddSuggestActionPerformed

    private void UnblockBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnblockBtnActionPerformed
        // TODO add your handling code here:
        String f=searchList.getSelectedValue();
        unblockFriend(LoginScreen.activeUser.getUserId(),f);
        JOptionPane.showMessageDialog(this, "Unblocked");
    }//GEN-LAST:event_UnblockBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewsFeed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewsFeed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewsFeed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewsFeed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewsFeed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddFriendBtn;
    private javax.swing.JButton AddSuggest;
    private javax.swing.JButton ApproveBtn;
    private javax.swing.JButton BackToProfileBtn;
    private javax.swing.JButton DeclineBtn;
    private javax.swing.JList<String> FriendReqList;
    private javax.swing.JList<String> FriendsPostsList;
    private javax.swing.JList<String> FriendsStoriesList;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JList<String> SuggestList;
    private javax.swing.JButton UnblockBtn;
    private javax.swing.JButton ViewPostBtn;
    private javax.swing.JButton ViewStoryBtn1;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JButton refresh2;
    private javax.swing.JList<String> searchList;
    // End of variables declaration//GEN-END:variables
}
