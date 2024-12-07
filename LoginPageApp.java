/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package profilesection;

/**
 *
 * @author seang
 */
public class LoginPageApp {

    public static void main(String[] args) {
        System.out.println("Application started...");
        java.awt.EventQueue.invokeLater(() -> {
            try {
                System.out.println("Showing main frame...");
                new FrameForPanels().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}