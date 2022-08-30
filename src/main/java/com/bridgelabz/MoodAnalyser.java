package com.bridgelabz;

public class MoodAnalyser {
    public MoodAnalyser() {}
    private String message;

    public String analyseMood() {
            if (this.message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
    }
}
