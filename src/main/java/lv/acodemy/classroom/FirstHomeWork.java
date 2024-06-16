package lv.acodemy.classroom;

public class FirstHomeWork {
    public static void main(String[] args) {

        // Exercise 1: Java program that checks if a given number is positive. If it is, print "Positive number."

        int number = 6;
        System.out.println("Positive number.");

        // Exercise 2:

        int a = 18;
        System.out.println("Even number.");

        // Exercise 3:


        int age = 15;
        if (age < 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Adult");
        }


        //Exercise 4:

        int e = 68;
        if (e < 100 && e % 2 == 0) {
            System.out.println("Valid number.");
        } else {
            System.out.println("Invalid number");
        }

        //Exercise 5:

        int b = 18;
        if (b > 0) {
            if (b % 2 == 0) {
                System.out.println("Positive and Even");
            } else {
                System.out.println("Positive but Odd");
            }
        } else {
            System.out.println("Not Positive");
        }

        //Exercise 6:
        char ch = 'A';

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Not a vowel");
        }

        //Exercise 7:
        int mathScore = 95;
        int scienceScore = 78;
        int englishScore = 92;

        double totalScore = (mathScore + scienceScore + englishScore) / 3.0;
        char finalGrade;
        if (totalScore >= 90) {
            finalGrade = 'A';
        } else if (totalScore >= 80) {
            finalGrade = 'B';
        } else if (totalScore >= 70) {
            finalGrade = 'C';
        } else if (totalScore >= 60) {
            finalGrade = 'D';
        } else {
            finalGrade = 'F';
        }

        System.out.println("Final Grade: " + finalGrade);

        //Exercise 8:
        int weight = 55;
        double height = 1.64;

        double totalBMI = weight / (height * height);

        String finalBMI;

        if (totalBMI >= 30) {
            finalBMI = "Obesity";
        } else if (totalBMI >= 25 && totalBMI < 30) {
            finalBMI = "Overweight";
        } else if (totalBMI >= 18.5 && totalBMI < 25) {
            finalBMI = "Normal weight";
        } else if (totalBMI < 18.5) {
            finalBMI = "Underweight";
        } else {
            finalBMI = "Unknown";
        }

        System.out.println("BMI: " + totalBMI);
        System.out.println("BMI Category: " + finalBMI);
    }
}




