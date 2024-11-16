/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewsAndInformationHUB;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author arets
 */
public class Donation {
    
    public List<String> getNGOChoices() {
        // Directly return a list of NGOs using Arrays.asList
        return Arrays.asList("Save the Children", "Red Cross", "World Wildlife Fund", "Doctors Without Borders");
    }

    public void submitDonation(String name, String phone, String email, double amount, String ngo) {
        // Logic to process the donation
        System.out.println("Donation Details:");
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Amount: $" + amount);
        System.out.println("NGO: " + ngo);
        System.out.println("Donation submitted to " + ngo + " by " + name + " for amount $" + amount);
        
        // In a real application, this data might be sent to a server or saved in a database
        System.out.println("Donation submitted successfully!");
    }
    
}
