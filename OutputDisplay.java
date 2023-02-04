package com.costcalculator;

import java.util.Scanner;

class OutputDisplay extends Main {
    static String v;
/*
All the statements which are responsible for displaying the output to the user are written here under the Output method under the
child class OutputDisplay.
 */
    public static void output() {
        System.out.println("\nPlease check the details you have entered in the registration form: " +
                "\n Name: " + i.getName() + "\n Training Plan: " + i.getTrainingPlan() + "\n Weight (in kg): " + i.getWeight() +
                        "\n Weight Category: " + i.getWeightCategory() +
                "\n Private coaching hours needed: " + i.getPrivateCoaching() + "\n Number of competitions entered this month: "
                + i.getCompetitionsEntered());
            System.out.println("\nAre the details correct? [Y/N]: ");
            v = scan.next();
            if (v.equals("Y")) {
                System.out.println("\nYour registration is complete! Thank You for registering with NSJ!");
                System.out.println();
                System.out.println("\nFollowing are the calculations done based on the details you have entered: ");
                w.weightCalculation();
                t.trainCost();
            } else if(v.equals("N")) {
                //if the user feels that they have entered the wrong details, they can re-fill the form
                System.out.println("\nPlease fill out the form again.");
                u.userIn();
            }else{
                System.out.println("\n Please enter a valid response. If you have entered Y or N, please check the case of the " +
                        "response you have entered.");
            }
        }
    }
