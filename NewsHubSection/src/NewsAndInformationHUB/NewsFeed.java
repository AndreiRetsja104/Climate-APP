/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewsAndInformationHUB;

import java.util.ArrayList;
import java.util.List;
/**
  *NewsFeed class provides methods to fetch the latest articles, videos, shorts, and research papers.
 * each method returns a list of relevant items as sample data.
 * this class data provider for news, videos, shorts, and research.
 *  each method can be displayed in a GUI.
 * @author arets
 */
public class NewsFeed {
       //  data for articles List. 
    public List<String> getLatestArticles() {
        List<String> articles = new ArrayList<>();
        articles.add("Article 1: Latest News in AI");
        articles.add("Article 2: Advances in Quantum Computing");
        articles.add("Article 3: Climate Change Updates");
      //  System.out.println("Fetched articles: " + articles);  // Debug statement
        return articles;
    }
        //  data for videos List. 
    public List<String> getLatestVideos() {
        List<String> videos = new ArrayList<>();
        videos.add("Video 1: AI and Machine Learning");
        videos.add("Video 2: Understanding Quantum Physics");
        videos.add("Video 3: The Future of Renewable Energy");
      //  System.out.println("Displaying videos: " + videos);  // Debug statement
        return videos;
    }

    public List<String> getLatestShorts() {
        //  data for shorts videos List. 
        List<String> shorts = new ArrayList<>();
        shorts.add("Shorts Video 1");
        shorts.add("Shorts Video 2");
        shorts.add("Shorts Video 3");
        shorts.add("Shorts Video 4");
        return shorts;
    }
     //  data for research paper titles to the list.
    public List<String> getLatestResearch() {
        List<String> research = new ArrayList<>();
        research.add("Research Paper 1: AI in Healthcare");
        research.add("Research Paper 2: Quantum Algorithms");
        research.add("Research Paper 3: Sustainable Energy Solutions");
       // System.out.println("Displaying research: " + research);   // Debug statement
        return research;
    }

}
