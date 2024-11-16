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
public class EducationModule {
    
    private String currentModule;
    private String currentQuizQuestion;

    private List<String> availableModules = Arrays.asList(
            "Module 1: Introduction to Climate Change", 
            "Module 2: Impacts of Global Warnings",
            "Module 3: Renewable Energy Sources"  // Corrected spelling
    );
    
    
    public EducationModule() {
        // Initialize with some default module and quiz
        this.currentModule = "Module 1: Introduction to Climate Change";
    }

    public List<String> getAvailableModules() {
        return availableModules;
    }

    public String getCurrentModule() {
        return currentModule;
    }

    public void submitAnswers(String answer) {
        // Here, you could add logic to save or evaluate answers
        System.out.println("Submitted answer: " + answer);
        // In a real app, you might send this to a database or API
    }
}
