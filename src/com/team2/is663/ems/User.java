package com.team2.is663.ems;


/**
 *
 * @author toyknight
 */
public class User implements java.io.Serializable {
    
    private final String username;
    private String password;
    private boolean is_doctor;
    private boolean is_assistant;
    private boolean is_pharmacist;
    private boolean is_manager;
    
    public User(String username) {
        this.username = username;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setDoctor(boolean b) {
        this.is_doctor = b;
    }
    
    public boolean isDoctor() {
        return is_doctor;
    }
    
    public void setLabAssistant(boolean b) {
        this.is_assistant = b;
    }
    
    public boolean isLabAssistant() {
        return is_assistant;
    }
    
    public void setPharmacist(boolean b) {
        this.is_pharmacist = b;
    }
    
    public boolean isPharmacist() {
        return is_pharmacist;
    }
    
    public void setManager(boolean b) {
        this.is_manager = b;
    }
    
    public boolean isManager() {
        return is_manager;
    }
    
}
