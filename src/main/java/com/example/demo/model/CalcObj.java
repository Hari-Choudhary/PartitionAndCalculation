package com.example.demo.model;

import lombok.Setter;

@Setter
public class CalcObj {

    private int positiveCount;
    private int negativeCount;

    public void incrementPositiveCount() {
        this.setPositiveCount(++this.positiveCount);
    }

    public void incrementNegativeCount() {
        this.setNegativeCount(++this.negativeCount);
    }
}
