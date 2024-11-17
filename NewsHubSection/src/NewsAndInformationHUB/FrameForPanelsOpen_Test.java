



/// >>>  Maby we will use this panels frame in the future <<<<
/// >>>  At the moment we use simple Frame without hide and Visible function  <<<<<<<<<  




///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
// */
//package NewsAndInformationHUB;
//
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.BoxLayout;
//import javax.swing.JButton;
//import javax.swing.JPanel;
//
///**
// * Andrei Re.
// */
//public class FrameForPanelsOpen extends javax.swing.JFrame {
//    // Instances of various forms used in the application
//    QuizzGUI qg = new QuizzGUI();
//    UserProfileForm upf = new UserProfileForm();
//    NewsFeedGUI nf;
//    MainPageImage mpi = new MainPageImage();
//    DonationGUI dg = new DonationGUI();
//    private Object loggedInUserName;
//
//    /**
//     * Method to hide all buttons except a specified button.
//     */
//    private void hideAllButtonsExcept(JButton buttonToShow, JButton quizBtn, JButton newsFeedBtn, JButton donationBtn, JButton exitBtn) {
//        profilesBtn.setVisible(true);
//        quizBtn.setVisible(true);
//        newsFeedBtn.setVisible(true);
//        donationBtn.setVisible(true);
//        inOutBtn.setVisible(false);
//        exitBtn.setVisible(true);
//
//        // Show the specified button
//        buttonToShow.setVisible(true);
//    }
//
//    /**
//     * Method to show appropriate buttons based on the login status.
//     */
//    private void showAppropriateButtons(boolean isLoggedIn) {
//        if (loggedInUserName != null) {
//            profilesBtn.setVisible(true);
//            quizBtn.setVisible(true);
//            newsFeedBtn.setVisible(true);
//            donationBtn.setVisible(false);
//            exitBtn.setVisible(true);
//            inOutBtn.setVisible(true); // Hide Sign In button
//        } else {
//            inOutBtn.setVisible(false);
//            profilesBtn.setVisible(true);
//            quizBtn.setVisible(true);
//            newsFeedBtn.setVisible(false);
//            donationBtn.setVisible(false);
//            exitBtn.setVisible(true);
//        }
//    }
//
//    /**
//     * Creates new form FrameForPanelsOpen
//     */
//    public FrameForPanelsOpen() {
//        this.nf = new NewsFeedGUI();
//        initComponents();
//        setLocationRelativeTo(null);
//
//        // Initially, show only the Sign In button
//        hideAllButtonsExcept(profilesBtn, quizBtn, newsFeedBtn, donationBtn, exitBtn);
//
//        desktopPanel.add(mpi).setVisible(true);
//        try {
//            mpi.setSelected(true);
//        } catch (java.beans.PropertyVetoException e) {
//            System.out.println(e);
//        }
//
//        desktopPanel.repaint();
//    }
//
//    /**
//     * This method is called from within the constructor to initialize the form.
//     */
//    @SuppressWarnings("unchecked")
//    private void initComponents() {
//        desktopPanel = new javax.swing.JDesktopPane();
//        profilesBtn = new javax.swing.JButton("Profiles");
//        quizBtn = new javax.swing.JButton("Quiz");
//        newsFeedBtn = new javax.swing.JButton("NewsFeed");
//        donationBtn = new javax.swing.JButton("Donation");
//        exitBtn = new javax.swing.JButton("Exit");
//        inOutBtn = new javax.swing.JButton("Sign In");
//
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//
//        desktopPanel.setBackground(new java.awt.Color(255, 255, 0));
//        desktopPanel.setLayout(new java.awt.BorderLayout());
//
//        // Add action listeners for buttons
//        profilesBtn.addActionListener(evt -> profilesBtnActionPerformed(evt));
//        quizBtn.addActionListener(evt -> quizBtnActionPerformed(evt));
//        newsFeedBtn.addActionListener(evt -> newsFeedBtnActionPerformed(evt));
//        donationBtn.addActionListener(evt -> donationBtnActionPerformed(evt));
//        exitBtn.addActionListener(evt -> exitBtnActionPerformed(evt));
//        inOutBtn.addActionListener(evt -> inOutBtnActionPerformed(evt));
//
//        // Create a panel for buttons with vertical layout
//        JPanel buttonPanel = new JPanel();
//        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
//        buttonPanel.add(profilesBtn);
//        buttonPanel.add(quizBtn);
//        buttonPanel.add(newsFeedBtn);
//        buttonPanel.add(donationBtn);
//        buttonPanel.add(inOutBtn);
//        buttonPanel.add(exitBtn);
//
//        // Add button panel to the left and desktop panel to the center
//        getContentPane().setLayout(new java.awt.BorderLayout());
//        getContentPane().add(buttonPanel, java.awt.BorderLayout.WEST);
//        getContentPane().add(desktopPanel, java.awt.BorderLayout.CENTER);
//
//        pack();
//    }
//
//    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {
//        System.exit(0);
//    }
//
//    private void profilesBtnActionPerformed(java.awt.event.ActionEvent evt) {
//        try {
//            UserProfileFormGUI upf = new UserProfileFormGUI();
//            upf.setVisible(true);
//            this.setVisible(false);
//            mpi.setSelected(true);
//        } catch (java.beans.PropertyVetoException e) {
//            System.out.println(e);
//            desktopPanel.repaint();
//            desktopPanel.revalidate();
//        }
//        desktopPanel.repaint();
//    }
//
//    private void quizBtnActionPerformed(java.awt.event.ActionEvent evt) {
//        try {
//            QuizzGUI quizGUI = new QuizzGUI();
//            quizGUI.setVisible(true);
//            this.setVisible(false);
//            mpi.setSelected(true);
//        } catch (java.beans.PropertyVetoException e) {
//            System.out.println(e);
//            desktopPanel.repaint();
//            desktopPanel.revalidate();
//        }
//        desktopPanel.repaint();
//    }
//
//    private void newsFeedBtnActionPerformed(java.awt.event.ActionEvent evt) {
//        if (desktopPanel.getSelectedFrame() != nf) {
//            desktopPanel.removeAll();
//            desktopPanel.add(nf).setVisible(true);
//            try {
//                nf.setSelected(true);
//            } catch (java.beans.PropertyVetoException e) {
//                System.out.println(e);
//            }
//            desktopPanel.repaint();
//            desktopPanel.revalidate();
//        }
//    }
//
//    private void donationBtnActionPerformed(java.awt.event.ActionEvent evt) {
//        try {
//            DonationGUI donationGUI = new DonationGUI();
//            donationGUI.setVisible(true);
//            this.setVisible(false);
//            mpi.setSelected(true);
//        } catch (java.beans.PropertyVetoException e) {
//            System.out.println(e);
//        }
//    }
//
//    private void inOutBtnActionPerformed(java.awt.event.ActionEvent evt) {
//        try {
//            MainPageImage mpi = new MainPageImage();
//            mpi.setVisible(true);
//            this.setVisible(false);
//            mpi.setSelected(true);
//        } catch (java.beans.PropertyVetoException e) {
//            System.out.println(e);
//        }
//    }
//
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(() -> new FrameForPanelsOpen().setVisible(true));
//    }
//
//    private javax.swing.JDesktopPane desktopPanel;
//    private javax.swing.JButton profilesBtn;
//    private javax.swing.JButton quizBtn;
//    private javax.swing.JButton newsFeedBtn;
//    private javax.swing.JButton donationBtn;
//    private javax.swing.JButton exitBtn;
//    private javax.swing.JButton inOutBtn;
//}