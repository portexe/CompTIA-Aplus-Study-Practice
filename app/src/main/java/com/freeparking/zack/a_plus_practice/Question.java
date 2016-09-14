package com.freeparking.zack.a_plus_practice;

public class Question {

    public Question(String questionText, String answerText, String category, Boolean isStruggling) {
        this.questionText = questionText;
        this.answerText = answerText;
        this.category = category;
        this.isStruggling = isStruggling;
    }

    String questionText;
    String answerText;
    String category;
    boolean isStruggling;
    long startTimeViewing;
    long endTimeViewing;
    double averageTimeSpentOnQuestion;


    public long getStartTimeViewing() {
        return startTimeViewing;
    }

    public void setStartTimeViewing(long startTimeViewing) {
        this.startTimeViewing = startTimeViewing;
    }

    public long getEndTimeViewing() {
        return endTimeViewing;
    }

    public void setEndTimeViewing(long endTimeViewing) {
        this.endTimeViewing = endTimeViewing;
    }

    public double getAverageTimeSpentOnQuestion() {
        return averageTimeSpentOnQuestion;
    }

    public void setAverageTimeSpentOnQuestion(double averageTimeSpentOnQuestion) {
        this.averageTimeSpentOnQuestion = averageTimeSpentOnQuestion;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public boolean isStruggling() {
        return isStruggling;
    }

    public void setStruggling(boolean struggling) {
        isStruggling = struggling;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
