package com.costcalculator;

import java.util.ArrayList;
import java.lang.String;

class TrainingCostCalculation extends Main {
    /*
    All the calculations regarding the cost of training is done under the TrainCost method under the child class. This method will calculate
    all the cost and display it to the user, i.e., total cost as well as the itemised list of all the things separately.
     */
     public static void trainCost(){
         ArrayList<String> details = new ArrayList<String>();
         float trainCostpm;
         switch(i.getTrainingPlan()) {
             case "1":
                 trainCostpm = 25.00f * 4f;
                 details.add("\nTraining Cost fee: $" + String.valueOf(trainCostpm));
                 break;
             case "2":
                 trainCostpm = 30.00f * 4f;
                 details.add("\nTraining Cost fee: $" + String.valueOf(trainCostpm));
                 break;
             case "3":
                 trainCostpm = 35.00f * 4f;
                 details.add("\nTraining Cost fee: $" + String.valueOf(trainCostpm));
                 break;
         }
         float privcoach = i.getPrivateCoaching() * 9.00f;
         details.add("\nPrivate coaching hours fee per week: $" + String.valueOf(privcoach));
         float compientered = i.getCompetitionsEntered() * 22.00f;
         details.add("\nCompetition fee: $" + String.valueOf(compientered));
         System.out.println("\nThe itemized list of the cost per month is: " + details);
         if(i.getTrainingPlan().equals("1")){
             float beg = 25.00f * 4 + i.getPrivateCoaching() * 4 * 9.00f;
             System.out.println("The total cost of your training per month is: $" + beg);
         } else if (i.getTrainingPlan().equals("2")) {
             float inter = 30.00f * 4 + i.getPrivateCoaching() * 4 * 9.00f + i.getCompetitionsEntered() * 22.00f;
             System.out.println("The total cost of your training per month is: $" + inter);
         }else if (i.getTrainingPlan().equals("3")) {
             float elite = 35.00f * 4 + i.getPrivateCoaching() * 4 * 9.00f + i.getCompetitionsEntered() * 22.00f;
             System.out.println("The total cost of your training per month is: $" + elite);
         }
     }
}