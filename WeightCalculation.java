package com.costcalculator;
class WeightCalculation extends Main {
    /*
    Performing the weight calculations under the WeightCalculation method created under a child lass of the same name.
    Depending on the weight of the user and weight category they enrol for, calculation on how much max and min weight they will have to lose or gain.
     */
    public static void weightCalculation() {
        if (i.getWeight() >= 66 && i.getWeightCategory() == 6) {
            float a = i.getWeight() - 66;
            System.out.println("\nIn order to be eligible for the flyweight category, you will have to lose a minimum of " + a + " kg.");
        } else if (i.getWeight() >= 73 && i.getWeightCategory() == 5) {
            float b = i.getWeight() - 73;
            System.out.println("\nIn order to be eligible for the lightweight category, you will have to lose a minimum of " + b + " kg.");
        } else if (i.getWeight() >= 81 && i.getWeightCategory() == 4) {
            float c = i.getWeight() - 81;
            System.out.println("\nIn order to be eligible for the light-middleweight category, you will have to lose a minimum of " + c + " kg.");
        } else if (i.getWeight() >= 90 && i.getWeightCategory() == 3) {
            float d = i.getWeight() - 90;
            System.out.println("\nIn order to be eligible for the middleweight category, you will have to lose a minimum of " + d + " kg.");
        } else if (i.getWeight() >= 100 && i.getWeightCategory() == 2) {
            float e = i.getWeight() - 100;
            System.out.println("\nIn order to be eligible for the light-heavyweight category, you will have to lose a minimum of " + e + " kg.");
        } else if (i.getWeight() >= 100 && i.getWeightCategory() == 1) {
            System.out.println("\nYou are eligible for the heavyweight category.");
        }else if(i.getWeight()<=73 && i.getWeightCategory() == 5){
            float f = 73 - i.getWeight();
            System.out.println("\nIn order to be eligible for the lightweight category, you will have to gain a maximum of " + f + " kg.");
        }else if(i.getWeight()<=81 && i.getWeightCategory() == 4){
            float g = 81 - i.getWeight();
            System.out.println("\nIn order to be eligible for the light-middleweight category, you will have to gain a maximum of " + g + " kg.");
        }else if(i.getWeight()<=90 && i.getWeightCategory() == 3){
            float h = 90 - i.getWeight();
            System.out.println("\nIn order to be eligible for the middleweight category, you will have to gain a maximum of " + h + " kg.");
        }else if(i.getWeight()<=100 && i.getWeightCategory() == 2){
            float j = 100 - i.getWeight();
            System.out.println("\nIn order to be eligible for the light-heavyweight category, you will have to gain a maximum of " + j + " kg.");
        }
    }
}