package com.example.circularmarket;

public class Question {
    public String quesName;
    public Choice choice1;
    public Choice choice2;
    public Question(String quesName, String mchoice1, String mchoice2) {
        this.quesName = quesName;
        this.choice1 = new Choice(mchoice1);
        this.choice2 = new Choice(mchoice2);
    }
}
