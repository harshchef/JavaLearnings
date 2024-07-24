package com.example.storage_service_dbms.juUintsample;

public class MathSum {

    public int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
