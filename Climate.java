/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package climateapp;

import java.io.Serializable;

/**I edited my variables to camelcase 
 * @author Linru Wang
 */
public class Climate implements Serializable {

    protected String message;  
    protected String userName; 
    protected String phoneNumber; 
    protected int activityLevel; 

    // Constructor
    public Climate(String message, String userName, String phoneNumber, int activityLevel) {
        this.message = message;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.activityLevel = activityLevel;
    }

    // Getter for message
    public String getMessage() {
        return message;
    }

    // Method to display a general climate message
    public String getClimateMessage() {
        return "Hello " + userName + "! " + message + " Your activity level is " + activityLevel + ".";
    }

    // Getters
    public String getUserName() {
        return userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getActivityLevel() {
        return activityLevel;
    }
    //setters
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setActivityLevel(int activityLevel) {
        this.activityLevel = activityLevel;
    }

}
