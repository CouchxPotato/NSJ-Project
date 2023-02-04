/*
Program to make a registration system for North Sussex Judo and perform calculations on the data entered to calculate the total training
cost per month for each athlete
 */

package com.costcalculator;

import com.costcalculator.InputParameters;

import java.util.Scanner;

public class Main { //this is the client class because it has the main method
    static Scanner scan = new Scanner(System.in); //creating a scanner object which will be used to take input from the user
    static InputParameters i = new InputParameters(); //creating an object for the child class which has all the input parameters.
    static UserInput u = new UserInput(); //creating an object for the child class which has all the statements to take input from the users.
    static WeightCalculation w = new WeightCalculation(); //creating an object for the child class which has all the weight related calculations
    static TrainingCostCalculation t = new TrainingCostCalculation(); //creating an object for the child class which has all the calculation related to training cost
    static OutputDisplay o = new OutputDisplay(); //creating and object for the child class which contains all the statements which will display the output on the console
    public static void main(String[] args) {
        u.userIn(); //calling the method which has statements to take the method inputs
        o.output(); //calling the method which has all the statements to display output on the console
    }
}
