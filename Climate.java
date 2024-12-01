/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package climateapp;

import java.io.Serializable;

/**
 * @author Linru Wang
 */
public class Climate implements Serializable {

    protected String message;  // The message to be displayed
    protected String userName; // User's name
    protected String phoneNumber; // User's phone number
    protected int activityLevel; // User's activity level

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

    // Getter for userName
    public String getUserName() {
        return userName;
    }

    // Getter for phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Getter for activityLevel
    public int getActivityLevel() {
        return activityLevel;
    }

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
