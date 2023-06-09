package com.dinocodeacademy.projectlevelquiz.model;

public class Questions {


    // Now define the constant for the Category

    public static final String CATEGORY_COMPUTERS = "Computers";
    public static final String CATEGORY_ENGLISH = "English";
    public static final String CATEGORY_HISTORY = "History";
    public static final String CATEGORY_MOTIVATION = "Motivation";
    public static final String CATEGORY_DIGIMARKE = "DigitalMarketing";

    public static final int LEVEL1 = 1;
    public static final int LEVEL2 = 2;
    public static final int LEVEL3 = 3;

    // Now define the contant for the Levles

    private int id;
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private int answerNr;
    private String category;
    private int levels;

    public Questions(){

    }

    public Questions(String question, String option1, String option2, String option3, String option4,
                     int answerNr,String category,int levels) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answerNr = answerNr;
        this.category = category;
        this.levels = levels;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public int getAnswerNr() {
        return answerNr;
    }

    public void setAnswerNr(int answerNr) {
        this.answerNr = answerNr;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

}
