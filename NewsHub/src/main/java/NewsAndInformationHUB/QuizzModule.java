/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewsAndInformationHUB;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

/**
 *
 * @author arets
 */
public class QuizzModule {
    private List<Quiz> quizzes;
    private int currentQuestionIndex;
    private int timeRemaining;
    private Timer timer;
      
    public QuizzModule(ArrayList<Quiz> quizzes) {
        this.quizzes = quizzes;
        this.currentQuestionIndex = 0;
        this.timeRemaining = 10;
    }

    // Returns the current quiz question being displayed
    public Quiz getCurrentQuiz() {
        return quizzes.get(currentQuestionIndex);
    }

    // Checks if the selected answer is correct
    public boolean checkAnswer(int answerIndex) {
        return quizzes.get(currentQuestionIndex).getCorrectAnswerIndex() == answerIndex;
    }

    // Moves to the next question in the quiz list
    public void moveToNextQuestion() {
        currentQuestionIndex++;
    }

    // Checks if there are more questions left in the quiz
    public boolean hasNextQuestion() {
        return currentQuestionIndex < quizzes.size();
    }

    // Getter for the current question index
    public int getCurrentQuestionIndex() {
        return currentQuestionIndex;
    }

    // Starts a timer for the quiz, calling onTimeOut when time runs out
    public void startTimer(Runnable onTimeOut) {
        // Logic to start the timer, reducing timeRemaining and calling onTimeOut.run() when time is up
    }

    // Stops the timer if it's running
    public void stopTimer() {
        if (timer != null) {
            timer.cancel();
        }
    }

    // Getter for the remaining time
    public int getTimeRemaining() {
        return timeRemaining;
    }
    
    // Sets up a list of available quizzes (for example purposes)
    public ArrayList<String> getAvailableQuizzes() {
        ArrayList<String> availableQuizzes = new ArrayList<>();
        availableQuizzes.add("Quiz 1: Basic Concepts of Climate Change");
        availableQuizzes.add("Quiz 2: Advanced Topics on Global Warnings");
        availableQuizzes.add("Quiz 3: Renewable Energy Technologies");
        return availableQuizzes;
    }

        public Result displayQuiz(int quizID) {
        // this function is Display the quiz and calculate a result
        int score = 0; // Example score
        int totalQuestions = quizzes.size(); // Quizzes is the list of questions
        

        // Display the quiz or calculate results as needed
        return new Result(score, totalQuestions);
    }
    
    // Updates the quiz (additional functionality can be implemented here)
    public void updateQuiz() {
        // Implementation to update quiz
    }

    // Submits an answer to the quiz (additional functionality can be implemented here)
    public void submitAnswers(String answer) {
        System.out.println("Submitted answer: " + answer);
        // In a real app, logic to save or evaluate answers could go here
    }
}