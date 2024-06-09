package lv.acodemy.classroom;

public class PlayWithStatements {
    public static void main(String[] args) {

        // If / (if-else) / if-else-if statements

        /*
        if (condition) {
            // code to be executed
        }
         */

        // Exercise 1: if a > 5 => System.out.println("This is true!");
        int a = 10;
        if (a > 5) {
            System.out.println("This is true!");
        }

        // Exercise 2: Write a program that will check if variable y is even
        int y = 12;
        if (y % 2 == 0) {
            System.out.println("y is an even number");
        }

        // Exercise 3: Write a program that will check if the number is equal to 50
        int b = 50;
        if (b == 50) {
            System.out.println("b is equal to 50");
        }

        // Comparison operators: >, <, <=, >=, ==, !=
        if (b != y) {
            System.out.println("b is not equal to y");
        }

        // Boolean -> is or has (prefix)
        boolean isSummer = true;
        if (isSummer) {
            System.out.println("It's time to go on vacation!");
        }

        // IF/ELSE

        /*
        if (condition) {
            // will execute code if statement is true
        } else {
            // will execute code if statement is false
        }
         */

        // Exercise 4: Write a program that will check if a number is positive
        int z = 10;
        if (z >= 0) {
            System.out.println("Z is a positive number");
        } else {
            System.out.println("Z is a negative number");
        }

        // Exercise 5: If name equals John, then print out - "We found John!" or variable contains name
        String name = "Mary";
        if (name.equals("John")) {
            System.out.println("We found John!");
        } else {
            System.out.println("Variable contains name: " + name);
        }

        // IF - ELSE - IF - ELSE

        /*
        if (condition1) {
            // if condition1 is true => this code block will be executed
        } else if (condition2) {
            // if condition2 is true => this code block will be executed
        } else {
            // if no condition is true => this code block will be executed
        }
         */

        // Exercise 6: Write a program that will check if variable > 10, check variable == 10, and all other cases as less than 10
        int e = 12;
        if (e > 10) {
            System.out.println("Variable is more than 10");
        } else if (e == 10) {
            System.out.println("Variable is equal to 10");
        } else {
            System.out.println("Variable is less than 10");
        }

        // Exercise 7: Create an array with numbers, iterate through it and check if the number is positive, negative, or equal to 0
        int[] numbers = {10, -5, 0, 25, -30, 15, -10, 5, -20};
        for (int number : numbers) {
            if (number > 0) {
                System.out.printf("Number: %d is a positive number\n", number);
            } else if (number < 0) {
                System.out.printf("Number: %d is a negative number\n", number);
            } else {
                System.out.printf("Number: %d is equal to 0\n", number);
            }
        }

        // Exercise 8: Grades classification - excellent (90-100) / good (75-89) / OK (50-74) / NOK (0-49)
        int[] grades = {95, 82, 74, 56, 48, 91, 87, 66, 77, 45};
        for (int grade : grades) {
            if (grade >= 90 && grade <= 100) {
                System.out.printf("Grade %d is Excellent\n", grade);
            } else if (grade >= 75 && grade <= 89) {
                System.out.printf("Grade %d is Good\n", grade);
            } else if (grade >= 50 && grade <= 74) {
                System.out.printf("Grade %d is OK\n", grade);
            } else if (grade >= 0 && grade <= 49) {
                System.out.printf("Grade %d is NOK\n", grade);
            }
        }

        // Exercise 9: Temperature classifier
        // (Temperature < -10 (Holodno) / from 0 to 10 (Prohladno) /
        // from 10 to 20 (Teplo) /
        // from 20 to 30 (Zharko) / > 30 - Ochen zharko)

        int[] temperatures = {-5, 12, 18, 8, 21, 29, 30, 1, 45, 9};
        for (int temperature : temperatures) {
            if (temperature > 30) {
                System.out.printf("Temperature %d is Ochen zharko\n", temperature);
            } else if (temperature > 20) {
                System.out.printf("Temperature %d is Zharko\n", temperature);
            } else if (temperature > 10) {
                System.out.printf("Temperature %d is Teplo\n", temperature);
            } else if (temperature > 0) {
                System.out.printf("Temperature %d is Prohladno\n", temperature);
            } else {
                System.out.printf("Temperature %d is Holodno\n", temperature);
            }
        }
    }
}
