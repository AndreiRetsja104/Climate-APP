/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewsAndInformationHUB;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arets
 */
public class NewsFeed {
    
    public List<String> getLatestArticles() {
        List<String> articles = new ArrayList<>();
        articles.add("Article 1: Latest News in AI");
        articles.add("Article 2: Advances in Quantum Computing");
        articles.add("Article 3: Climate Change Updates");
        System.out.println("Fetched articles: " + articles);  // Debug statement
        return articles;
    }

    public List<String> getLatestVideos() {
        List<String> videos = new ArrayList<>();
        videos.add("Video 1: AI and Machine Learning");
        videos.add("Video 2: Understanding Quantum Physics");
        videos.add("Video 3: The Future of Renewable Energy");
        System.out.println("Displaying videos: " + videos);  // Debug statement
        return videos;
    }

    public List<String> getLatestResearch() {
        List<String> research = new ArrayList<>();
        research.add("Research Paper 1: AI in Healthcare");
        research.add("Research Paper 2: Quantum Algorithms");
        research.add("Research Paper 3: Sustainable Energy Solutions");
        System.out.println("Displaying research: " + research);   // Debug statement
        return research;
    }

    void setSelected(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
