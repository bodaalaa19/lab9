/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.lab99;

import com.mycompany.lab99.User;
import java.awt.Image;
import static java.awt.PageAttributes.MediaType.C;
import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author shams
 */
public class ProfilePage extends javax.swing.JFrame {
    
    changePassword changepassword;
    private User user;
    /**
     * Creates new form ProfilePage
     */
    private static final String DEFAULT_COVER_PICTURE_PATH = "C:\\School\\College\\Programming ll\\projects\\lab9\\src\\main\\java\\com\\mycompany\\lab99\\defaultCover.jpg";
    
    private static final String DEFAULT_PROFILE_PICTURE_PATH
            = "C:\\School\\College\\Programming ll\\projects\\lab9\\src\\main\\java\\com\\mycompany\\lab99\\defaultProfile.jpg";
    
    public ProfilePage(User user) {
        initComponents();
        this.user = user;
        this.changepassword = null;
        
        setProfilePicture();
        setCoverPhoto();
        setBio();
        
    }
    
    private void setProfilePicture() {
        String path;

        //fetches stored profile picture
        if (this.user.getProfile().getProfilePhoto().equals("ghvh")) {
            path = DEFAULT_PROFILE_PICTURE_PATH;
        } else {
            path = this.user.getProfile().getProfilePhoto();
        }
        
        File file = new File(path);
        if (file.exists()) {
            ImageIcon icon = new ImageIcon(path);
            Image img = icon.getImage();
            Image scaledImg = img.getScaledInstance(92, 85, Image.SCALE_DEFAULT);
            this.profilePhoto.setIcon(new ImageIcon(scaledImg));
        } else {
            System.err.println("Profile picture not found at: " + path);
        }
    }
    
    private void setCoverPhoto() {
        String path;

        //fetches stored cover picture
        if (this.user.getProfile().getCoverPhoto().equals("hhh")) {
            path = DEFAULT_COVER_PICTURE_PATH;
        } else {
            path = this.user.getProfile().getCoverPhoto();
        }
        
        File file = new File(path);
        if (file.exists()) {
            ImageIcon icon = new ImageIcon(path);
            Image img = icon.getImage();
            Image scaledImg = img.getScaledInstance(302, 85, Image.SCALE_DEFAULT);
            this.coverPhoto.setIcon(new ImageIcon(scaledImg));
        } else {
            System.err.println("Profile picture not found at: " + path);
        }
    }
    
    private void setBio() {
        if (this.user.getProfile().getBio().equals("hfc")) {
            this.bio.setText("add bio");
        } else {
            this.bio.setText(this.user.getProfile().getBio());
        }
    }
    
    private ProfilePage() {
       ;}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profilePhoto = new javax.swing.JLabel();
        coverPhoto = new javax.swing.JLabel();
        bio = new javax.swing.JLabel();
        editProfileButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        profilePhoto.setBackground(new java.awt.Color(255, 255, 255));
        profilePhoto.setOpaque(true);
        profilePhoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeProfilePhoto(evt);
            }
        });

        coverPhoto.setBackground(new java.awt.Color(255, 255, 255));
        coverPhoto.setOpaque(true);
        coverPhoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeCoverPhoto(evt);
            }
        });

        bio.setBackground(new java.awt.Color(255, 255, 255));
        bio.setOpaque(true);
        bio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeBio(evt);
            }
        });

        editProfileButton.setText("Change password");
        editProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProfileButtonActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Friends");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Posts");
        jLabel2.setOpaque(true);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jButton1.setText("Logout");

        jButton2.setText("Home");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(profilePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coverPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(bio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editProfileButton))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(profilePhoto, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(coverPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editProfileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeProfilePhoto(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeProfilePhoto
        JFileChooser x = new JFileChooser();
        x.showOpenDialog(this);
        File f = x.getSelectedFile();
        ImageIcon i = new ImageIcon(f.getAbsolutePath());
        Image img = i.getImage();
        Image scaledImg = img.getScaledInstance(92, 85, Image.SCALE_DEFAULT);
        
        ImageIcon scaledIcon = new ImageIcon(scaledImg);
        this.profilePhoto.setIcon(scaledIcon);
        
        ArrayList<User> users = User.loadUsers();
        
        for (User user : users) {
            if (user.getUsername().equals(this.user.getUsername())) {
                user.getProfile().setProfilePhoto(f.getAbsolutePath());
            }
        }
        
        User.saveUsers(users);
    }//GEN-LAST:event_changeProfilePhoto

    private void changeCoverPhoto(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeCoverPhoto
        JFileChooser x = new JFileChooser();
        x.showOpenDialog(this);
        File f = x.getSelectedFile();
        ImageIcon i = new ImageIcon(f.getAbsolutePath());
        Image img = i.getImage();
        
        Image scaledImg = img.getScaledInstance(303, 85, Image.SCALE_DEFAULT);
        
        ImageIcon scaledIcon = new ImageIcon(scaledImg);
        this.coverPhoto.setIcon(scaledIcon);
        
        ArrayList<User> users = User.loadUsers();
        
        for (User user : users) {
            if (user.getUsername().equals(this.user.getUsername())) {
                user.getProfile().setCoverPhoto(f.getAbsolutePath());
            }
        }
        
        User.saveUsers(users);
    }//GEN-LAST:event_changeCoverPhoto

    private void changeBio(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeBio
        String info;
        info = JOptionPane.showInputDialog(null, "Enter new bio:", "Input Dialog", JOptionPane.PLAIN_MESSAGE);
        
        if (info != null) {
            this.bio.setText(info);
            
            ArrayList<User> users = User.loadUsers();
            
            for (User user : users) {
                if (user.getUsername().equals(this.user.getUsername())) {
                    user.getProfile().setBio(info);
                }
            }
            
            User.saveUsers(users);
        } else {
            System.out.println("No input provided or dialog was canceled.");
        }
    }//GEN-LAST:event_changeBio

    private void editProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProfileButtonActionPerformed
if(this.changepassword==null)
    this.changepassword=new changePassword(this.user);
this.changepassword.setVisible(true);

    }//GEN-LAST:event_editProfileButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfilePage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bio;
    private javax.swing.JLabel coverPhoto;
    private javax.swing.JButton editProfileButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel profilePhoto;
    // End of variables declaration//GEN-END:variables

}
