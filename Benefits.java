/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package climateapp;

import java.util.Random;

/**
 * added random message
 * @author Linru Wang
 */
public class Benefits extends Climate {
   
    private String[] generalBenefitsArray = {
        "Reducing your carbon footprint slows climate change.",
        "Improves air quality and overall health.",
        "Protects wildlife and biodiversity.",
        "Mitigates the effects of natural disasters.",
        "Conserves valuable resources for future generations.",
        "Reducing industrial and agricultural emissions prevents water contamination and preserves freshwater sources.",
        "Collective efforts to reduce emissions foster international collaboration toward sustainability goals."
    };

    private String[] personalizedTipsArray = {
        "Try walking or cycling instead of driving.",
        "Use public transportation whenever possible.",
        "Reduce energy usage at home by turning off unused lights.",
        "Switch to renewable energy sources like solar panels.",
        "Participate in local clean-up events.",
        "Buy locally-produced goods to minimize transportation-related emissions and reduce packaging waste.",
        "Properly recycling materials and composting organic waste helps reduce methane emissions from landfills."
    };

    // Constructor
    public Benefits(String message, String userName, String phoneNumber, int activityLevel) {
        super(message, userName, phoneNumber, activityLevel);
    }

    // Method to provide a random general benefit
    public String getRandomGeneralBenefit() {
        Random random = new Random();
        return generalBenefitsArray[random.nextInt(generalBenefitsArray.length)];
    }

    // Method to provide a random personalized tip
    public String getRandomPersonalizedTip() {
        Random random = new Random();
        return personalizedTipsArray[random.nextInt(personalizedTipsArray.length)];
    }
}
