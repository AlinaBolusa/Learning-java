package lv.acodemy.classroom;

public class PlayWithString {
    public static void main(String[] args) {

        String name = "Alina";
        String surName = "Bolusa";

        // My name is: Alina Bolusa

        String myText = "My name is: " + name + " " + surName;

        // Concatenation
        System.out.println(myText);
        System.out.println("My name is: " + name + " " + surName);

        //Interpolation
        // %s - for text
        // %d - for numeric values

        String interpolation = String.format("My name is: %s %s", name, surName);
        System.out.println(interpolation);
        System.out.printf(String.format("My name is: %s %s", name, surName));

        // Exercise
        String firstName = "Alina";
        String lastName = "Bolusa";
        int age = 32;
        String city = "Riga";

        System.out.println(firstName + " " + lastName);
        // John Doe is 25 years old and lives in New York.

        System.out.println(firstName + " " + lastName + " is " + age + " years old and lives in " + city);
        System.out.println(String.format("%s %s is %d years old and lives in %s", firstName, lastName, age, city));
        ;


    }
}
