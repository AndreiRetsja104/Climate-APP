/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NewsAndInformationHUB;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 * Main Frame to switch between different panels (QuizzGUI, DonationGUI, etc.)
 */
public class FrameForPanelsOpen extends javax.swing.JFrame {
    // Instances of different GUI components
    private QuizzGUI quizz;
    private DonationGUI donation;
    private NewsFeedGUI newsFeed;
    private MainPageImage mainPageImage;

    public FrameForPanelsOpen() {
        initComponents();
        initCustomComponents();
        setLocationRelativeTo(null);  // Center the frame on the screen

        // Initially show only the MainPageImage (login screen or default view)
        showFrame(mainPageImage);
    }

    private void initCustomComponents() {
        // Initialize internal frames
        quizz = new QuizzGUI();
        donation = new DonationGUI();
        newsFeed = new NewsFeedGUI();
        mainPageImage = new MainPageImage();

        // Add all frames to desktopPanel, but set them invisible initially
        desktopPanel.add(quizz);
        desktopPanel.add(donation);
        desktopPanel.add(newsFeed);
        desktopPanel.add(mainPageImage);

        // Set up button actions
        profilesBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                showFrame(mainPageImage);
            }
        });
        
        messagesBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                showFrame(donation);
            }

            
        });

        newsFeedBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                showFrame(newsFeed);
            }

           
        });

        groupsBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                showFrame(quizz);
            }

           
        });

        exitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                System.exit(0);  // Exit the application
            }
        });
    }

    // Method to display only one internal frame at a time
    private void showFrame(javax.swing.JInternalFrame frameToShow) {
        // Set all frames invisible
        quizz.setVisible(false);
        donation.setVisible(false);
        newsFeed.setVisible(false);
        mainPageImage.setVisible(false);

        // Set the desired frame visible
        frameToShow.setVisible(true);
        try {
            frameToShow.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
            Logger.getLogger(FrameForPanelsOpen.class.getName()).log(Level.SEVERE, null, e);
        }

        desktopPanel.repaint();
        desktopPanel.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPanel = new javax.swing.JDesktopPane();
        profilesBtn = new javax.swing.JButton();
        messagesBtn = new javax.swing.JButton();
        newsFeedBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        groupsBtn = new javax.swing.JButton();
        inOutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPanel.setBackground(new java.awt.Color(255, 255, 255));
        desktopPanel.setLayout(new java.awt.BorderLayout());

        profilesBtn.setText("Profiles");

        messagesBtn.setText("Donation");

        newsFeedBtn.setText("NewsFeed");

        exitBtn.setText("Exit");

        groupsBtn.setText("Quiz");

        inOutBtn.setText("Sign In");

        // Layout settings
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profilesBtn)
                    .addComponent(messagesBtn)
                    .addComponent(newsFeedBtn)
                    .addComponent(groupsBtn)
                    .addComponent(exitBtn)
                    .addComponent(inOutBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPanel)
            .addGroup(layout.createSequentialGroup()
                .addComponent(profilesBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messagesBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newsFeedBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(groupsBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(inOutBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FrameForPanelsOpen().setVisible(true));
    }

    // Variables declaration
    private javax.swing.JDesktopPane desktopPanel;
    private javax.swing.JButton profilesBtn;
    private javax.swing.JButton messagesBtn;
    private javax.swing.JButton newsFeedBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton groupsBtn;
    private javax.swing.JButton inOutBtn;
    // End of variables declaration//GEN-END:variables
}