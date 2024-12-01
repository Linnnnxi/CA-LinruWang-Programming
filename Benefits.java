/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package climateapp;

/**
 *
 * @author Linru Wang
 */
public class Benefits extends Climate {

    // Constructor
    public Benefits(String message, String userName, String phoneNumber, int activityLevel) {    
        super(message, userName, phoneNumber, activityLevel);
    }

    // Method to provide general benefits of reducing carbon footprint
    public String getGeneralBenefits() {
        return "Reducing your carbon footprint helps slow climate change, improves air quality, protects wildlife, mitigates disasters, and conserves resources.";
    }

    // Method to provide personalized tips based on user activity level
    public String getPersonalizedTips() {
        // Return personalized tips based on activity level
        if (activityLevel <= 3) {
            return "Tips: Try increasing your activity levels by walking, cycling, or using public transportation.";
        } else if (activityLevel <= 7) {
            return "Tips: Consider using energy-efficient appliances, reducing waste, and making sustainable choices.";
        } else {
            return "Tips: Excellent! Keep reducing emissions with eco-friendly choices, and consider planting trees or using renewable energy.";
        }
    }
}
