/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package climateapp;

/**
 *
 * @author Linru Wang
 */
public class CarbonTracker extends Climate {

    private double totalEmissions; // Tracks the total calculated emissions

    // Constructor
    public CarbonTracker(String message, String userName, String phoneNumber, int activityLevel) {
        super(message, userName, phoneNumber, activityLevel);
        this.totalEmissions = 0.0; // Initialize total emissions to zero
    }

    // Method to calculate emissions based on user activity level
    public double calculateEmissions(int activityLevel) {
        this.totalEmissions = activityLevel * 6.5; // an example
        return totalEmissions;
    }

    // Getter for totalEmissions
    public double getTotalEmissions() {
        return totalEmissions;
    }
}
   
