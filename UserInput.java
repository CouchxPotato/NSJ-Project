package com.costcalculator;

import com.costcalculator.Main;

import java.util.regex.Pattern;

//child class of the client class which stores all the methods and statements which will be responsible for taking input from the user
class UserInput extends Main {
    static String x;
    static String y;

    public static void userIn() {

        System.out.println("              Welcome to North Sussex Judo               ");
        System.out.println("\nPlease enter the following details in order to complete your registration.");

        /*
        //using while loop in order to prompt the print message again if the
        user has entered an invalid response. while is used throughout the code to deal with invalid responses
         */

        while (true) {
            scan.nextLine();
            System.out.print("Enter your name: ");
            i.setName(scan.nextLine());
        /*
        /using regular expressions to check if the name entered by the user is valid or not, i.e.,
        checking if it contains any special symbols or numbers in it. if it does, it will be considered invalid
         */

            String regex = "([a-zA-z]+)(\s[a-zA-Z]+)*";
            Pattern pattern = Pattern.compile(regex);
            if (i.getName().matches(regex)) {
                System.out.println("Greetings " + i.getName() + "!!");
                break;
            } else {
                System.out.println("Please enter a valid name.");
            }
        }
        /*
        taking input of weight from the user. if they enter negative value or 0, the program will ask them to enter a valid response
         */
        while (true) {
            System.out.print("\nEnter your weight in kg: ");
            i.setWeight(scan.nextFloat());
            if (i.getWeight() <= 0) {
                System.out.println("\nPlease enter a valid response.");
            } else {
                break;
            }
        }
/*
printing the training plan menu to the user and asking them to choose the training plan they would like to enrol in. if they enter a number other
than the number of training plans available, program will ask them to enter the valid response
 */

        while (true) {
            System.out.print("\nWe have the following training plans, please enter the number of the plan you would like to choose: " +
                    "\n 1. Beginner (2 sessions per week) – weekly fee = $25.00 \n 2. Intermediate (3 sessions per week) – weekly fee = $30.00 " +
                    "\n 3. Elite (5 sessions per week) – weekly fee =  $35.00 \n\n NOTE: We also host competitions for the athletes " +
                    "of Intermediate and Elite training plans. \n\n Please enter the number of training plan you would like to enroll for: ");
            i.setTrainingPlan(scan.next());
            String regex = "(1|2|3)";
            Pattern pattern = Pattern.compile(regex);
            if (i.getTrainingPlan().matches(regex)) {
                break;
            } else {
                System.out.println("\nPlease enter a valid training plan number.");
            }
        }
        /*
        if the user chooses intermediate or elite training plan, they will be asked if they wish to participate in the competitions
         */
        if (i.getTrainingPlan().equals("2") || i.getTrainingPlan().equals("3")) {
            while (true) {
                System.out.print("\nCompetition fee is $22.0 per competition. " +
                        "\nWould you like to enter in any competitions? [Y/N]: ");
                y = scan.next();
                String regex = "[Y|N]"; //using regular expressions to check for a valid response by defining all the possible valid responses
                Pattern pattern = Pattern.compile(regex);
                if (y.matches(regex)) {
                    break;
                } else {
                    System.out.println("\nPlease enter a valid response. If you have entered Y or N, please check the case of the " +
                            "response you have entered. ");
                }
            }
/*
printing the weight categories for the competitions and asking user to choose one category to enrol for.
 */

            if (y.equals("Y")) {
                while (true) {
                    System.out.print("\nFollowing are the weight categories for the competition: " +
                            "\nCategories                 Upper Weight Limit (Kg)" +
                            "\n1. Heavyweight                Unlimited(over 100)" +
                            "\n2. Light-Heavyweight          100" +
                            "\n3. Middleweight               90" +
                            "\n4. Light-middleweight         81" +
                            "\n5. Lightweight                73" +
                            "\n6. Flyweight                  66" +
                            "\n\nNOTE: Competitions are held on the Second Saturday of each month." +
                            "\n\nPlease enter the number of weight category you would like to enrol for: ");
                    i.setWeightCategory(scan.nextInt());
                    String regex = "[1|2|3|4|5|6]"; //using regular expressions to check for a valid response by defining all the possible valid responses
                    Pattern pattern = Pattern.compile(regex);
                    if (String.valueOf(i.getWeightCategory()).matches(regex)) {
                        /*
                        Asking user to enter the number of competitions they would like to enter in for this month. If they are beginner,
                        the number of competitions will be set to 0.
                         */
                        while(true) {
                            if (i.getTrainingPlan().equals("1")) {
                                i.setCompetitionsEntered(0);
                            } else if (i.getTrainingPlan().equals("2") || i.getTrainingPlan().equals("3")) {
                                System.out.print("\nEnter the number of competitions you would like to enter this month: ");
                                i.setCompetitionsEntered(scan.nextInt());
                                break;
                            } else {
                                break;
                            }
                        }
                        break;
                    } else {
                        System.out.println("\nPlease enter a valid response.");
                    }
                }

            }
        } else if (i.getTrainingPlan().equals("3")) {
            while (true) {
                System.out.print("\nFollowing are the weight categories for the competition: " +
                        "\nCategories                 Upper Weight Limit (Kg)" +
                        "\n1. Heavyweight                Unlimited(over 100)" +
                        "\n2. Light-Heavyweight          100" +
                        "\n3. Middleweight               90" +
                        "\n4. Light-middleweight         81" +
                        "\n5. Lightweight                73" +
                        "\n6. Flyweight                  66" +
                        "\n\nNOTE: Competitions are held on the Second Saturday of each month." +
                        "\n\nPlease enter the number of weight category you would like to enrol for: ");
                i.setWeightCategory(scan.nextInt());
                String regex = "[1|2|3|4|5|6]"; //using regular expressions to check for a valid response by defining all the possible valid responses
                Pattern pattern = Pattern.compile(regex);
                if (String.valueOf(i.getWeightCategory()).matches(regex)) {
                    while(true) {
                        if (i.getTrainingPlan().equals("1")) {
                            i.setCompetitionsEntered(0);
                        } else if (i.getTrainingPlan().equals("2") || i.getTrainingPlan().equals("3")) {
                            System.out.print("\nEnter the number of competitions you would like to enter this month: ");
                            i.setCompetitionsEntered(scan.nextInt());
                        } else {
                            break;
                        }
                    }
                    break;
                } else {
                    System.out.println("\nPlease enter a valid response.");
                }
            }
        }
        while (true) {
            /*
            asking the user if they want to get some private coaching along with the training to get better results,
             */
            System.out.print("\nWe also offer private coaching service. \n Private coaching costs $9.00 per hour. " +
                    "\n\n NOTE: You can receive only 5 hours of private coaching per week. \n Would you like to receive private coaching? [Y/N]: ");
            x = scan.next();
            if (x.equals("Y")) {
                while (true) {
                    System.out.print("\nEnter the number of hours of private coaching you need per week: ");
                    i.setPrivateCoaching(scan.nextFloat());
                    if (i.getPrivateCoaching() > 5) {
                        System.out.println("\nPlease enter a valid response.");
                    } else {
                        break;
                    }
                }
                break;
            }else if(x.equals("N")){
                i.setPrivateCoaching(0);
                break;
            }
            else {
                System.out.println("\nPlease enter a valid response. If you have entered Y or N, please check the case of the " +
                        "response you have entered. ");
            }
        }
    }
}