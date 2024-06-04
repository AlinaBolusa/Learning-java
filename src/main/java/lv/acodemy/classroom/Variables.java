package lv.acodemy.classroom;

public class Variables {
    public static void main(String[] args) {
        // One - line comment

       /*
       Multi-line comment
       I can also write here
       */

        //Category: Integral
        // byte:
        byte smallNumber = 120;
        // RGB (Reb Green Blue)
        byte red = 120;
        byte green = 45;
        byte blue = 127;
        System.out.println(blue);

        //int (Integer)
        // Employee ID;
        int employeeId = 123456;

        // Population count:
        int populationOfLatvia = 1811956;
        System.out.println(populationOfLatvia);

        // short
        // Game Score:
        short yearOfBirth = 1990;

        //char (Character)
        // Grade:
        char grads = 'A';

        //Initials;
        char firstInitial = 'A';
        char lastInitial = 'B';

        //Long
        //Bank Account Balance

        long accountBalance = 1000000000L;
        System.out.println(accountBalance);

        //Java 7:
        //Improves readability
        long population = 1_000_000_000L; // 1 billion;

        //Avoiding mistake
        int creditCardNumber = 1234_567;

        //double
        //PI
        double piValue = Math.PI;
        System.out.println(piValue);

        //Another way
        double pi = 3.14_15_92;

        //Floating numbers:
        //Price:
        float price = 1_234_567_8998.98F;


        //double
        //financial Debt:
        double financialDebt = 23_459_455_234.67775;

        // Distance
        double distanceToSun = 149_765_987_4; // in km;

        // Boolean (true/false)
        //has or is prefixed
        boolean isSummer = false;
        boolean hasSon = false;

        // String (we can save here any text in double quotes)
        String firstName = "Alina";
        String lastName = "Bolusa";

        //var
        var myCurrentAge = 32;
        var myFullName = "Alina Bolusa";


        //Operators:
        //* -multiplication (6*8)
        // / - division (8/2)
        // + - addition (6+6)
        // - - subtraction (7-4)
        // ++ (+1)
        // -- (-1)
        // % (the remainder after dividing a by b)
        boolean evenNumber = 4 % 2 == 0; //true
        boolean oddNumber = 4 % 3 == 0; //false

        int remainderResult = 5 % 3;
        System.out.println(remainderResult);

        // Operators (simple example)
        int x = 10;
        int y = 20;
        int result = x + y;

        int a = 30;
        int b = 40;
        int anotherResult = a - b;

        int c = 10 + 20;


    }
}
