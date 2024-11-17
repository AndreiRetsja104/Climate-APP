/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NewsAndInformationHUB;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 * Main Frame that switches between different panels (QuizzGUI, DonationGUI, etc.)
 */
public class FrameForPanels extends javax.swing.JFrame {
    // Instances of different GUI components
    private QuizzGUI quizzGUI ;
    private DonationGUI donationGUI;
    private NewsFeedGUI newsFeedGUI;
    private MainPageImage mainPageImage;

    public FrameForPanels() {
        initComponents();
        initCustomComponents();
        setLocationRelativeTo(null);  // Center the frame on the screen

        // Initially show only the MainPageImage (login screen or default view)
        showFrame(mainPageImage);
    }

    private void initCustomComponents() {
        // Initialize internal frames
        quizzGUI = new QuizzGUI();
        donationGUI = new DonationGUI();
        newsFeedGUI = new NewsFeedGUI();
        mainPageImage = new MainPageImage();

        // Add all frames to desktopPanel, but set them invisible initially
        desktopPanel.add(quizzGUI);
        desktopPanel.add(donationGUI);
        desktopPanel.add(newsFeedGUI);
        desktopPanel.add(mainPageImage);

        // Set up button actions
        profilesBtn.addActionListener(evt -> showFrame(mainPageImage));
        donationBtn.addActionListener(evt -> showFrame(donationGUI));
        newsFeedBtn.addActionListener(evt -> showFrame(newsFeedGUI));
        quizzBtn.addActionListener(evt -> showFrame(quizzGUI));
        exitBtn.addActionListener(evt -> System.exit(0));  // Exit the application
    }

    // Method to display only one internal frame at a time
    private void showFrame(javax.swing.JInternalFrame frameToShow) {
        // Set all frames invisible
        quizzGUI.setVisible(false);
        donationGUI.setVisible(false);
        newsFeedGUI.setVisible(false);
        mainPageImage.setVisible(false);

        // Set the desired frame visible
        frameToShow.setVisible(true);
        try {
            frameToShow.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
            Logger.getLogger(FrameForPanels.class.getName()).log(Level.SEVERE, null, e);
        }

        desktopPanel.repaint();
        desktopPanel.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPanel = new javax.swing.JDesktopPane();
        profilesBtn = new javax.swing.JButton();
        donationBtn = new javax.swing.JButton();
        newsFeedBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        quizzBtn = new javax.swing.JButton();
        inOutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPanel.setBackground(new java.awt.Color(255, 255, 0));
        desktopPanel.setLayout(new java.awt.BorderLayout());

        profilesBtn.setText("Profiles");
        donationBtn.setText("Donation");
        newsFeedBtn.setText("NewsFeed");
        exitBtn.setText("Exit");
        quizzBtn.setText("Quiz");
        inOutBtn.setText("Sign In");

        // Layout settings
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profilesBtn)
                    .addComponent(donationBtn)
                    .addComponent(newsFeedBtn)
                    .addComponent(quizzBtn)
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
                .addComponent(donationBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newsFeedBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quizzBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(inOutBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FrameForPanels().setVisible(true));
    }

    // Variables declaration
    private javax.swing.JDesktopPane desktopPanel;
    private javax.swing.JButton profilesBtn;
    private javax.swing.JButton donationBtn;
    private javax.swing.JButton newsFeedBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton quizzBtn;
    private javax.swing.JButton inOutBtn;
    // End of variables declaration//GEN-END:variables
}