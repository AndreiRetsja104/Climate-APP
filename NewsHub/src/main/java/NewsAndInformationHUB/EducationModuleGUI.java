/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NewsAndInformationHUB;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 *
 * @author arets
 */
public class EducationModuleGUI extends javax.swing.JFrame {

    private EducationModule educationModule;
    private QuizzeModule quizzeModule;
    /**
     * Creates new form EducationalModuleGUI
     */
    public EducationModuleGUI(EducationModule educationModule) {
        this.educationModule = educationModule;
        this.quizzeModule = quizzeModule;
        initComponents();
        loadInitialData();
    }

//        private void initComponents() {
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//        setTitle("Educational Modules");
//        setSize(500, 400);
//        setLocationRelativeTo(null);
//
//        JTabbedPane tabbedPane = new JTabbedPane();
//        
//                // Module List and its Scroll Pane
//        JList<String> moduleList = new JList<>();
//        JScrollPane moduleScrollPane = new JScrollPane(moduleList);
//        tabbedPane.addTab("Modules", moduleScrollPane);
//        
//        // Quiz List and its Scroll Pane
//        JList<String> quizList = new JList<>();
//        JScrollPane quizScrollPane = new JScrollPane(quizList);
//        tabbedPane.addTab("Quizzes", quizScrollPane);
//        
//        
//        // Description Area and its Scroll Pane
//        JTextArea moduleDescription = new JTextArea(10, 40);
//        moduleDescription.setEditable(false);
//        JScrollPane descriptionScrollPane = new JScrollPane(moduleDescription);
//        tabbedPane.addTab("Description", descriptionScrollPane);
//                String selectedModule = moduleList.getSelectedValue();
//
//        // Event Listener for Module List
//        moduleList.addListSelectionListener(e -> {
//            if (!moduleList.isSelectionEmpty()) {
//                moduleDescription.setText("Detailed information about " + selectedModule);
//            }
//        });
//
//        // Adding the tabbed pane to the JFrame
//        add(tabbedPane);
//
//        pack(); // Pack the components
//    }

    private void loadInitialData() {
        JList<String> moduleList = findComponentByName(this, "moduleList");
        JList<String> quizList = findComponentByName(this, "quizList");
        if (moduleList != null && quizList != null) {
            moduleList.setListData(educationModule.getAvailableModules().toArray(new String[0]));
            quizList.setListData(QuizzeModule.getModuleQuizzes().toArray(new String[0]));
        }
    }

    // Utility method to find a component by name
    public static <T extends Component> T findComponentByName(Container container, String componentName) {
        for (Component component : container.getComponents()) {
            if (componentName.equals(component.getName())) {
                return (T) component;
            }
            if (component instanceof Container) {
                T child = findComponentByName((Container) component, componentName);
                if (child != null) {
                    return child;
                }
            }
        }
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        moduleScrollPane = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        quizScrollPane = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        descriptionScrollPane = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        moduleScrollPane.setToolTipText("");
        moduleScrollPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        moduleScrollPane.addTab("tab1", jScrollPane1);

        tabbedPane.addTab("Modules", moduleScrollPane);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList2);

        quizScrollPane.addTab("tab1", jScrollPane3);

        tabbedPane.addTab("Quizzes", quizScrollPane);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        descriptionScrollPane.addTab("tab1", jScrollPane2);

        tabbedPane.addTab("Description", descriptionScrollPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(EducationModuleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EducationModuleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EducationModuleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EducationModuleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        SwingUtilities.invokeLater(() -> {
            EducationModule educationModule = new EducationModule();
            new EducationModuleGUI(educationModule).setVisible(true);
         });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane descriptionScrollPane;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTabbedPane moduleScrollPane;
    private javax.swing.JTabbedPane quizScrollPane;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
