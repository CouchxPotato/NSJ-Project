package com.costcalculator;

class InputParameters extends Main{ /*this is a child class of the Main class which stores all the variables for the
    program and the getters and setters of each variable
    declaring the input parameters which will be used to store the input taken from the user
    */
    private static String name;
    private static float weight;
    private static String trainingPlan;
    private static int weightCategory;
    private static float privateCoaching;
    private static int competitionsEntered;

    /*defining all the getters and setters of the variables we defined above in order to protect the data.
     this is why another name for getters and setters is access mutators.
     */
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setWeight(float weight){
        this.weight = weight;
    }
    public float getWeight(){
        return this.weight;
    }
    public void setTrainingPlan(String trainingPlan){
        this.trainingPlan = trainingPlan;
    }
    public String getTrainingPlan(){
        return this.trainingPlan;
    }
    public void setWeightCategory(int weightCategory){
        this.weightCategory = weightCategory;
    }
    public int getWeightCategory(){
        return this.weightCategory;
    }
    public void setPrivateCoaching(float privateCoaching){
        this.privateCoaching = privateCoaching;
    }
    public float getPrivateCoaching(){
        return this.privateCoaching;
    }
    public void setCompetitionsEntered(int competitionsEntered){
        this.competitionsEntered = competitionsEntered;
    }
    public int getCompetitionsEntered(){
        return this.competitionsEntered;
    }
}