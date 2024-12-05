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
        return "Reducing your carbon footprint helps slow climate change, \n improves air quality, protects wildlife, mitigates disasters, \n and conserves resources.";
    }

    // Method to provide personalized tips based on user activity level
    public String getPersonalizedTips() {
        return "Tips: \n Try increasing your activity levels by walking, cycling, \n or using public transportation.";
    }
}
