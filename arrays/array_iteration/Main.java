package com.example;

public class Main {
    public static double calculateAverage(int[] workHours) {
        int sizeMassive = 0;
        int totalHours = 0;

        for (int i = 0; i < workHours.length; i++) {
            sizeMassive = i;
            System.out.println(sizeMassive);
        }
        
        totalHours = totalHours/sizeMassive;

        return totalHours;
    }
    
    public static void main(String[] args) {
        int[] workHours = {7, 8, 6, 9, 7, 7, 8, 7, 6, 9};
        double average = calculateAverage(workHours);

        if (average < 8) {
            System.out.println("Penalty: employee worked " + average + " hours on average.");
        } else {
            System.out.println("Good job! Employee worked " + average + " on average.");
        }
    }
}
