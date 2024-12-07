/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package profilesection;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author seang
 */
public class UserManager {
    
      private List<Profile> profiles;
    private final String filePath = "user_profiles.txt"; // File path for saving profiles

    public UserManager() {
        profiles = new ArrayList<>();
        loadProfiles();
    }

    public void addUser(Profile profile) {
        profiles.add(profile);
        saveProfiles();
    }

    public Profile authenticate(String username, String password) {
        for (Profile profile : profiles) {
            if (profile.getUsername().equals(username) && profile.getPassword().equals(password)) {
                return profile;
            }
        }
        return null;
    }

    private void saveProfiles() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(profiles);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadProfiles() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            profiles = (List<Profile>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}