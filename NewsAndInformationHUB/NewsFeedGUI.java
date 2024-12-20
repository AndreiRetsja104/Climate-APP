/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NewsAndInformationHUB;

import java.util.List;
import java.awt.BorderLayout;
import javax.swing.*;

public class NewsFeedGUI extends javax.swing.JInternalFrame {
    private JTabbedPane mainFrame;
    private JList<String> articleJL, shortsJL;
    private NewsFeed newsFeed;

    /**
     * Creates new form NewsFeedGUI
     */
    public NewsFeedGUI() {
        this.newsFeed = new NewsFeed(); // Initialize newsFeed with sample data
        initComponents();
        setupTabs();
        refreshContent();
    }

    public NewsFeedGUI(NewsFeed newsFeed) {
        this.newsFeed = newsFeed;
        initComponents();
        setupTabs();
        refreshContent();
    }

    private void setupTabs() {
        mainFrame = new JTabbedPane();

        // Initialize each JList
        articleJL = new JList<>();
        videoJL = new JList<>();
        researchJL = new JList<>();
        shortsJL = new JList<>();

        // Add each JList in a JScrollPane directly to mainFrame only once
        mainFrame.addTab("Article List", new JScrollPane(articleJL));
        mainFrame.addTab("Video List", new JScrollPane(videoJL));
        mainFrame.addTab("Research List", new JScrollPane(researchJL));
        mainFrame.addTab("Shorts List", new JScrollPane(shortsJL));

        // Set layout and add main frame to GUI
        setLayout(new BorderLayout());
        add(mainFrame, BorderLayout.CENTER);
    }

    public void displayArticles(List<String> articles) {
        articleJL.setListData(articles.toArray(new String[0]));
    }

    public void displayVideos(List<String> videos) {
        videoJL.setListData(videos.toArray(new String[0]));
    }

    public void displayShorts(List<String> shorts) {
        shortsJL.setListData(shorts.toArray(new String[0]));
    }

    public void displayResearch(List<String> research) {
        researchJL.setListData(research.toArray(new String[0]));
    }

    public void refreshContent() {
        List<String> articles = newsFeed.getLatestArticles();
        displayArticles(articles);

        List<String> videos = newsFeed.getLatestVideos();
        displayVideos(videos);

        List<String> shorts = newsFeed.getLatestShorts();
        displayShorts(shorts);

        List<String> research = newsFeed.getLatestResearch();
        displayResearch(research);
    }
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        MainFrame = new javax.swing.JTabbedPane();
        videoListTab = new javax.swing.JTabbedPane();
        ScrollPane1 = new javax.swing.JScrollPane();
        videoJL = new javax.swing.JList<>();
        researchListTab = new javax.swing.JTabbedPane();
        ScrollPane2 = new javax.swing.JScrollPane();
        researchJL = new javax.swing.JList<>();
        articleListTab = new javax.swing.JTabbedPane();
        ScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(840, 540));

        videoJL.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ScrollPane1.setViewportView(videoJL);

        videoListTab.addTab("tab1", ScrollPane1);

        MainFrame.addTab("VideoList", videoListTab);

        researchJL.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ScrollPane2.setViewportView(researchJL);

        researchListTab.addTab("tab1", ScrollPane2);

        MainFrame.addTab("ResearchList", researchListTab);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ScrollPane3.setViewportView(jList1);

        articleListTab.addTab("tab1", ScrollPane3);

        MainFrame.addTab("ArticleList", articleListTab);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(MainFrame, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(NewsFeedGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewsFeedGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewsFeedGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewsFeedGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewsFeed newsFeed = new NewsFeed();  // Create a NewsFeed object
                new NewsFeedGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane MainFrame;
    private javax.swing.JScrollPane ScrollPane1;
    private javax.swing.JScrollPane ScrollPane2;
    private javax.swing.JScrollPane ScrollPane3;
    private javax.swing.JTabbedPane articleListTab;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JList<String> researchJL;
    private javax.swing.JTabbedPane researchListTab;
    private javax.swing.JList<String> videoJL;
    private javax.swing.JTabbedPane videoListTab;
    // End of variables declaration//GEN-END:variables
}
